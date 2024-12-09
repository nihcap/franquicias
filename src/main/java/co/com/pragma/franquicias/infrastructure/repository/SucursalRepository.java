package co.com.pragma.franquicias.infrastructure.repository;

import co.com.pragma.franquicias.domain.model.Sucursal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SucursalRepository extends CrudRepository<Sucursal, Integer> {
    List<Sucursal> findAll();
    List<Sucursal> findByNombre(String nombre);
    Optional<Sucursal> findById(int id);
    Sucursal addSucursal(Sucursal sucursal);
    Sucursal updateSucursal(Sucursal sucursal);
    void deleteSucursal(int id);
}
