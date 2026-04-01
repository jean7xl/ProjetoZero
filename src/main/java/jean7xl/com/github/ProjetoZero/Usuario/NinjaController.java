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
    public NinjaModel criarNinja( @RequestBody NinjaModel ninja) {
        return usuarioService.criarNinja(ninja);
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

   @DeleteMapping("/deletar/{id}")
    public void deletarPorID(@PathVariable Long id) {
         usuarioService.deletarNinjaPorId(id);
   }

}
