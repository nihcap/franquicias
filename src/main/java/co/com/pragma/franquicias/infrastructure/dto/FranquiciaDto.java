package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.com.pragma.franquicias.domain.model.Franquicia}
 */
@Value
public class FranquiciaDto implements Serializable {
    Integer id;
    String nombre;
}