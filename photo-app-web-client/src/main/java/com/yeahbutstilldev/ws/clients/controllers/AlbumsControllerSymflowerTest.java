package com.yeahbutstilldev.ws.clients.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumsControllerSymflowerTest {
	@Test
	public void getAlbums1() {
		AlbumsController a = null; // TODO This is a fallback value due to incomplete analysis.
		Model model = null; // TODO This is a fallback value due to incomplete analysis.
		OidcUser principal = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = a.getAlbums(model, principal);

		assertEquals(expected, actual);
	}
}
