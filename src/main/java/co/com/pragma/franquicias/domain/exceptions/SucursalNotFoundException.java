package co.com.pragma.franquicias.domain.exceptions;

public class SucursalNotFoundException extends RuntimeException {
    private static final String ERROR_MESSAGE = "Error: No se encontró ninguna Sucursal con el ID ";

    public SucursalNotFoundException(int sucursalId) {
        super(ERROR_MESSAGE + sucursalId);
    }
}
