// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ku.cs.kafe.entity.OrderItem;
import ku.cs.kafe.entity.OrderItemKey;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> {
}
