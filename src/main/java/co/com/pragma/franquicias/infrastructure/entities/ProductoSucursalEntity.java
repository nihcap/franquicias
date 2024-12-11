package co.com.pragma.franquicias.infrastructure.entities;

import co.com.pragma.franquicias.domain.Constants;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = Constants.PRODUCTOSUCURSAL_TABLE_NAME, schema = "franquicia_db", uniqueConstraints = {
        @UniqueConstraint(name = "producto_sucursal_unique", columnNames = {"id_sucursal_franquicia", "id_producto"})
})
public class ProductoSucursalEntity implements Serializable {
    @Id
    @Column(name = Constants.PRODUCTOSUCURSAL_COLUMN_ID_NAME, nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_sucursal_franquicia", nullable = false)
    @ToString.Exclude
    private SucursalFranquiciaEntity idSucursalFranquicia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_producto", nullable = false)
    @ToString.Exclude
    private ProductoEntity idProducto;

    @Column(name = Constants.PRODUCTOSUCURSAL_COLUMN_CANTIDADSTOCK_NAME, nullable = false)
    private Long cantidadStock;

}