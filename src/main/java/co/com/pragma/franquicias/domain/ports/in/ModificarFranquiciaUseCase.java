package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Franquicia;

import java.util.Optional;

public interface ModificarFranquiciaUseCase {
    Optional<Franquicia> modificar(Franquicia franquiciaModificada);
}
