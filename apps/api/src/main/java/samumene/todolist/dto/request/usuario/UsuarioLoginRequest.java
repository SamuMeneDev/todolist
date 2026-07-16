package samumene.todolist.dto.request.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

/**
 * DTO de requisição para autênticar um usuário
 *
 * @param email Email do usuário.
 * @param senha Senha do usuário
 */
public record UsuarioLoginRequest(
        @Email(message = "Email inválido") String email,
        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres") String senha
) {}
