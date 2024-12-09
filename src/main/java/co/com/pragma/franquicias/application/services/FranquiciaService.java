package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.model.Franquicia;

import java.util.List;

public interface FranquiciaService {
    List<Franquicia> findAll();
    List<Franquicia> findByNombre(String nombre);
    Franquicia findById(int id);
    Franquicia addFranquicia(Franquicia franquicia);
    Franquicia updateFranquicia(int id, Franquicia nuevaFranquicia);
    void deleteFranquicia(int id);
}
