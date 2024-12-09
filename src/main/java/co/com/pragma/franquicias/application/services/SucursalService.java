package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.model.Sucursal;

import java.util.List;

public interface SucursalService {
    List<Sucursal> findAll();
    List<Sucursal> findByNombre(String nombre);
    Sucursal findById(int id);
    Sucursal addSucursal(Sucursal sucursal);
    Sucursal updateSucursal(int id, Sucursal nuevaSucursal);
    void deleteSucursal(int id);
}
