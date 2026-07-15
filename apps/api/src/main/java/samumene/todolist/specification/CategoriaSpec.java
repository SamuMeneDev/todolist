package samumene.todolist.specification;

import org.springframework.data.jpa.domain.Specification;
import samumene.todolist.entity.Categoria;
import samumene.todolist.entity.Usuario;
import samumene.todolist.enumeration.StatusCategoria;

import javax.swing.*;
import java.util.Objects;

public class CategoriaSpec {

    public static Specification<Categoria> usuarioEquals(Usuario usuario) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(
                root.join("usuario").get("id"), usuario.getId()
        );
    }

    public static Specification<Categoria> statusEquals(String status) {
        return (root, query, criteriaBuilder) -> {
            if(Objects.isNull(status)) {
                return null;
            } else {
                return criteriaBuilder.equal(root.get("status"), StatusCategoria.valueOf(status));
            }
        };
    }
}
