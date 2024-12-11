package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.domain.models.Producto;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;
import co.com.pragma.franquicias.infrastructure.entities.ProductoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class JpaProductoRepositoryAdapter implements ProductoRepositoryPort {
    private final JpaProductoRepository jpaProductoRepository;

    @Override
    public Producto save(Producto producto) {
        ProductoEntity productoEntity = ProductoEntity.fromDomainModel(producto);
        ProductoEntity savedProductoEntity = jpaProductoRepository.save(productoEntity);
        return savedProductoEntity.toDomainModel();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return jpaProductoRepository.findById(id).map(ProductoEntity::toDomainModel);
    }

    @Override
    public List<Producto> findAll() {
        return jpaProductoRepository.findAll().stream()
                .map(ProductoEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Producto> update(Producto producto) {
        if (jpaProductoRepository.existsById(producto.getId())) {
            ProductoEntity productoEntity = ProductoEntity.fromDomainModel(producto);
            ProductoEntity updateProductoEntity = jpaProductoRepository.save(productoEntity);
            return Optional.of(updateProductoEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaProductoRepository.existsById(id)) {
            jpaProductoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
