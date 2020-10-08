package allianz2020.ejemplojpa;

import allianz2020.ejemplojpa.data.Usuario;
import allianz2020.ejemplojpa.data.UsuarioRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    @GetMapping(value = "/all/page", params = {"p","s"})
    public Page<Usuario> all(@RequestParam Integer p, @RequestParam  Integer s) {
        PageRequest pageRequest = PageRequest.of(p, s);
        return repositorio.findAll(pageRequest);
    }
    @GetMapping(value = "/buscar/page", params = {"p","s"})
    public Page<Usuario> buscar(@RequestParam Integer p, @RequestParam  Integer s) {
        PageRequest pageRequest = PageRequest.of(p, s);
        return repositorio.buscarTodos(pageRequest);
    }
}
