// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "category")
    List<Menu> menus;
}
