package com.yeahbutstilldev.photoapp.orders;

import java.util.List;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class OrdersControllerSymflowerTest {
	@Test
	public void getOrders1() {
		OrdersController o = null; // TODO This is a fallback value due to incomplete analysis.
		List<OrderRest> expected = null; // TODO This is a fallback value due to incomplete analysis.
		List<OrderRest> actual = o.getOrders();

		assertEquals(expected, actual);
	}
}
