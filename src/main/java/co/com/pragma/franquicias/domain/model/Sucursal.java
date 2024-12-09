package co.com.pragma.franquicias.domain.model;

import co.com.pragma.franquicias.domain.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = Constants.SUCURSAL_TABLE_NAME, schema = "franquicia_db")
public class Sucursal {
    @Id
    @Column(name = Constants.SUCURSAL_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @Column(name = Constants.SUCURSAL_COLUMN_NOMBRE_NAME, nullable = false, length = 50)
    private String nombre;

}