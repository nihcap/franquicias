package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Sucursal;

import java.util.List;
import java.util.Optional;

public interface ListarSucursalUseCase {
    Optional<Sucursal> listarSucursalesPorId(Integer id);

//    List<Sucursal> listarSucursalesPorFranquicia(Franquicia franquicia);

    List<Sucursal> listarSucursales();
}
