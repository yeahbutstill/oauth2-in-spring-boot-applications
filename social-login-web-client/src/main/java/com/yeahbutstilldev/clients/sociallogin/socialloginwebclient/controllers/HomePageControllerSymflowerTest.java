package com.yeahbutstilldev.clients.sociallogin.socialloginwebclient.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageControllerSymflowerTest {
	@Test
	public void displayHomePage1() {
		HomePageController h = null; // TODO This is a fallback value due to incomplete analysis.
		Model model = null; // TODO This is a fallback value due to incomplete analysis.
		OAuth2User principal = null; // TODO This is a fallback value due to incomplete analysis.
		String expected = null; // TODO This is a fallback value due to incomplete analysis.
		String actual = h.displayHomePage(model, principal);

		assertEquals(expected, actual);
	}
}
