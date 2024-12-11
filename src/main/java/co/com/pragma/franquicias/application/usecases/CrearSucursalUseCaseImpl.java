package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Sucursal;
import co.com.pragma.franquicias.domain.ports.in.CrearSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;

public class CrearSucursalUseCaseImpl implements CrearSucursalUseCase {
    private final SucursalRepositoryPort sucursalRepositoryPort;

    public CrearSucursalUseCaseImpl(SucursalRepositoryPort sucursalRepositoryPort) {
        this.sucursalRepositoryPort = sucursalRepositoryPort;
    }

    @Override
    public Sucursal crearSucursal(Sucursal sucursal) {
        return sucursalRepositoryPort.save(sucursal);
    }
}
