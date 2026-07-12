package samumene.todolist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import samumene.todolist.enumeration.StatusCategoria;

import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusCategoria status;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "categoria")
    private List<Tarefa> tarefas;

}
