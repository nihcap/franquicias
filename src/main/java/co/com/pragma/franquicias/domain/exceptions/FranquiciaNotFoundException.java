package co.com.pragma.franquicias.domain.exceptions;

public class FranquiciaNotFoundException extends RuntimeException {
    private static final String ERROR_MESSAGE = "Error: No se encontró ninguna Franquicia con el ID ";

    public FranquiciaNotFoundException(int franquiciaId) {
        super(ERROR_MESSAGE + franquiciaId);
    }
}
