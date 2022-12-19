package com.yeahbutstilldev.photoapp.orders;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdersControllerSymflowerTest {
	@Test
	public void getOrders1() {
		OrdersController o = null; // TODO This is a fallback value due to incomplete analysis.
		List<OrderRest> expected = null; // TODO This is a fallback value due to incomplete analysis.
		List<OrderRest> actual = o.getOrders();

		assertEquals(expected, actual);
	}
}
