package com.yeahbutstilldev.ws.clients;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhotoAppWebClientApplicationSymflowerTest {
	@Test
	public void getRestTemplate1() {
		PhotoAppWebClientApplication p = null; // TODO This is a fallback value due to incomplete analysis.
		RestTemplate expected = null; // TODO This is a fallback value due to incomplete analysis.
		RestTemplate actual = p.getRestTemplate();

		assertEquals(expected, actual);
	}

	@Test
	public void main2() {
		String[] args = null; // TODO This is a fallback value due to incomplete analysis.
		PhotoAppWebClientApplication.main(args);
	}
}
