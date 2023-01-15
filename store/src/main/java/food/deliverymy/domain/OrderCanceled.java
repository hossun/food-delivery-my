package food.deliverymy.domain;

import food.deliverymy.domain.*;
import food.deliverymy.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodId;
    private String customerId;
    private String preference;
}


