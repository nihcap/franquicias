package co.com.pragma.franquicias.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {
    private Integer id;
    private String nombre;
    private List<Producto> listaProductos;
}