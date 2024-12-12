package co.com.pragma.franquicias.infrastructure.controllers;

import co.com.pragma.franquicias.application.services.SucursalService;
import co.com.pragma.franquicias.domain.models.Sucursal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/sucursales")
public class SucursalController {
    private final SucursalService sucursalService;

    @PostMapping
    public ResponseEntity<Sucursal> createSucursal(@RequestBody Sucursal sucursal) {
        Sucursal sucursalNueva = sucursalService.crearSucursal(sucursal);
        return new ResponseEntity<>(sucursalNueva, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Sucursal>> getAllSucursales() {
        List<Sucursal> sucursales = sucursalService.listarSucursales();
        return new ResponseEntity<>(sucursales, HttpStatus.OK);
    }

    @GetMapping("/{idSucursal}")
    public ResponseEntity<Sucursal> getSucursalById(@PathVariable Integer idSucursal) {
        return sucursalService.listarSucursalesPorId(idSucursal)
                .map(sucursal -> new ResponseEntity<>(sucursal, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/nombre/{nombreSucursal}")
    public ResponseEntity<Sucursal> getSucursalByNombre(@PathVariable String nombreSucursal) {
        return sucursalService.listarSucursalesPorNombre(nombreSucursal)
                .map(sucursal -> new ResponseEntity<>(sucursal, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{idSucursal}")
    public ResponseEntity<Sucursal> modifySucursal(@PathVariable Integer idSucursal, @RequestBody Sucursal sucursalModificada) {
        return sucursalService.modificarSucursal(sucursalModificada)
                .map(sucursal -> new ResponseEntity<>(sucursal, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{idSucursal}")
    public ResponseEntity<Void> deleteSucursal(@PathVariable Integer idSucursal) {
        if (sucursalService.eliminarSucursalPorId(idSucursal)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
