package co.com.pragma.franquicias.infrastructure.controllers;

import co.com.pragma.franquicias.application.services.ProductoService;
import co.com.pragma.franquicias.domain.models.Producto;
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
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAllProducts() {
        List<Producto> productos = productoService.listarProductos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
    
    @GetMapping("/{idProducto}")
    public ResponseEntity<Producto> getProductById(@PathVariable Integer idProducto) {
        return productoService.listarProductosPorId(idProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @GetMapping("/nombre/{nombreProducto}")
    public ResponseEntity<Producto> getProductByNombre(@PathVariable String nombreProducto) {
        return productoService.listarProductosPorNombre(nombreProducto)
                .map(producto -> new ResponseEntity<>(producto, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
