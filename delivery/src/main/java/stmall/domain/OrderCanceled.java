package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private String productId;
    private String qty;
    private String status;
    private String address;
}
