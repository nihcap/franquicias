package co.com.pragma.franquicias.application.services;

import co.com.pragma.franquicias.domain.exceptions.SucursalNotFoundException;
import co.com.pragma.franquicias.domain.model.Sucursal;
import co.com.pragma.franquicias.infrastructure.repository.SucursalRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class SucursalServiceImpl implements SucursalService {
    private final SucursalRepository sucursalRepository;

    @Autowired
    public SucursalServiceImpl(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    @Override
    public List<Sucursal> findAll() {
        return sucursalRepository.findAll();
    }

    @Override
    public List<Sucursal> findByNombre(String nombre) {
        return sucursalRepository.findByNombre(nombre);
    }

    @Override
    public Sucursal findById(int id) {
        return sucursalRepository.findById(id).orElse(null);
    }

    @Override
    public Sucursal addSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public Sucursal updateSucursal(int id, Sucursal nuevaSucursal) throws SucursalNotFoundException {
        Sucursal sucursal = sucursalRepository.findById(id).orElseThrow(() -> new SucursalNotFoundException(id));
        nuevaSucursal.setId(sucursal.getId());
        return sucursalRepository.save(nuevaSucursal);
    }

    @Override
    public void deleteSucursal(int id) {
        sucursalRepository.findById(id).orElseThrow(() -> new SucursalNotFoundException(id));
        sucursalRepository.deleteById(id);
    }
}
