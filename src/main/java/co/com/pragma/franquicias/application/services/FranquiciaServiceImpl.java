package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.exceptions.FranquiciaNotFoundException;
import co.com.pragma.franquicias.domain.model.Franquicia;
import co.com.pragma.franquicias.infrastructure.repository.FranquiciaRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class FranquiciaServiceImpl implements FranquiciaService {
    private final FranquiciaRepository franquiciaRepository;

    @Autowired
    public FranquiciaServiceImpl(FranquiciaRepository franquiciaRepository) {
        this.franquiciaRepository = franquiciaRepository;
    }

    @Override
    public List<Franquicia> findAll() {
        return franquiciaRepository.findAll();
    }

    @Override
    public List<Franquicia> findByNombre(String nombre) {
        return franquiciaRepository.findByNombre(nombre);
    }

    @Override
    public Franquicia findById(int id) {
        return franquiciaRepository.findById(id).orElse(null);
    }

    @Override
    public Franquicia addFranquicia(Franquicia franquicia) {
        return franquiciaRepository.save(franquicia);
    }

    @Override
    public Franquicia updateFranquicia(int id, Franquicia nuevaFranquicia) throws FranquiciaNotFoundException {
        Franquicia franquicia = franquiciaRepository.findById(id).orElseThrow(() -> new FranquiciaNotFoundException(id));
        nuevaFranquicia.setId(franquicia.getId());
        return franquiciaRepository.save(nuevaFranquicia);
    }

    @Override
    public void deleteFranquicia(int id) throws FranquiciaNotFoundException {
        franquiciaRepository.findById(id).orElseThrow(() -> new FranquiciaNotFoundException(id));
        franquiciaRepository.deleteById(id);
    }
}
