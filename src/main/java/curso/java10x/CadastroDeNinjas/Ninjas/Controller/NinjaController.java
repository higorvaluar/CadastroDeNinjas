package curso.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota.";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado!";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String motrarTodosOsNinjas() {
        return "Mostrando todos os ninjas";
    }

    // Mostrar ninja por id (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Monstrando todos os ninjas por Id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaPorId() {
        return "Alterar ninja por id";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }
}
