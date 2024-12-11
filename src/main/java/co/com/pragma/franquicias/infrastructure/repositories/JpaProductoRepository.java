package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.infrastructure.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}
