package co.com.pragma.franquicias.application.usecases;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.models.Sucursal;
import co.com.pragma.franquicias.domain.ports.in.ListarSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;

import java.util.List;
import java.util.Optional;

public class ListarSucursalUseCaseImpl implements ListarSucursalUseCase {
    private final SucursalRepositoryPort sucursalRepositoryPort;

    public ListarSucursalUseCaseImpl(SucursalRepositoryPort sucursalRepositoryPort) {
        this.sucursalRepositoryPort = sucursalRepositoryPort;
    }

    @Override
    public Optional<Sucursal> listarSucursalesPorId(Integer id) {
        return sucursalRepositoryPort.findById(id);
    }

    @Override
    public List<Sucursal> listarSucursalesPorFranquicia(Franquicia franquicia) {
        return sucursalRepositoryPort.findByFranquicia(franquicia);
    }

    @Override
    public List<Sucursal> listarSucursales() {
        return sucursalRepositoryPort.findAll();
    }
}
