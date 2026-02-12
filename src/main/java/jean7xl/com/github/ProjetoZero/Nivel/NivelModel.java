package jean7xl.com.github.ProjetoZero.Nivel;
import jakarta.persistence.*;
import jean7xl.com.github.ProjetoZero.Usuario.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_nivel")
public class NivelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dificuldade;

    private String descricao;

        @OneToMany(mappedBy = "nivel")
        private List<NinjaModel> ninjas;

}
