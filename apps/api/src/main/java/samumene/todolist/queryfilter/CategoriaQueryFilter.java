package samumene.todolist.queryfilter;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;
import samumene.todolist.entity.Categoria;

import static samumene.todolist.specification.CategoriaSpec.statusEquals;

@Getter @Setter
public class CategoriaQueryFilter {

    private String status;

    public Specification<Categoria> getSpecification() {
        return statusEquals(status);
    }
}
