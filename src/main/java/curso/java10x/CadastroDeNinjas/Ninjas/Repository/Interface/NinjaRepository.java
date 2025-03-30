package curso.java10x.CadastroDeNinjas.Ninjas.Repository.Interface;

import curso.java10x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
