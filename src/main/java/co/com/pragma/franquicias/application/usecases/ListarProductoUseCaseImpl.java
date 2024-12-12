package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Producto;
import co.com.pragma.franquicias.domain.ports.in.ListarProductoUseCase;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ListarProductoUseCaseImpl implements ListarProductoUseCase {
    private final ProductoRepositoryPort productoRepositoryPort;

    public ListarProductoUseCaseImpl(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Optional<Producto> listarProductosPorId(Integer id) {
        return productoRepositoryPort.findById(id);
    }

    @Override
    public Optional<Producto> listarProductosPorNombre(String nombre) {
        return productoRepositoryPort.findByNombre(nombre);
    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepositoryPort.findAll();
    }
}
