package curso.java10x.CadastroDeNinjas.Missoes;

import curso.java10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
