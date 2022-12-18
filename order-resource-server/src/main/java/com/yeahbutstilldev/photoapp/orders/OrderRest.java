package com.yeahbutstilldev.photoapp.orders;

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderRest {

    private String orderId;
    private String productId;
    private String userId;
    private int quantity;
    private OrderStatus orderStatus;

}
