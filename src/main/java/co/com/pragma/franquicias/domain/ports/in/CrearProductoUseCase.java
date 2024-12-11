package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Producto;

public interface CrearProductoUseCase {
    Producto crearProducto(Producto producto);
}
