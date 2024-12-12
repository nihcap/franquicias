package co.com.pragma.franquicias.domain.ports.in;

import co.com.pragma.franquicias.domain.models.Franquicia;

import java.util.List;
import java.util.Optional;

public interface ListarFranquiciaUseCase {
    Optional<Franquicia> listarFranquiciasPorId(Integer id);

    Optional<Franquicia> listarFranquiciasPorNombre(String nombre);

    List<Franquicia> listarFranquicias();
}
