package dev.utsav.productServicettsevening.client.authenticationClient;

import dev.utsav.productServicettsevening.client.authenticationClient.dtos.TokenRequestDto;
import dev.utsav.productServicettsevening.client.authenticationClient.dtos.TokenResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class AuthenticationClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    public Optional<TokenResponseDto> validate(String token) {
        TokenRequestDto tokenRequestDto  = new TokenRequestDto();
        tokenRequestDto.setToken(token);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<TokenResponseDto> response = restTemplate.postForEntity("http://localhost:9000/auth/validate/",tokenRequestDto, TokenResponseDto.class);
        return Optional.of(response.getBody());
    }
}
