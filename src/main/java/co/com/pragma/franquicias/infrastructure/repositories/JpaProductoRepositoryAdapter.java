package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.domain.models.Producto;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class JpaProductoRepositoryAdapter implements ProductoRepositoryPort {
    private final JpaProductoRepository jpaProductoRepository;

    @Override
    public Producto save(Producto product) {
        return null;
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Producto> update(Producto producto) {
        return Optional.empty();
    }

    @Override
    public List<Producto> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
