package food.deliverymy.domain;

import food.deliverymy.domain.*;
import food.deliverymy.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private String preference;
    private Long orderId;
    private String status;
}


