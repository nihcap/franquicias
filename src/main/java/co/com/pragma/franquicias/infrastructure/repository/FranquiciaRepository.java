package co.com.pragma.franquicias.infrastructure.repository;

import co.com.pragma.franquicias.domain.model.Franquicia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FranquiciaRepository extends CrudRepository<Franquicia, Integer> {
    List<Franquicia> findAll();
    List<Franquicia> findByNombre(String nombre);
    Optional<Franquicia> findById(int id);
    Franquicia addFranquicia(Franquicia franquicia);
    Franquicia updateFranquicia(Franquicia franquicia);
    void deleteFranquicia(int id);
}
