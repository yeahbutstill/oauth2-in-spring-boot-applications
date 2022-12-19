package com.yeahbutstilldev.photoapp.orders.web.oauth.client;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.ui.Model;

public class OrdersControllerSymflowerTest {
	@Test
	public void getOrders1() {
		OrdersController o = null; // TODO This is a fallback value due to incomplete analysis.
		Model model = null; // TODO This is a fallback value due to incomplete analysis.
		OAuth2AuthorizedClient authorizedClient = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = o.getOrders(model, authorizedClient);

		assertEquals(expected, actual);
	}
}
