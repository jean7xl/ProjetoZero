package jean7xl.com.github.ProjetoZero.Nivel;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nivel")
public class NivelController {

    @GetMapping("/mostrarTodos")
    public String mostrarTodos(){
        return "Mostrar Todas os niveis";
    }

    @DeleteMapping("/deleteID")
    public String deletarPorID(){
        return "Deletar por ID";
    }
    @PutMapping("/atualizaId")
    public String atualizaPorID(){
        return "Atualiza por ID";
    }

    @PostMapping("/criarnivel")
    String criarNivel(){
        return "Cria um nivel";
    }

}
