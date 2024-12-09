package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.com.pragma.franquicias.domain.model.Sucursal}
 */
@Value
public class SucursalDto implements Serializable {
    Integer id;
    String nombre;
}