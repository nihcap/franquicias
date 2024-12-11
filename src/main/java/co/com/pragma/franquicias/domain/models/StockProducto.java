package co.com.pragma.franquicias.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockProducto {
    private Integer id;
    private Producto producto;
    private int cantidad;
}