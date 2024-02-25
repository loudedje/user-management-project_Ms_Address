package ms.address.user_management.repository;

import ms.address.user_management.models.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <AddressModel, Long>{

}
