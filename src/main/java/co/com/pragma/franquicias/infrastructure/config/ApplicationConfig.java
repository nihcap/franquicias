package co.com.pragma.franquicias.infrastructure.config;

import co.com.pragma.franquicias.application.services.FranquiciaService;
import co.com.pragma.franquicias.application.usecases.CrearFranquiciaUseCaseImpl;
import co.com.pragma.franquicias.application.usecases.EliminarFranquiciaUseCaseImpl;
import co.com.pragma.franquicias.application.usecases.ListarFranquiciaUseCaseImpl;
import co.com.pragma.franquicias.application.usecases.ModificarFranquiciaUseCaseImpl;
import co.com.pragma.franquicias.domain.ports.out.ExternalServicePort;
import co.com.pragma.franquicias.domain.ports.out.FranquiciaRepositoryPort;
import co.com.pragma.franquicias.infrastructure.adapters.ExternalServiceAdapter;
import co.com.pragma.franquicias.infrastructure.repositories.JpaFranquiciaRepositoryAdapter;
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
    public FranquiciaRepositoryPort franquiciaRepositoryPort(JpaFranquiciaRepositoryAdapter jpaFranquiciaRepositoryAdapter) {
        return jpaFranquiciaRepositoryAdapter;
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
