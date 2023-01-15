package food.deliverymy.domain;

import food.deliverymy.domain.*;
import food.deliverymy.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;

    public Rejected(StoreOrder aggregate){
        super(aggregate);
    }
    public Rejected(){
        super();
    }
}
