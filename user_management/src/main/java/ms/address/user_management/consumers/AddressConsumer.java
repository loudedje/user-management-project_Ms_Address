package ms.address.user_management.consumers;

import com.fasterxml.jackson.databind.ObjectMapper;
import ms.address.user_management.constant.RabbitmqCons;
import ms.address.user_management.dto.AddressDTO;
import ms.address.user_management.models.AddressModel;
import ms.address.user_management.repository.AddressRepository;
import ms.address.user_management.service.ViaCepService;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AddressConsumer {
    @Autowired
    private ViaCepService viaCepService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AddressRepository addressRepository;

    @RabbitListener(queues = RabbitmqCons.FILA_ADDRESS)
    public void consumidor(Message message) {
        try {
            String jsonMessage = new String(message.getBody());
            AddressDTO addressDTO = objectMapper.readValue(jsonMessage, AddressDTO.class);
            AddressModel enderecoCompleto = viaCepService.addressModel(addressDTO.getCep());
            if (enderecoCompleto != null) {
                addressRepository.save(enderecoCompleto);
                System.out.println("Endereço salvo com sucesso: " + enderecoCompleto);
            } else {
                System.out.println("Não foi possível obter o endereço para o CEP: " + enderecoCompleto.getCep());
            }
        } catch (IOException e) {
            System.out.println("Erro ao processar mensagem: " + e.getMessage());
        }
    }



}
