package co.com.pragma.franquicias.infrastructure.entities;

import co.com.pragma.franquicias.domain.Constants;
import co.com.pragma.franquicias.domain.models.Franquicia;
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
@Table(name = Constants.FRANQUICIA_TABLE_NAME, schema = Constants.SCHEMA_NAME)
public class FranquiciaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = Constants.FRANQUICIA_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @Column(name = Constants.FRANQUICIA_COLUMN_NOMBRE_NAME, nullable = false, length = 50)
    private String nombre;

    public static FranquiciaEntity fromDomainModel(Franquicia franquicia) {
        return new FranquiciaEntity(franquicia.getId(), franquicia.getNombre());
    }

    public Franquicia toDomainModel() {
        return new Franquicia(id, nombre, List.of());
    }

}