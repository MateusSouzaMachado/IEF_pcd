package repository;

import com.example.pcd.models.usuario.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NivelAcessoRepository extends JpaRepository<NivelAcesso,Long> {
}
