package jean7xl.com.github.ProjetoZero.Nivel;
import jakarta.persistence.*;
import jean7xl.com.github.ProjetoZero.Usuario.NinjaModel;

import java.awt.*;
import java.util.List;


@Entity
@Table(name = "tb_nivel")
public class NivelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String dificuldade;
    private String descricao;

        @OneToMany(mappedBy = "nivel")
        private List<NinjaModel> ninjas;



    public NivelModel() {
    }
    public NivelModel(String nome, String email, int idade) {}

    public long getId() {
        return id;
    }


    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
