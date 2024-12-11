package co.com.pragma.franquicias.domain.mappers;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.infrastructure.dto.FranquiciaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FranquiciaMapper {
    // Instancia del mapper (lo hace MapStruct automáticamente)
    FranquiciaMapper INSTANCE = Mappers.getMapper(FranquiciaMapper.class);

    // Mapear de modelo a DTO
    @Mapping(source = "nombre", target = "nombre")
    FranquiciaDto toDto(Franquicia franquicia);

    // Mapear de DTO a modelo
    @Mapping(source = "nombre", target = "nombre")
    Franquicia toModel(FranquiciaDto franquiciaDTO);
}