package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ListarProductoUseCase {
    Optional<Producto> listarProductosPorId(Integer id);

    Optional<Producto> listarProductosPorNombre(String nombre);

    List<Producto> listarProductos();
}
