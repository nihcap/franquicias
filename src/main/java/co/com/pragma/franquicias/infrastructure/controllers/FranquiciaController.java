package co.com.pragma.franquicias.infrastructure.controllers;

import co.com.pragma.franquicias.infrastructure.entities.FranquiciaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FranquiciaController {
//    private final FranquiciaService franquiciaService;
//
//    @Autowired
//    public FranquiciaController(FranquiciaService franquiciaService) {
//        this.franquiciaService = franquiciaService;
//    }
//
//    @GetMapping("/franquicias")
//    public ResponseEntity<List<FranquiciaEntity>> getFranquicias(@RequestParam(value = "nombre") String nombre) {
//        List<FranquiciaEntity> franquiciaEntities;
//        if (nombre.isEmpty()) {
//            franquiciaEntities = franquiciaService.findAll();
//        } else {
//            franquiciaEntities = franquiciaService.findByNombre(nombre);
//        }
//        return ResponseEntity.ok(franquiciaEntities);
//    }
//
//    @GetMapping("/franquicias/{id}")
//    public ResponseEntity<FranquiciaEntity> getFranquicia(@PathVariable int id) {
//        FranquiciaEntity franquiciaEntity = franquiciaService.findById(id);
//        return ResponseEntity.ok(franquiciaEntity);
//    }
//
//    @PostMapping("/franquicias")
//    public ResponseEntity<FranquiciaEntity> addFranquicia(@RequestBody FranquiciaEntity franquiciaEntity) {
//        FranquiciaEntity franquiciaEntityCreada = franquiciaService.addFranquicia(franquiciaEntity);
//        return ResponseEntity.ok(franquiciaEntityCreada);
//    }
//
//    @PutMapping("/franquicias/{id}")
//    public ResponseEntity<FranquiciaEntity> modifyFranquicia(@PathVariable int id, @RequestBody FranquiciaEntity franquiciaEntity) {
//        FranquiciaEntity franquiciaEntityModificada = franquiciaService.modifyFranquicia(id, franquiciaEntity);
//        return ResponseEntity.ok(franquiciaEntityModificada);
//    }
//
//    @DeleteMapping("/franquicias/{id}")
//    public ResponseEntity<Void> deleteFranquicia(@PathVariable int id) {
//        franquiciaService.deleteFranquicia(id);
//        return ResponseEntity.noContent().build();
//    }

}
