package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.ports.in.EliminarFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;

public class EliminarFranquiciaUseCaseImpl implements EliminarFranquiciaUseCase {
    private final FranquiciaRepositoryPort franquiciaRepositoryPort;

    public EliminarFranquiciaUseCaseImpl(FranquiciaRepositoryPort franquiciaRepositoryPort) {
        this.franquiciaRepositoryPort = franquiciaRepositoryPort;
    }

    @Override
    public boolean eliminarFranquiciaPorId(Integer id) {
        return franquiciaRepositoryPort.deleteById(id);
    }
}
