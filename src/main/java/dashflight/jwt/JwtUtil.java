package dashflight.jwt;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import config.parser.ConfigurationInjector;

public class JwtUtil {

    private JwtVerifier jwtVerifier = new JwtVerifier();

    static {
        ConfigurationInjector.withApplication("jwt-utils", "net.dashflight.data");
        ConfigurationInjector.withApplication("jwt-utils", "dashflight.jwt");
    }

    public DecodedJWT verifySession(String token, String tokenFgp) {
        DecodedJWT result = null;
        try {
            result = jwtVerifier.decodeJwtToken(token, tokenFgp);
        } catch (JWTVerificationException e) {
            e.printStackTrace();
        }

        return result;
    }
}
