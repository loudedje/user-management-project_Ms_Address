package ms.address.user_management.service;
import ms.address.user_management.models.AddressModel;
import ms.address.user_management.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressModel saveAddress(AddressModel address) {
        return addressRepository.save(address);
    }

}

