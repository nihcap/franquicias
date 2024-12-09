package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.com.pragma.franquicias.domain.model.ProductoSucursal}
 */
@Value
public class ProductoSucursalDto implements Serializable {
    Integer id;
    SucursalFranquiciaDto sucursalFranquicia;
    ProductoDto producto;
    Long cantidadStock;
}