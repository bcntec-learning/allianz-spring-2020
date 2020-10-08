package allianz2020.ejemplojpa;

import allianz2020.ejemplojpa.data.Usuario;
import allianz2020.ejemplojpa.data.UsuarioRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRest {
    private final UsuarioRepositorio repositorio;

    public UsuarioRest(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}/optional")
    public Usuario buscarConOptional(@PathVariable Long id) {
        return repositorio.findById(id).get();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscar(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(repositorio.findById(id).get());
        } catch (NoSuchElementException e) {
            return ResponseEntity.ok("no encontrado").notFound().build();
        }
    }
}
