package co.com.pragma.franquicias.domain.ports.out;

import co.com.pragma.franquicias.domain.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepositoryPort {
    Producto save(Producto product);

    Optional<Producto> findById(Integer id);

    Optional<Producto> findByNombre(String nombre);

    Optional<Producto> update(Producto producto);

    List<Producto> findAll();

    boolean deleteById(Integer id);
}
