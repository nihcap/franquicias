package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.ports.in.CrearFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;

public class CrearFranquiciaUseCaseImpl implements CrearFranquiciaUseCase {
    private final FranquiciaRepositoryPort franquiciaRepositoryPort;

    public CrearFranquiciaUseCaseImpl(FranquiciaRepositoryPort franquiciaRepositoryPort) {
        this.franquiciaRepositoryPort = franquiciaRepositoryPort;
    }

    @Override
    public Franquicia crearFranquicia(Franquicia franquicia) {
        return franquiciaRepositoryPort.save(franquicia);
    }
}
