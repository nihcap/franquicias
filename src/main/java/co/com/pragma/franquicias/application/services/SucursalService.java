package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.models.Sucursal;
import co.com.pragma.franquicias.domain.ports.in.CrearSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.in.EliminarSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.in.ListarSucursalUseCase;
import co.com.pragma.franquicias.domain.ports.in.ModificarSucursalUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Service
public class SucursalService implements CrearSucursalUseCase, ListarSucursalUseCase, ModificarSucursalUseCase, EliminarSucursalUseCase {
    private final CrearSucursalUseCase crearSucursalUseCase;
    private final ListarSucursalUseCase listarSucursalUseCase;
    private final ModificarSucursalUseCase modificarSucursalUseCase;
    private final EliminarSucursalUseCase eliminarSucursalUseCase;

    @Override
    public Sucursal crearSucursal(Sucursal sucursal) {
        return crearSucursalUseCase.crearSucursal(sucursal);
    }

    @Override
    public List<Sucursal> listarSucursales() {
        return listarSucursalUseCase.listarSucursales();
    }

    @Override
    public Optional<Sucursal> listarSucursalesPorId(Integer id) {
        return listarSucursalUseCase.listarSucursalesPorId(id);
    }

    @Override
    public Optional<Sucursal> listarSucursalesPorNombre(String nombre) {
        return listarSucursalUseCase.listarSucursalesPorNombre(nombre);
    }
//
//    @Override
//    public List<Sucursal> listarSucursalesPorFranquicia(Franquicia franquicia) {
//        return listarSucursalUseCase.listarSucursalesPorFranquicia(franquicia);
//    }

    @Override
    public Optional<Sucursal> modificarSucursal(Sucursal sucursalModificada) {
        return modificarSucursalUseCase.modificarSucursal(sucursalModificada);
    }

    @Override
    public boolean eliminarSucursalPorId(Integer id) {
        return eliminarSucursalUseCase.eliminarSucursalPorId(id);
    }
}