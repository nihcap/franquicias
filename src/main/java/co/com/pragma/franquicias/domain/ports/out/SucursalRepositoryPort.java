package co.com.pragma.franquicias.domain.ports.out;

import co.com.pragma.franquicias.domain.models.Sucursal;

import java.util.List;
import java.util.Optional;

public interface SucursalRepositoryPort {
    Sucursal save(Sucursal sucursal);

    Optional<Sucursal> findById(Integer id);

    Optional<Sucursal> update(Sucursal sucursal);

    List<Sucursal> findAll();

    boolean deleteById(Integer id);
}
