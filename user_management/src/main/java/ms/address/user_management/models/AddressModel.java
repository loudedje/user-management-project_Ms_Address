package ms.address.user_management.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Entity
@ToString
@Table(name="address")
public class AddressModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;

    private String logradouro;

    private String complemento;
    private String bairro;

    private String localidade;

    private String uf;





}

