package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

@Value
public class SucursalFranquiciaDto {
    Integer id;
    FranquiciaDto franquicia;
    SucursalDto sucursal;
}