package co.com.pragma.franquicias.infrastructure.entities;

import co.com.pragma.franquicias.domain.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = Constants.PRODUCTO_TABLE_NAME, schema = Constants.SCHEMA_NAME)
public class Producto implements Serializable {
    @Id
    @Column(name = Constants.PRODUCTO_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @Column(name = Constants.PRODUCTO_COLUMN_NOMBRE_NAME, nullable = false, length = 50)
    private String nombre;

}