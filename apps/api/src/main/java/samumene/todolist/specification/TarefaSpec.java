package samumene.todolist.specification;


import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ObjectUtils;
import samumene.todolist.entity.Tarefa;
import samumene.todolist.entity.Usuario;
import samumene.todolist.enumeration.StatusTarefa;

import java.time.LocalDateTime;

public class TarefaSpec {

    public static Specification<Tarefa> usuarioEquals(Usuario usuario) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(
                root.join("usuario").get("id"), usuario.getId()
        );
    }

    public static Specification<Tarefa> categoriaEquals(String categoria) {
        return (root, query, criteriaBuilder) -> {
            if(ObjectUtils.isEmpty(categoria)) {
                return null;
            } else {
                return criteriaBuilder.equal(root.join("categoria").get("titulo"), categoria);
            }
        };
    }

    public static Specification<Tarefa> statusEquals(String status) {
        return (root, query, criteriaBuilder) -> {
            if(ObjectUtils.isEmpty(status)) {
                return null;
            } else {
                return criteriaBuilder.equal(root.join("status"), StatusTarefa.valueOf(status));
            }
        };
    }

    public static Specification<Tarefa> dataInicioStarts(LocalDateTime dataInicio) {
        return (root, query, criteriaBuilder) -> {
          if(ObjectUtils.isEmpty(dataInicio)) {
              return null;
          } else {
              return criteriaBuilder.greaterThanOrEqualTo(root.get("dataInicio"), dataInicio);
          }
        };
    }

    public static Specification<Tarefa> dataFimEnds(LocalDateTime dataFim) {
        return (root, query, criteriaBuilder) -> {
            if(ObjectUtils.isEmpty(dataFim)) {
                return null;
            } else {
                return criteriaBuilder.lessThanOrEqualTo(root.get("dataFim"), dataFim);
            }
        };
    }
}
