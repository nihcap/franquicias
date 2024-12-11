package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.domain.models.Sucursal;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class JpaSucursalRepositoryAdapter implements SucursalRepositoryPort {
    private final JpaSucursalRepository jpaSucursalRepository;

    @Override
    public Sucursal save(Sucursal sucursal) {
        return null;
    }

    @Override
    public Optional<Sucursal> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Sucursal> update(Sucursal sucursal) {
        return Optional.empty();
    }

    @Override
    public List<Sucursal> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
