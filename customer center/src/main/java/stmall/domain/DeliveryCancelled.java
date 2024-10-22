package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productName;
    private String productId;
    private String qty;
    private String address;
    private String status;
}
