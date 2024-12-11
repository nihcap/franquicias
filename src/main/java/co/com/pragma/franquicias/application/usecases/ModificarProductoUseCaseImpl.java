package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Producto;
import co.com.pragma.franquicias.domain.ports.in.ModificarProductoUseCase;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;

import java.util.Optional;

public class ModificarProductoUseCaseImpl implements ModificarProductoUseCase {
    private final ProductoRepositoryPort productoRepositoryPort;

    public ModificarProductoUseCaseImpl(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Optional<Producto> modificarProducto(Producto productoModificado) {
        return productoRepositoryPort.update(productoModificado);
    }
}
