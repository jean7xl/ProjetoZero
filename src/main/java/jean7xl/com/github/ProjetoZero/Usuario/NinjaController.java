package jean7xl.com.github.ProjetoZero.Usuario;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private UsuarioService usuarioService;
    public NinjaController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas";
    }

    @PostMapping("/criar")
    public String criar() {
        return "Criando usuario ";
    }

    @GetMapping("/todos")
    public List<NinjaModel> todos() {
        return usuarioService.listarNinjas() ;
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarID( @PathVariable Long id) {
        return usuarioService.listarPorId(id);
    }

   @PutMapping("/alterarporID")
    public String alterarPorID() {
        return "Alterar por ID";
   }

   @DeleteMapping("/deletarporID")
    public String deletarPorID() {
        return "Deletar por ID";
   }


}
