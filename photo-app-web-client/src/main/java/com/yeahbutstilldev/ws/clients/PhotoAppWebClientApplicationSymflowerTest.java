package com.yeahbutstilldev.ws.clients;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.web.reactive.function.client.WebClient;

public class PhotoAppWebClientApplicationSymflowerTest {
	@Test
	public void main1() {
		String[] args = null; // TODO This is a fallback value due to incomplete analysis.
		PhotoAppWebClientApplication.main(args);
	}

	@Test
	public void webClient2() {
		PhotoAppWebClientApplication p = null; // TODO This is a fallback value due to incomplete analysis.
		ClientRegistrationRepository clientRegistrationrepository = null; // TODO This is a fallback value due to incomplete analysis.
		OAuth2AuthorizedClientRepository oAuth2AuthorizedClientRepository = null; // TODO This is a fallback value due to incomplete analysis.
		WebClient expected = null; // TODO This is a fallback value due to incomplete analysis.
		WebClient actual = p.webClient(clientRegistrationrepository, oAuth2AuthorizedClientRepository);

		assertEquals(expected, actual);
	}
}
