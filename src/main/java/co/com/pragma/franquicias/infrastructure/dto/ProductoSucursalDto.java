package co.com.pragma.franquicias.infrastructure.dto;

import lombok.Value;

@Value
public class ProductoSucursalDto {
    Integer id;
    SucursalFranquiciaDto sucursalFranquicia;
    ProductoDto producto;
    Long cantidadStock;
}