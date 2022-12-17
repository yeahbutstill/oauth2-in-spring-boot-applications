package com.yeahbutstilldev.userswebservice.service.impl;

import com.yeahbutstilldev.userswebservice.response.UserRest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersServiceImplSymflowerTest {
	@Test
	public void getUserDetails1() {
		UsersServiceImpl u = null; // TODO This is a fallback value due to incomplete analysis.
		String userName = null; // TODO This is a fallback value due to incomplete analysis.
		String password = null; // TODO This is a fallback value due to incomplete analysis.
		UserRest expected = null; // TODO This is a fallback value due to incomplete analysis.
		UserRest actual = u.getUserDetails(userName, password);

		assertEquals(expected, actual);
	}

	@Test
	public void getUserDetails2() {
		UsersServiceImpl u = null; // TODO This is a fallback value due to incomplete analysis.
		String userName = null; // TODO This is a fallback value due to incomplete analysis.
		UserRest expected = null; // TODO This is a fallback value due to incomplete analysis.
		UserRest actual = u.getUserDetails(userName);

		assertEquals(expected, actual);
	}
}
