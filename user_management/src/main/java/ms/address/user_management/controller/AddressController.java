package ms.address.user_management.controller;
import ms.address.user_management.models.AddressModel;
import ms.address.user_management.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<AddressModel> getAddressByCep(@PathVariable String cep) {
        try {
            AddressModel address = addressService.getAddressByCep(cep);
            return ResponseEntity.ok(address);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

