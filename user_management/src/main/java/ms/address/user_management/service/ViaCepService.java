package ms.address.user_management.service;

import ms.address.user_management.models.AddressModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    public AddressModel getAddressByZipCode(String zipCode) {
        String viaCepUrl = "https://viacep.com.br/ws/" + zipCode + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(viaCepUrl, AddressModel.class);
    }
}
