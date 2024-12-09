package co.com.pragma.franquicias.domain.exceptions;

public class ProductoNotFoundException extends RuntimeException {
    private static final String ERROR_MESSAGE = "Error: No se encontró ningún Producto con el ID ";

    public ProductoNotFoundException(int productoId) {
        super(ERROR_MESSAGE + productoId);
    }
}
