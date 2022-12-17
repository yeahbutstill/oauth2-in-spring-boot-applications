package com.yeahbutstilldev.userswebservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.context.event.ApplicationReadyEvent;

public class InitialSetupSymflowerTest {
	@Test
	public void onApplicationEvent1() {
		InitialSetup i = null; // TODO This is a fallback value due to incomplete analysis.
		ApplicationReadyEvent event = null; // TODO This is a fallback value due to incomplete analysis.
		i.onApplicationEvent(event);
	}
}
