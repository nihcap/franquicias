package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.ports.in.EliminarSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;

public class EliminarSucursalUseCaseImpl implements EliminarSucursalUseCase {
    private final SucursalRepositoryPort sucursalRepositoryPort;

    public EliminarSucursalUseCaseImpl(SucursalRepositoryPort sucursalRepositoryPort) {
        this.sucursalRepositoryPort = sucursalRepositoryPort;
    }

    @Override
    public boolean eliminarSucursalPorId(Integer id) {
        return sucursalRepositoryPort.deleteById(id);
    }
}
