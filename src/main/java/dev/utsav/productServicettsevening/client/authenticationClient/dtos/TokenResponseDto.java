package dev.utsav.productServicettsevening.client.authenticationClient.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenResponseDto {
    UserResDto userResDto;
    SessionStatus sessionStatus;
}
