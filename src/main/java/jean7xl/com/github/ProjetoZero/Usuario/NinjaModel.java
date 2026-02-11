package jean7xl.com.github.ProjetoZero.Usuario;
import jakarta.persistence.*;
import jean7xl.com.github.ProjetoZero.Nivel.NivelModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //
    @ManyToOne
    @JoinColumn(name = "nivel_id")
    private NivelModel nivelModel;
    //
}


