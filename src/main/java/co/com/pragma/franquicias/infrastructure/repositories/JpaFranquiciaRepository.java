package co.com.pragma.franquicias.infrastructure.repositories;

import co.com.pragma.franquicias.infrastructure.entities.FranquiciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaFranquiciaRepository extends JpaRepository<FranquiciaEntity, Integer> {
}
