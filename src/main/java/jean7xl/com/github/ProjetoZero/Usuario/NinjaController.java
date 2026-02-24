package jean7xl.com.github.ProjetoZero.Usuario;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas";
    }

    @PostMapping("/criar")
    public String criar() {
        return "Criando usuario ";
    }

    @GetMapping("/todos")
    public String todos() {
        return "Todos";
    }

    @GetMapping("/todosID")
    public String todosID() {
        return "TodosID";
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
