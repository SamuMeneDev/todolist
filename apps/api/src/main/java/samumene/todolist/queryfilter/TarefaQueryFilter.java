package samumene.todolist.queryfilter;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;
import samumene.todolist.entity.Tarefa;
import samumene.todolist.entity.Usuario;

import java.time.LocalDateTime;

import static samumene.todolist.specification.TarefaSpec.*;

@Getter @Setter
public class TarefaQueryFilter {
    private String categoria;
    private String status;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dataInicio;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dataFim;
    private Usuario usuario;


    public Specification<Tarefa> getSpecification() {

        return usuarioEquals(usuario)
            .and(categoriaEquals(categoria))
            .and(statusEquals(status))
            .and(dataInicioStarts(dataInicio))
            .and(dataFimEnds(dataFim));
    }
}
