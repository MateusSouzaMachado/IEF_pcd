package repository;

import com.example.pcd.models.localizacao.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro,Long> {
}
