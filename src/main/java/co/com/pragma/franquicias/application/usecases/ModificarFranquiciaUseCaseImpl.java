package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.ports.in.ModificarFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;

import java.util.Optional;

public class ModificarFranquiciaUseCaseImpl implements ModificarFranquiciaUseCase {
    private final FranquiciaRepositoryPort franquiciaRepositoryPort;

    public ModificarFranquiciaUseCaseImpl(FranquiciaRepositoryPort franquiciaRepositoryPort) {
        this.franquiciaRepositoryPort = franquiciaRepositoryPort;
    }

    @Override
    public Optional<Franquicia> modificar(Franquicia franquiciaModificada) {
        return franquiciaRepositoryPort.update(franquiciaModificada);
    }
}
