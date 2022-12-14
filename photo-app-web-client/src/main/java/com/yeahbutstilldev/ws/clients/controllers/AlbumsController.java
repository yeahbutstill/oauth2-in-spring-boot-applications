package com.yeahbutstilldev.ws.clients.controllers;

import com.yeahbutstilldev.ws.clients.response.AlbumRest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@Slf4j
public class AlbumsController {

    @Autowired
    OAuth2AuthorizedClientService oauth2ClientService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/albums")
    public String getAlbums(Model model, @AuthenticationPrincipal OidcUser principal) {

        Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
        OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) authentication;
        OAuth2AuthorizedClient oauth2Client = oauth2ClientService.loadAuthorizedClient(oauthToken.getAuthorizedClientRegistrationId(),
                oauthToken.getName());
        String jwtAccessToken = oauth2Client.getAccessToken().getTokenValue();
        log.info("jwtAccessToken = {}", jwtAccessToken);
        log.info("Principal = {}", principal);

        OidcIdToken idToken = principal.getIdToken();
        String idTokenValue = idToken.getTokenValue();
        log.info("idTokenValue = {}", idTokenValue);

        String url = "http://localhost:8082/albums";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + jwtAccessToken);
        HttpEntity<List<AlbumRest>> entity = new HttpEntity<>(headers);
        ResponseEntity<List<AlbumRest>> responseEntity =  restTemplate.exchange(
                url, HttpMethod.GET, entity, new ParameterizedTypeReference<>() {}
        );

        List<AlbumRest> albums = responseEntity.getBody();

        model.addAttribute("albums", albums);

        return "albums";

//        AlbumRest album = new AlbumRest();
//        album.setAlbumId("album");
//        album.setAlbumTitle("Album title");
//        album.setAlbumUrl("http://localhost:8082/api/v1/albums/default");
//        album.setAlbumDescription("Album description");
//
//        AlbumRest album1 = new AlbumRest();
//        album1.setAlbumId("albumOne");
//        album1.setAlbumTitle("Album one title");
//        album1.setAlbumUrl("http://localhost:8082/api/v1/albums/1");
//        album1.setAlbumDescription("Album one description");
//
//        AlbumRest album2 = new AlbumRest();
//        album2.setAlbumId("albumTwo");
//        album2.setAlbumTitle("Album two title");
//        album2.setAlbumUrl("http://localhost:8082/api/v1/albums/2");
//        album2.setAlbumDescription("Album two description");
//
//        AlbumRest album3 = new AlbumRest();
//        album3.setAlbumId("albumThree");
//        album3.setAlbumTitle("Album three title");
//        album3.setAlbumUrl("http://localhost:8082/api/v1/albums/3");
//        album3.setAlbumDescription("Album three description");
//
//        AlbumRest album4 = new AlbumRest();
//        album4.setAlbumId("albumFour");
//        album4.setAlbumTitle("Album four title");
//        album4.setAlbumUrl("http://localhost:8082/api/v1/albums/4");
//        album4.setAlbumDescription("Album four description");
//
//        model.addAttribute("albums", Arrays.asList(album, album1, album2, album3, album4));

//        return "albums";

    }



}
