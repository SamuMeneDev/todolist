package samumene.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.todolist.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);

}
