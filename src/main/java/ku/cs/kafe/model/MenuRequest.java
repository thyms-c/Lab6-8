// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.model;

import java.util.UUID;

import lombok.Data;

@Data
public class MenuRequest {
    private UUID categoryId;

    private String name;
    private double price;
}