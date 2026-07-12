package samumene.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samumene.todolist.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
