package samumene.todolist.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import samumene.todolist.dto.request.UsuarioLoginRequest;
import samumene.todolist.dto.request.UsuarioRegisterRequest;
import samumene.todolist.entity.Usuario;
import samumene.todolist.repository.UsuarioRepository;

import java.util.NoSuchElementException;
import java.util.Objects;

@Service
public class UsuarioService implements UserDetailsService {
    private final UsuarioRepository usuarioRepository;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, @Lazy AuthenticationManager authenticationManager, TokenService tokenService, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario findById(Long id) {
        return this.usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public void register(UsuarioRegisterRequest request) {
        if(this.usuarioRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException();
        }
        var usuario = new Usuario();
        usuario.setEmail(request.email());
        usuario.setNome(request.nome());
        usuario.setSenha(this.passwordEncoder.encode(request.senha()));

        this.usuarioRepository.save(usuario);
    }

    public String login(UsuarioLoginRequest request) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(request.email(), request.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        return this.tokenService.generateToken((Usuario) Objects.requireNonNull(auth.getPrincipal()));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.usuarioRepository.findByEmail(username).orElseThrow(NoSuchElementException::new);
    }
}
