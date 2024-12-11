package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Sucursal;

import java.util.Optional;

public interface ModificarSucursalUseCase {
    Optional<Sucursal> modificar(Sucursal sucursalModificado);
}
