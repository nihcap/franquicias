package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Producto;

import java.util.Optional;

public interface ModificarProductoUseCase {
    Optional<Producto> modificar(Producto productoModificado);
}
