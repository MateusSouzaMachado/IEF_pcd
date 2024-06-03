package repository;

import com.example.pcd.models.usuario.Acesso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessoRepository extends JpaRepository<Acesso,Long> {
}
