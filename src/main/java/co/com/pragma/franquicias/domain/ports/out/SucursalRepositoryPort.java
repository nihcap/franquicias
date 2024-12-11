package co.com.pragma.franquicias.domain.ports.out;

import co.com.pragma.franquicias.domain.models.Sucursal;

import java.util.List;
import java.util.Optional;

public interface SucursalRepositoryPort {
    Sucursal save(Sucursal sucursal);

    List<Sucursal> findAll();

    Optional<Sucursal> findById(Integer id);

//    List<Sucursal> findByFranquicia(Franquicia franquicia);

    Optional<Sucursal> update(Sucursal sucursal);

    boolean deleteById(Integer id);
}
