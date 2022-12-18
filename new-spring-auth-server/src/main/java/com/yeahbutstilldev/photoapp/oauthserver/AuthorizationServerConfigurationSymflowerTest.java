package com.yeahbutstilldev.photoapp.oauthserver;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;

public class AuthorizationServerConfigurationSymflowerTest {
	@Test
	public void registeredClientRepository1() {
		AuthorizationServerConfiguration a = null; // TODO This is a fallback value due to incomplete analysis.
		RegisteredClientRepository expected = null; // TODO This is a fallback value due to incomplete analysis.
		RegisteredClientRepository actual = a.registeredClientRepository();

		assertEquals(expected, actual);
	}
}
