package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;
import co.com.pragma.franquicias.infrastructure.entities.FranquiciaEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class JpaFranquiciaRepositoryAdapter implements FranquiciaRepositoryPort {
    private final JpaFranquiciaRepository jpaFranquiciaRepository;

    @Override
    public Franquicia save(Franquicia franquicia) {
        FranquiciaEntity franquiciaEntity = FranquiciaEntity.fromDomainModel(franquicia);
        FranquiciaEntity savedFranquiciaEntity = jpaFranquiciaRepository.save(franquiciaEntity);
        return savedFranquiciaEntity.toDomainModel();
    }

    @Override
    public Optional<Franquicia> findById(Integer id) {
        return jpaFranquiciaRepository.findById(id).map(FranquiciaEntity::toDomainModel);
    }

    @Override
    public Optional<Franquicia> findByNombre(String nombre) {
        return jpaFranquiciaRepository.findByNombre(nombre).map(FranquiciaEntity::toDomainModel);
    }

    @Override
    public List<Franquicia> findAll() {
        return jpaFranquiciaRepository.findAll().stream()
                .map(FranquiciaEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Franquicia> update(Franquicia franquicia) {
        if (jpaFranquiciaRepository.existsById(franquicia.getId())) {
           FranquiciaEntity franquiciaEntity = FranquiciaEntity.fromDomainModel(franquicia);
           FranquiciaEntity updatedFranquiciaEntity = jpaFranquiciaRepository.save(franquiciaEntity);
           return Optional.of(updatedFranquiciaEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if (jpaFranquiciaRepository.existsById(id)) {
            jpaFranquiciaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
