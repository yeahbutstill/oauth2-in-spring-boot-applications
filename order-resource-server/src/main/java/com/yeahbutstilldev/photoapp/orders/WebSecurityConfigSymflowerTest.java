package com.yeahbutstilldev.photoapp.orders;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class WebSecurityConfigSymflowerTest {
	@Test
	public void securityFilterChain1() throws Exception {
		WebSecurityConfig w = null; // TODO This is a fallback value due to incomplete analysis.
		HttpSecurity http = null; // TODO This is a fallback value due to incomplete analysis.
		SecurityFilterChain expected = null; // TODO This is a fallback value due to incomplete analysis.
		SecurityFilterChain actual = w.securityFilterChain(http);

		assertEquals(expected, actual);
	}
}
