package TaosBackend.Taos.Modelo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.lang.Nullable;
import javax.persistence.*;


@Entity
@Table(name = "usuario")
@ToString
@EqualsAndHashCode
public class Usuario {
    @Id
    @Getter
    @Setter
    @Column(name = "identificacion")
    private Long identificacion;

    @Getter
    @Setter
    @Nullable
    @Column(name = "nombres")
    private String nombres;

    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;

    @Getter
    @Setter
    @Column(name = "placa")
    private String placa;


    public void obetnerNombreUsuario(String token) {



    }


}
