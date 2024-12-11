package co.com.pragma.franquicias.infrastructure.entities;

import co.com.pragma.franquicias.domain.Constants;
import co.com.pragma.franquicias.domain.models.Sucursal;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = Constants.SUCURSAL_TABLE_NAME, schema = Constants.SCHEMA_NAME)
public class SucursalEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = Constants.SUCURSAL_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @Column(name = Constants.SUCURSAL_COLUMN_NOMBRE_NAME, nullable = false, length = 50)
    private String nombre;

    public static SucursalEntity fromDomainModel(Sucursal sucursal) {
        return new SucursalEntity(sucursal.getId(), sucursal.getNombre());
    }

    public Sucursal toDomainModel() {
        return new Sucursal(id, nombre, List.of());
    }

}