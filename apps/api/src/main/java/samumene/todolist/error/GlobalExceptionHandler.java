package samumene.todolist.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import samumene.todolist.dto.response.ExceptionResponse;

import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

/**
 * Classe que intercepta as exceções e retorna em respostas HTTP
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * Metodo que constrói o DTO com o erro vindo da exceção.
     *
     * @param message Mensagem do erro.
     * @param statusCode Código HTTP do erro.
     * @return Retorna uma DTO com os dados da exceção.
     */
    private ExceptionResponse responseError(String message, HttpStatus statusCode) {
        return new ExceptionResponse(
                LocalDateTime.now(),
                statusCode.toString(),
                statusCode.value(),
                message
        );
    }
    /**
     * Devolve uma resposta HTTP para o quando um recurso não é encontrado.
     * @param e Exceção
     */
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ExceptionResponse> noSuchElement(NoSuchElementException e) {
        ExceptionResponse erro = this.responseError(e.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
    }
    /**
     * Devolve uma resposta HTTP para o quando a requisição é inválida.
     * @param e Exceção
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionResponse> illegalArgument(IllegalArgumentException e) {
        ExceptionResponse erro = this.responseError(e.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
    }
    /**
     * Devolve uma resposta HTTP para o quando um parametro de DTO de requisição é invalidado.
     * @param e Exceção
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> methodArgumentNotValid(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(
                this.responseError(e.getBindingResult().getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST),
                HttpStatus.BAD_REQUEST);
    }

    // Security

    /**
     * Devolve uma resposta HTTP para o quando o token de acesso do usuário não é encontrado no
     * cabeçalho da requisição.
     */
    @ExceptionHandler(AuthenticationCredentialsNotFoundException.class)
    public ResponseEntity<ExceptionResponse> authNotFound() {
        return new ResponseEntity<>(this.responseError("Não autenticado", HttpStatus.FORBIDDEN), HttpStatus.FORBIDDEN);
    }
    /**
     * Devolve uma resposta HTTP para o quando o token do usuário não é mais válido (expirado).
     */
    @ExceptionHandler(InsufficientAuthenticationException.class)
    public ResponseEntity<ExceptionResponse> InsufficientAuth() {
        return new ResponseEntity<>(this.responseError("Autenticação insuficiente", HttpStatus.FORBIDDEN), HttpStatus.FORBIDDEN);
    }
    /**
     * Devolve uma resposta HTTP para o quando um token é encontrado, mas é inválido.
     */
    @ExceptionHandler(AuthenticationNotSupportedException.class)
    public ResponseEntity<ExceptionResponse> authNotSupported() {
        return new ResponseEntity<>(this.responseError("Autenticação inválida", HttpStatus.UNAUTHORIZED), HttpStatus.UNAUTHORIZED);
    }
    /**
     * Devolve uma resposta HTTP para o quando ocorre um erro genérico de autenticação.
     */
    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ExceptionResponse> auth() {
        return new ResponseEntity<>(this.responseError("Não permitido", HttpStatus.FORBIDDEN), HttpStatus.FORBIDDEN);
    }
    /**
     * Devolve uma resposta HTTP para o usuário não é autorizado à alguma ação no sistema.
     */
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ExceptionResponse> accessDenied() {
        return new ResponseEntity<>(this.responseError("Acesso negado", HttpStatus.UNAUTHORIZED), HttpStatus.UNAUTHORIZED);
    }
}
