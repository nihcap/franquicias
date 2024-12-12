package co.com.pragma.franquicias.infrastructure.controllers;

import co.com.pragma.franquicias.application.services.ProductoService;
import co.com.pragma.franquicias.domain.models.Producto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
        Producto productoNuevo = productoService.crearProducto(producto);
        return new ResponseEntity<>(productoNuevo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> productos = productoService.listarProductos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
    
    @GetMapping("/{idProducto}")
    public ResponseEntity<Producto> getProductoById(@PathVariable Integer idProducto) {
        return productoService.listarProductosPorId(idProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @GetMapping("/nombre/{nombreProducto}")
    public ResponseEntity<Producto> getProductoByNombre(@PathVariable String nombreProducto) {
        return productoService.listarProductosPorNombre(nombreProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PutMapping("/{idProducto}")
    public ResponseEntity<Producto> modifyProducto(@PathVariable Integer idProducto, @RequestBody Producto productoModificado) {
        return productoService.modificarProducto(productoModificado)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @DeleteMapping("/{idProducto}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Integer idProducto) {
        if (productoService.eliminarProductoPorId(idProducto)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
