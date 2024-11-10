package pe.com.braulio.S2_ManriqueBraulio.wsSoap.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Medico")
public class Medico {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idmedico;
    private String nommedico;
    private String apemedico;
    private Date fechnacmedico;
}
