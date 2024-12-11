package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.infrastructure.entities.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductoRepository extends CrudRepository<Producto, Integer> {
}
