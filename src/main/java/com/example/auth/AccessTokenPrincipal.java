package com.example.auth;
import com.okta.jwt.Jwt;
import java.security.Principal;

public class AccessTokenPrincipal implements Principal {
    private final Jwt accessToken;
    AccessTokenPrincipal(Jwt accessToken) {
        this.accessToken = accessToken;
    }
    @Override
    public String getName() {
        // the 'sub' claim in the access token will be the email address
        return (String) accessToken.getClaims().get("sub");
    }
}