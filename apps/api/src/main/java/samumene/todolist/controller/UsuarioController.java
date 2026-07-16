package samumene.todolist.controller;


import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samumene.todolist.config.SecurityConfig;
import samumene.todolist.dto.request.usuario.UsuarioLoginRequest;
import samumene.todolist.dto.request.usuario.UsuarioRegisterRequest;
import samumene.todolist.dto.response.TokenResponse;
import samumene.todolist.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@SecurityRequirement(name = SecurityConfig.SECURITY)
@Tag(name = "Usuario Controller", description = "Controller de acesso e registro dos usuários")
public class UsuarioController {

    // Dependências
    private final UsuarioService usuarioService;

    // Injeção de dependência
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Métodos (Endpoints)
    /**
     * Endpoint para cadastro de um novo usuário.
     *
     * @param request Objeto de requisição.
     */

    @PostMapping("/register")
    @ApiResponses({
            @ApiResponse(useReturnTypeSchema = true, responseCode = "201"),
            @ApiResponse(description = "Erro de requisição.", responseCode = "400"),
            @ApiResponse(description = "Erro de falta de crendenciais.", responseCode = "403"),
    })
    public ResponseEntity<Void> register(@Valid @RequestBody UsuarioRegisterRequest request) {
        this.usuarioService.register(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    /**
     * Endpoint de login
     *
     * @param request Objeto de requisição.
     * @return Token do usuario.
     */
    @PostMapping("/login")
    @ApiResponses({
            @ApiResponse(useReturnTypeSchema = true, responseCode = "200"),
            @ApiResponse(description = "Erro de requisição.", responseCode = "400"),
            @ApiResponse(description = "Usuário não encontrado.", responseCode = "404"),
            @ApiResponse(description = "Erro de falta de crendenciais.", responseCode = "403"),
    })
    public ResponseEntity<TokenResponse> login(@RequestBody @Valid UsuarioLoginRequest request) {
        TokenResponse token = this.usuarioService.login(request);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}
