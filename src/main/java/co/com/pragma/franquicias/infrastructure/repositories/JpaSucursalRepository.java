package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.infrastructure.entities.SucursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaSucursalRepository extends JpaRepository<SucursalEntity, Integer> {
    Optional<SucursalEntity> findByNombre(String nombre);

    List<SucursalEntity> findByFranquicia(Franquicia franquicia);
}
