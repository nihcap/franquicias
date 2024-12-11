package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Sucursal;

public interface CrearSucursalUseCase {
    Sucursal crearSucursal(Sucursal sucursal);
}
