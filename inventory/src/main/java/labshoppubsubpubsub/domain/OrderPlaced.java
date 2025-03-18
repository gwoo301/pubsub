package labshoppubsubpubsub.domain;

import java.util.*;
import labshoppubsubpubsub.domain.*;
import labshoppubsubpubsub.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String address;
}
