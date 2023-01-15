package food.deliverymy.domain;

import food.deliverymy.domain.*;
import food.deliverymy.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;

    public DeliveryCompleted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCompleted(){
        super();
    }
}
