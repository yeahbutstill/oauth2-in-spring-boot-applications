package com.yeahbutstilldev.photoapp.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/order")
public class OrdersController {

    @GetMapping("/orders")
    public List<OrderRest> getOrders() {

        OrderRest order1 = new OrderRest(UUID.randomUUID().toString(),
                "product-id-1",
                "user-id-1",
                1,
                OrderStatus.NEW);

        OrderRest order2 = new OrderRest(UUID.randomUUID().toString(),
                "product-id-2",
                "user-id-2",
                2,
                OrderStatus.NEW);

        OrderRest order3 = new OrderRest(UUID.randomUUID().toString(),
                "product-id-3",
                "user-id-3",
                10,
                OrderStatus.NEW);

        OrderRest order4 = new OrderRest(UUID.randomUUID().toString(),
                "product-id-4",
                "user-id-4",
                100,
                OrderStatus.NEW);

        return Arrays.asList(order1, order2, order3, order4);

    }

}
