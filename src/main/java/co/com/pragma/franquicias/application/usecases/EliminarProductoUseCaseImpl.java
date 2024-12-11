package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.ports.in.EliminarProductoUseCase;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;

public class EliminarProductoUseCaseImpl implements EliminarProductoUseCase {
    private final ProductoRepositoryPort productoRepositoryPort;

    public EliminarProductoUseCaseImpl(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public boolean eliminarProductoPorId(Integer id) {
        return productoRepositoryPort.deleteById(id);
    }
}
