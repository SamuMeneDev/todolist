package samumene.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.todolist.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
