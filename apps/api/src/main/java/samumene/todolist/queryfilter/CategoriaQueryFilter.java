package samumene.todolist.queryfilter;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;
import samumene.todolist.entity.Categoria;
import samumene.todolist.entity.Usuario;

import static samumene.todolist.specification.CategoriaSpec.statusEquals;
import static samumene.todolist.specification.CategoriaSpec.usuarioEquals;

@Getter @Setter
public class CategoriaQueryFilter {

    private String status;
    private Usuario usuario;

    public Specification<Categoria> getSpecification() {
        return usuarioEquals(usuario)
                .and(statusEquals(status));
    }
}
