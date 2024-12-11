package co.com.pragma.franquicias.domain.ports.out;

import java.util.List;
import java.util.Optional;

public interface ExternalServicePort<T> {
    T save(T entity);

    Optional<T> findById(Integer id);

    Optional<T> update(Integer id, T entity);

    List<T> findAll();

    void deleteById(Integer id);
}
