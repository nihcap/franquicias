package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Sucursal;
import co.com.pragma.franquicias.domain.ports.in.ModificarSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;

import java.util.Optional;

public class ModificarSucursalUseCaseImpl implements ModificarSucursalUseCase {
    private final SucursalRepositoryPort sucursalRepositoryPort;

    public ModificarSucursalUseCaseImpl(SucursalRepositoryPort sucursalRepositoryPort) {
        this.sucursalRepositoryPort = sucursalRepositoryPort;
    }

    @Override
    public Optional<Sucursal> modificarSucursal(Sucursal sucursalModificado) {
        return sucursalRepositoryPort.update(sucursalModificado);
    }
}
