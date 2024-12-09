package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    List<Producto> findByNombre(String nombre);
    Producto findById(int id);
    Producto addProducto(Producto producto);
    Producto updateProducto(int id, Producto nuevoProducto);
    void deleteProducto(int id);
}
