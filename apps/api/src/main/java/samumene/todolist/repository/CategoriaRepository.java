package samumene.todolist.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import samumene.todolist.entity.Categoria;
import samumene.todolist.entity.Usuario;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>, JpaSpecificationExecutor<Categoria> {
    List<Categoria> findAllByUsuario(Usuario usuario, Specification<Categoria> spec);
}
