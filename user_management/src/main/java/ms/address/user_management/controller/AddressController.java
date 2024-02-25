package ms.address.user_management.controller;
import ms.address.user_management.models.AddressModel;
import ms.address.user_management.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public ResponseEntity<AddressModel> createAddress(@RequestBody AddressModel address) {
        AddressModel savedAddress = addressService.saveAddress(address);
        return ResponseEntity.ok(savedAddress);
    }

}
