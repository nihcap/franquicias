package co.com.pragma.franquicias.infrastructure.controllers;

import co.com.pragma.franquicias.application.services.SucursalService;
import co.com.pragma.franquicias.domain.models.Sucursal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/sucursales")
public class SucursalController {
    private final SucursalService sucursalService;

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


}
