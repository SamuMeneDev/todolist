package samumene.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.todolist.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
