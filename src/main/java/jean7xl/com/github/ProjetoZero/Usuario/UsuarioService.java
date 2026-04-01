package jean7xl.com.github.ProjetoZero.Usuario;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private NinjaRepository ninjaRepository;
    public UsuarioService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel listarPorId(Long id) {
        Optional<NinjaModel>ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
    public NinjaModel criarNinja(NinjaModel ninjaModel) {
        return ninjaRepository.save(ninjaModel);
    }
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }



}
