// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.entity;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class OrderItemKey implements Serializable {

    @Column(name = "order_id")
    private UUID orderId;

    @Column(name = "menu_id")
    private UUID menuId;
}
