package com.yeahbutstilldev.ws.api.albums.controllers;

import com.yeahbutstilldev.ws.api.albums.response.AlbumRest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumsControllerSymflowerTest {
	@Test
	public void getAlbums1() {
		AlbumsController a = null; // TODO This is a fallback value due to incomplete analysis.
		List<AlbumRest> expected = null; // TODO This is a fallback value due to incomplete analysis.
		List<AlbumRest> actual = a.getAlbums();

		assertEquals(expected, actual);
	}
}
