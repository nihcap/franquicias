package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.domain.models.Sucursal;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;
import co.com.pragma.franquicias.infrastructure.entities.SucursalEntity;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class JpaSucursalRepositoryAdapter implements SucursalRepositoryPort {
    private final JpaSucursalRepository jpaSucursalRepository;

    @Override
    public Sucursal save(Sucursal sucursal) {
        SucursalEntity sucursalEntity = SucursalEntity.fromDomainModel(sucursal);
        SucursalEntity savedSucursalEntity = jpaSucursalRepository.save(sucursalEntity);
        return savedSucursalEntity.toDomainModel();
    }

    @Override
    public Optional<Sucursal> findById(Integer id) {
        return jpaSucursalRepository.findById(id).map(SucursalEntity::toDomainModel);
    }

    @Override
    public List<Sucursal> findAll() {
        return jpaSucursalRepository.findAll().stream()
                .map(SucursalEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Sucursal> update(Sucursal sucursal) {
        if (jpaSucursalRepository.existsById(sucursal.getId())) {
            SucursalEntity sucursalEntity = SucursalEntity.fromDomainModel(sucursal);
            SucursalEntity updatedSucursalEntity = jpaSucursalRepository.save(sucursalEntity);
            return Optional.of(updatedSucursalEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaSucursalRepository.existsById(id)) {
            jpaSucursalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
