package co.com.pragma.franquicias.domain.ports.out;

import co.com.pragma.franquicias.domain.models.Franquicia;

import java.util.List;
import java.util.Optional;

public interface FranquiciaRepositoryPort {
    Franquicia save(Franquicia franquicia);

    Optional<Franquicia> findById(Integer id);

    Optional<Franquicia> update(Franquicia franquicia);

    List<Franquicia> findAll();

    boolean deleteById(Integer id);
}
