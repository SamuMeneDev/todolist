package samumene.todolist.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import samumene.todolist.entity.Usuario;

import java.time.Duration;
import java.time.Instant;

@Service
public class TokenService {

    private final String secret = "teste";

    public String generateToken(Usuario usuario) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
            .withIssuer("todo-list-api")
            .withClaim("roles", usuario.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList())
            .withSubject(usuario.getEmail())
            .withExpiresAt(Instant.now().plus(Duration.ofHours(7)))
            .sign(algorithm);
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("todo-list-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            return "";
        }
    }

}
