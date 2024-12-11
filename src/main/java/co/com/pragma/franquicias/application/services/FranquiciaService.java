package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.models.Franquicia;
import co.com.pragma.franquicias.domain.ports.in.CrearFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.in.EliminarFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.in.ListarFranquiciaUseCase;
import co.com.pragma.franquicias.domain.ports.in.ModificarFranquiciaUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Service
public class FranquiciaService implements CrearFranquiciaUseCase, ListarFranquiciaUseCase, ModificarFranquiciaUseCase, EliminarFranquiciaUseCase {
    private final CrearFranquiciaUseCase crearFranquiciaUseCase;
    private final ListarFranquiciaUseCase listarFranquiciaUseCase;
    private final ModificarFranquiciaUseCase modificarFranquiciaUseCase;
    private final EliminarFranquiciaUseCase eliminarFranquiciaUseCase;


    @Override
    public Franquicia crearFranquicia(Franquicia franquicia) {
        return crearFranquiciaUseCase.crearFranquicia(franquicia);
    }

    @Override
    public Optional<Franquicia> listarFranquiciasPorId(Integer id) {
        return listarFranquiciaUseCase.listarFranquiciasPorId(id);
    }

    @Override
    public List<Franquicia> listarFranquicias() {
        return listarFranquiciaUseCase.listarFranquicias();
    }

    @Override
    public Optional<Franquicia> modificar(Franquicia franquiciaModificada) {
        return modificarFranquiciaUseCase.modificar(franquiciaModificada);
    }

    @Override
    public boolean eliminarFranquiciaPorId(Integer id) {
        return eliminarFranquiciaUseCase.eliminarFranquiciaPorId(id);
    }
}
