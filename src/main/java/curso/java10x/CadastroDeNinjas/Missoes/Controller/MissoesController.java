package curso.java10x.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET - Mandar uma requisição para MOSTRAR as missões
    @GetMapping("/listar")
    public String listarMissao() {
        return "Missões listadas!";
    }

    // POST - Mandar uma requisição para CRIAR as missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada!";
    }

    // PUT - Mandar uma requisição para ALTERAR as missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada!";
    }

    // DELETE - Mandar uma requisição para DELETAR as missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada!";
    }
}
