package com.alibou.security.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthenticationResponse {

  private String accessToken;
  private String refreshToken;
  private boolean mfaEnabled;
  private String secretImageUri;
  private Long id ;
  private String email;
  private String password;
  private String firstname ;
  private String lastname ;
  private String role  ;
}
