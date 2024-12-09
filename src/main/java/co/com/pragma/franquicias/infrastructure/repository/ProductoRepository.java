package co.com.pragma.franquicias.infrastructure.repository;

import co.com.pragma.franquicias.domain.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findAll();
    List<Producto> findByNombre(String nombre);
    Optional<Producto> findById(int id);
    Producto addProducto(Producto producto);
    Producto updateProducto(Producto producto);
    void deleteProducto(int id);
}
