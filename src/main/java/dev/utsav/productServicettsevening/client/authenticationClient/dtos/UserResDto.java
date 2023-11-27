package dev.utsav.productServicettsevening.client.authenticationClient.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResDto {
    private String email;
    private String fullName;
    private Long id;
}
