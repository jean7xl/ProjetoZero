package jean7xl.com.github.ProjetoZero.Usuario;

import jean7xl.com.github.ProjetoZero.Nivel.NivelModel;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public NinjaModel map(UsuarioDTO usuarioDTO) {
        NinjaModel ninjaModel = new NinjaModel();

        ninjaModel.setId(usuarioDTO.getId());
        ninjaModel.setNome(usuarioDTO.getNome());
        ninjaModel.setEmail(usuarioDTO.getEmail());
        ninjaModel.setImgUrl(usuarioDTO.getImgUrl());
        ninjaModel.setRank(usuarioDTO.getRank());

        return ninjaModel;

    }
    public UsuarioDTO map(NinjaModel ninjaModel) {

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId(ninjaModel.getId());
        usuarioDTO.setNome(ninjaModel.getNome());
        usuarioDTO.setEmail(ninjaModel.getEmail());
        usuarioDTO.setImgUrl(ninjaModel.getImgUrl());
        usuarioDTO.setRank(ninjaModel.getRank());
        return usuarioDTO;

    }
}
