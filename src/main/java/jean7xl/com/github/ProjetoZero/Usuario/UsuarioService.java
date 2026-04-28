package jean7xl.com.github.ProjetoZero.Usuario;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
//INJECAO DE DEPENDENCIA

    private NinjaRepository ninjaRepository;
    private UsuarioMapper usuarioMapper;
    //
     //
    public UsuarioService(NinjaRepository ninjaRepository, UsuarioMapper usuarioMapper) {
        this.ninjaRepository = ninjaRepository;
       this.usuarioMapper = usuarioMapper;
    }
// MOSTRA TDS
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

//MOSTRA POR ID
    public NinjaModel listarPorId(Long id) {
        Optional<NinjaModel>ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
    // CRIANDO USUARIO
    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO) {
        NinjaModel usuario = usuarioMapper.map(usuarioDTO);
        usuario = ninjaRepository.save(usuario);
        return usuarioMapper.map(usuario);

    }
    //
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }
    //

    public NinjaModel atualizarNinja(NinjaModel ninjaAtualizado, Long id) {
       if (ninjaRepository.existsById(id)){
           ninjaAtualizado.setId(id);
        return  ninjaRepository.save(ninjaAtualizado);
       }
       return null;
    }



}
