package com.yeahbutstilldev.clients.sociallogin.socialloginwebclient.security;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.cors.CorsConfigurationSource;

public class WebSecuritySymflowerTest {
	@Test
	public void configure1() throws Exception {
		WebSecurity w = null; // TODO This is a fallback value due to incomplete analysis.
		HttpSecurity http = null; // TODO This is a fallback value due to incomplete analysis.
		w.configure(http);
	}

	@Test
	public void corsConfigurationSource2() {
		WebSecurity w = null; // TODO This is a fallback value due to incomplete analysis.
		CorsConfigurationSource expected = null; // TODO This is a fallback value due to incomplete analysis.
		CorsConfigurationSource actual = w.corsConfigurationSource();

		assertEquals(expected, actual);
	}
}
