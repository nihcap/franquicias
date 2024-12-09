package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.com.pragma.franquicias.domain.model.SucursalFranquicia}
 */
@Value
public class SucursalFranquiciaDto implements Serializable {
    Integer id;
    FranquiciaDto franquicia;
    SucursalDto sucursal;
}