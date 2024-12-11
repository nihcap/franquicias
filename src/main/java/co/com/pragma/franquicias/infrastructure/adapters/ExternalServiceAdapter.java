package co.com.pragma.franquicias.infrastructure.adapters;

import co.com.pragma.franquicias.domain.ports.out.ExternalServicePort;

import java.util.List;
import java.util.Optional;

public class ExternalServiceAdapter implements ExternalServicePort {
    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Optional<Object> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Object> update(Integer id, Object entity) {
        return Optional.empty();
    }

    @Override
    public List<Object> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Integer id) {

    }
}
