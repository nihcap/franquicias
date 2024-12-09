package co.com.pragma.franquicias.application.controllers;

import co.com.pragma.franquicias.application.services.FranquiciaService;
import co.com.pragma.franquicias.domain.model.Franquicia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FranquiciaController {
    private final FranquiciaService franquiciaService;

    public FranquiciaController(FranquiciaService franquiciaService) {
        this.franquiciaService = franquiciaService;
    }

    @GetMapping("/franquicias")
    public ResponseEntity<List<Franquicia>> getFranquicias(@RequestParam(value = "nombre", required = true) String nombre){
        return ResponseEntity.ok(franquiciaService.findByNombre(nombre));
    }

}
