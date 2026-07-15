package samumene.todolist.dto.request.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioRegisterRequest(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @Email(message = "Insira um email válido")
        String email,

        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
        String senha
) {}
