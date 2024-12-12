package co.com.pragma.franquicias.infrastructure.controllers;

import co.com.pragma.franquicias.application.services.FranquiciaService;
import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.models.Sucursal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/franquicias")
public class FranquiciaController {
    private final FranquiciaService franquiciaService;

    @PostMapping()
    public ResponseEntity<Franquicia> createFranquicia(@RequestBody Franquicia franquicia) {
        Franquicia franquiciaCreada = franquiciaService.crearFranquicia(franquicia);
        return new ResponseEntity<>(franquiciaCreada, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Franquicia>> getAllFranquicias() {
        List<Franquicia> franquicias = franquiciaService.listarFranquicias();
        return new ResponseEntity<>(franquicias, HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombreFranquicia}")
    public ResponseEntity<Franquicia> getFranquiciaByNombre(@PathVariable String nombreFranquicia) {
        return franquiciaService.listarFranquiciasPorNombre(nombreFranquicia)
                .map(franquicia -> new ResponseEntity<>(franquicia, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{idFranquicia}")
    public ResponseEntity<Franquicia> getFranquiciaById(@PathVariable Integer idFranquicia) {
        return franquiciaService.listarFranquiciasPorId(idFranquicia)
                .map(franquicia -> new ResponseEntity<>(franquicia, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{idFranquicia}")
    public ResponseEntity<Franquicia> modifyFranquicia(@PathVariable Integer idFranquicia, @RequestBody Franquicia modifiedFranquicia) {
        return franquiciaService.modificarFranquicia(modifiedFranquicia)
                .map(franquicia -> new ResponseEntity<>(franquicia, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{idFranquicia}")
    public ResponseEntity<Void> deleteFranquicia(@PathVariable Integer idFranquicia) {
        if (franquiciaService.eliminarFranquiciaPorId(idFranquicia)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{idFranquicia}/sucursales")
    public ResponseEntity<List<Sucursal>> listarSucursalesDeFranquicia() {//TODO: IMPLEMENTAR
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/{idFranquicia}/sucursales")
    public ResponseEntity<Sucursal> crearSucursalDeFranquicia(@PathVariable Integer idFranquicia, @RequestBody Sucursal sucursal) {//TODO: IMPLEMENTAR
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
