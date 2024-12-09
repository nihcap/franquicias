package co.com.pragma.franquicias.domain.model;

import co.com.pragma.franquicias.domain.Constants;
import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = Constants.FRANQUICIA_TABLE_NAME, schema = "franquicia_db")
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = Constants.FRANQUICIA_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @Column(name = Constants.FRANQUICIA_COLUMN_NOMBRE_NAME, nullable = false, length = 50)
    private String nombre;

}