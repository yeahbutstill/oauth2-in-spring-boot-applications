package com.yeahbutstilldev.photoapp.oauthserver;

import org.junit.jupiter.api.Test;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpringSecurityConfigurationSymflowerTest {
	@Test
	public void configureSecurityFilterChain1() throws Exception {
		SpringSecurityConfiguration s = null; // TODO This is a fallback value due to incomplete analysis.
		HttpSecurity http = null; // TODO This is a fallback value due to incomplete analysis.
		SecurityFilterChain expected = null; // TODO This is a fallback value due to incomplete analysis.
		SecurityFilterChain actual = s.configureSecurityFilterChain(http);

		assertEquals(expected, actual);
	}

	@Test
	public void users2() {
		SpringSecurityConfiguration s = null; // TODO This is a fallback value due to incomplete analysis.
		UserDetailsService expected = null; // TODO This is a fallback value due to incomplete analysis.
		UserDetailsService actual = s.users();

		assertEquals(expected, actual);
	}
}
