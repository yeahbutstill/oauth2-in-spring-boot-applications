package com.yeahbutstilldev.photoapp.orders.web.oauth.client;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private String orderId;
	private String productId;
	private String userId;
	private int quantity;
	private OrderStatus orderStatus;

}
