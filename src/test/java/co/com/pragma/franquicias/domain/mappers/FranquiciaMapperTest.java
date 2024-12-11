package co.com.pragma.franquicias.domain.mappers;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.infrastructure.dto.FranquiciaDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FranquiciaMapperTest {

    @Test
    public void testToDto() {
        // Crear un ejemplo de FranquiciaEntity
        Franquicia franquicia = Franquicia.builder()
                .id(99)
                .nombre("FranquiciaEntity Test")
                .build();

        // Usar el mapper
        FranquiciaDto dto = FranquiciaMapper.INSTANCE.toDto(franquicia);

        // Validar
        assertEquals(franquicia.getId(), dto.getId());
        assertEquals(franquicia.getNombre(), dto.getNombre());
    }

    @Test
    public void testToModel() {
        // Crear un ejemplo de FranquiciaDTO
        FranquiciaDto franquiciaDTO = new FranquiciaDto(99,"FranquiciaEntity Test");

        // Usar el mapper
        Franquicia modelo = FranquiciaMapper.INSTANCE.toModel(franquiciaDTO);

        // Validar
        assertEquals(franquiciaDTO.getId(), modelo.getId());
        assertEquals(franquiciaDTO.getNombre(), modelo.getNombre());
    }
}