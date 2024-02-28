package ms.address.user_management.service;

import ms.address.user_management.models.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AddressService {


        private final ViaCepService viaCepService;

        @Autowired
        public AddressService(ViaCepService viaCepService) {
            this.viaCepService = viaCepService;
        }

        public AddressModel getAddressByCep(String cep) throws IOException {
            return viaCepService.addressModel(cep);
        }

    }


