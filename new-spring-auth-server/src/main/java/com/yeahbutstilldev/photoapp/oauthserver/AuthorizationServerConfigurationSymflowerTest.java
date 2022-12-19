package com.yeahbutstilldev.photoapp.oauthserver;

import com.nimbusds.jose.jwk.source.JWKSource;
import org.junit.jupiter.api.Test;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.config.ProviderSettings;
import org.springframework.security.web.SecurityFilterChain;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorizationServerConfigurationSymflowerTest {
	@Test
	public void authorizationServerSecurityFilterChain1() throws Exception {
		AuthorizationServerConfiguration a = null; // TODO This is a fallback value due to incomplete analysis.
		HttpSecurity http = null; // TODO This is a fallback value due to incomplete analysis.
		SecurityFilterChain expected = null; // TODO This is a fallback value due to incomplete analysis.
		SecurityFilterChain actual = a.authorizationServerSecurityFilterChain(http);

		assertEquals(expected, actual);
	}

	@Test
	public void jwkSource2() throws NoSuchAlgorithmException {
		AuthorizationServerConfiguration a = null; // TODO This is a fallback value due to incomplete analysis.
		JWKSource expected = null; // TODO This is a fallback value due to incomplete analysis.
		JWKSource actual = a.jwkSource();

		assertEquals(expected, actual);
	}

	@Test
	public void jwtDecoder3() {
		AuthorizationServerConfiguration a = null; // TODO This is a fallback value due to incomplete analysis.
		JWKSource jwkSource = null; // TODO This is a fallback value due to incomplete analysis.
		JwtDecoder expected = null; // TODO This is a fallback value due to incomplete analysis.
		JwtDecoder actual = a.jwtDecoder(jwkSource);

		assertEquals(expected, actual);
	}

	@Test
	public void providerSettings4() {
		AuthorizationServerConfiguration a = null; // TODO This is a fallback value due to incomplete analysis.
		ProviderSettings expected = null; // TODO This is a fallback value due to incomplete analysis.
		ProviderSettings actual = a.providerSettings();

		assertEquals(expected, actual);
	}

	@Test
	public void registeredClientRepository5() {
		AuthorizationServerConfiguration a = null; // TODO This is a fallback value due to incomplete analysis.
		RegisteredClientRepository expected = null; // TODO This is a fallback value due to incomplete analysis.
		RegisteredClientRepository actual = a.registeredClientRepository();

		assertEquals(expected, actual);
	}
}
