package jean7xl.com.github.ProjetoZero.Usuario;

import jakarta.persistence.*;
import jean7xl.com.github.ProjetoZero.Nivel.NivelModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {


    private Long id;
    private String nome;
    private String imgUrl;
    private String email;
    private int idade;
    private  String rank ;
    private NivelModel nivelModel;

    //
}


