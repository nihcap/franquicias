package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.com.pragma.franquicias.domain.model.Producto}
 */
@Value
public class ProductoDto implements Serializable {
    Integer id;
    String nombre;
}