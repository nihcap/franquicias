package co.com.pragma.franquicias.infrastructure.config;

import co.com.pragma.franquicias.application.services.FranquiciaService;
import co.com.pragma.franquicias.application.services.ProductoService;
import co.com.pragma.franquicias.application.services.SucursalService;
import co.com.pragma.franquicias.application.usecases.*;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;
import co.com.pragma.franquicias.domain.ports.out.ProductoRepositoryPort;
import co.com.pragma.franquicias.domain.ports.out.SucursalRepositoryPort;
import co.com.pragma.franquicias.infrastructure.repositories.JpaFranquiciaRepositoryAdapter;
import co.com.pragma.franquicias.infrastructure.repositories.JpaProductoRepositoryAdapter;
import co.com.pragma.franquicias.infrastructure.repositories.JpaSucursalRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public FranquiciaService franquiciaService(FranquiciaRepositoryPort franquiciaRepositoryPort) {
        return new FranquiciaService(
                new CrearFranquiciaUseCaseImpl(franquiciaRepositoryPort),
                new ListarFranquiciaUseCaseImpl(franquiciaRepositoryPort),
                new ModificarFranquiciaUseCaseImpl(franquiciaRepositoryPort),
                new EliminarFranquiciaUseCaseImpl(franquiciaRepositoryPort)
        );
    }

    @Bean
    public ProductoService productoService(ProductoRepositoryPort productoRepositoryPort){
        return new ProductoService(
                new CrearProductoUseCaseImpl(productoRepositoryPort),
                new ListarProductoUseCaseImpl(productoRepositoryPort),
                new ModificarProductoUseCaseImpl(productoRepositoryPort),
                new EliminarProductoUseCaseImpl(productoRepositoryPort)
        );
    }

    @Bean
    public SucursalService sucursalService(SucursalRepositoryPort sucursalRepositoryPort){
        return new SucursalService(
                new CrearSucursalUseCaseImpl(sucursalRepositoryPort),
                new ListarSucursalUseCaseImpl(sucursalRepositoryPort),
                new ModificarSucursalUseCaseImpl(sucursalRepositoryPort),
                new EliminarSucursalUseCaseImpl(sucursalRepositoryPort)
        );
    }

    @Bean
    public FranquiciaRepositoryPort franquiciaRepositoryPort(JpaFranquiciaRepositoryAdapter jpaFranquiciaRepositoryAdapter) {
        return jpaFranquiciaRepositoryAdapter;
    }

    @Bean
    public ProductoRepositoryPort productoRepositoryPort(JpaProductoRepositoryAdapter jpaProductoRepositoryAdapter) {
        return jpaProductoRepositoryAdapter;
    }

    @Bean
    public SucursalRepositoryPort sucursalRepositoryPort(JpaSucursalRepositoryAdapter jpaSucursalRepositoryAdapter) {
        return jpaSucursalRepositoryAdapter;
    }

}
