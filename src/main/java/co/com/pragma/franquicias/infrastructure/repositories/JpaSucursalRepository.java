package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.infrastructure.entities.SucursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSucursalRepository extends JpaRepository<SucursalEntity, Integer> {
}
