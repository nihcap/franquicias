package co.com.pragma.franquicias.domain.model;

import co.com.pragma.franquicias.domain.Constants;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = Constants.SUCURSALFRANQUICIA_TABLE_NAME, schema = "franquicia_db", uniqueConstraints = {
        @UniqueConstraint(name = "sucursal_franquicia_unique", columnNames = {"id_franquicia", "id_sucursal"})
})
public class SucursalFranquicia {
    @Id
    @Column(name = Constants.SUCURSALFRANQUICIA_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_franquicia", nullable = false)
    private Franquicia idFranquicia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_sucursal", nullable = false)
    private Sucursal idSucursal;

}