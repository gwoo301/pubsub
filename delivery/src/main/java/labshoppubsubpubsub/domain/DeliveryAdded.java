package labshoppubsubpubsub.domain;

import java.time.LocalDate;
import java.util.*;
import labshoppubsubpubsub.domain.*;
import labshoppubsubpubsub.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryAdded extends AbstractEvent {

    private Long id;
    private String customerId;
    private String address;
    private String status;

    public DeliveryAdded(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryAdded() {
        super();
    }
}
//>>> DDD / Domain Event
