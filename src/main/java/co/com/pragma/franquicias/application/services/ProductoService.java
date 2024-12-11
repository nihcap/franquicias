package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.models.Producto;
import co.com.pragma.franquicias.domain.ports.in.CrearProductoUseCase;
import co.com.pragma.franquicias.domain.ports.in.EliminarProductoUseCase;
import co.com.pragma.franquicias.domain.ports.in.ListarProductoUseCase;
import co.com.pragma.franquicias.domain.ports.in.ModificarProductoUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Service
public class ProductoService implements CrearProductoUseCase, ListarProductoUseCase, ModificarProductoUseCase, EliminarProductoUseCase {
    private final CrearProductoUseCase crearProductoUseCase;
    private final ListarProductoUseCase listarProductoUseCase;
    private final ModificarProductoUseCase modificarProductoUseCase;
    private final EliminarProductoUseCase eliminarProductoUseCase;

    @Override
    public Producto crearProducto(Producto producto) {
        return crearProductoUseCase.crearProducto(producto);
    }

    @Override
    public Optional<Producto> listarProductosPorId(Integer id) {
        return listarProductoUseCase.listarProductosPorId(id);
    }

    @Override
    public List<Producto> listarProductos() {
        return listarProductoUseCase.listarProductos();
    }

    @Override
    public Optional<Producto> modificar(Producto productoModificado) {
        return modificarProductoUseCase.modificar( productoModificado);
    }

    @Override
    public boolean eliminarProductoPorId(Integer id) {
        return eliminarProductoUseCase.eliminarProductoPorId(id);
    }
}