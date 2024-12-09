package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.exceptions.ProductoNotFoundException;
import co.com.pragma.franquicias.domain.model.Producto;
import co.com.pragma.franquicias.infrastructure.repository.ProductoRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> findByNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }

    @Override
    public Producto findById(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto addProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProducto(int id, Producto nuevoProducto) throws ProductoNotFoundException {
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new ProductoNotFoundException(id));
        nuevoProducto.setId(producto.getId());
        return productoRepository.save(nuevoProducto);
    }

    @Override
    public void deleteProducto(int id) {
        productoRepository.findById(id).orElseThrow(() -> new ProductoNotFoundException(id));
        productoRepository.deleteById(id);
    }
}
