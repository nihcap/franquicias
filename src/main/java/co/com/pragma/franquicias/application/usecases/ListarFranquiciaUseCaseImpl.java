package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.ports.in.ListarFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ListarFranquiciaUseCaseImpl implements ListarFranquiciaUseCase {
    private final FranquiciaRepositoryPort franquiciaRepositoryPort;

    public ListarFranquiciaUseCaseImpl(FranquiciaRepositoryPort franquiciaRepositoryPort) {
        this.franquiciaRepositoryPort = franquiciaRepositoryPort;
    }

    @Override
    public Optional<Franquicia> listarFranquiciasPorId(Integer id) {
        return franquiciaRepositoryPort.findById(id);
    }

    @Override
    public Optional<Franquicia> listarFranquiciasPorNombre(String nombre) {
        return franquiciaRepositoryPort.findByNombre(nombre);
    }

    @Override
    public List<Franquicia> listarFranquicias() {
        return franquiciaRepositoryPort.findAll();
    }
}
