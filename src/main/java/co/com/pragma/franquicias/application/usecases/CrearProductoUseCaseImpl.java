package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Producto;
import co.com.pragma.franquicias.domain.ports.in.CrearProductoUseCase;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;

public class CrearProductoUseCaseImpl implements CrearProductoUseCase {
    private final ProductoRepositoryPort productoRepositoryPort;

    public CrearProductoUseCaseImpl(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepositoryPort.save( producto);
    }
}
