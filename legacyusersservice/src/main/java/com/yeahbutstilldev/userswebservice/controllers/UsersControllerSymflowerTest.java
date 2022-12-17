package com.yeahbutstilldev.userswebservice.controllers;

import com.yeahbutstilldev.userswebservice.response.UserRest;
import com.yeahbutstilldev.userswebservice.response.VerifyPasswordResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersControllerSymflowerTest {
	@Test
	public void getUser1() {
		UsersController u = null; // TODO This is a fallback value due to incomplete analysis.
		String userName = null; // TODO This is a fallback value due to incomplete analysis.
		UserRest expected = null; // TODO This is a fallback value due to incomplete analysis.
		UserRest actual = u.getUser(userName);

		assertEquals(expected, actual);
	}

	@Test
	public void verifyUserPassword2() {
		UsersController u = null; // TODO This is a fallback value due to incomplete analysis.
		String userName = null; // TODO This is a fallback value due to incomplete analysis.
		String password = null; // TODO This is a fallback value due to incomplete analysis.
		VerifyPasswordResponse expected = null; // TODO This is a fallback value due to incomplete analysis.
		VerifyPasswordResponse actual = u.verifyUserPassword(userName, password);

		assertEquals(expected, actual);
	}
}
