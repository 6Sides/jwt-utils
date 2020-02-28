package dashflight.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import java.time.Instant;
import java.util.Date;
import net.dashflight.data.ConfigValue;

/**
 * Handles creating JWTs
 */
public class JwtCreator extends JwtOperator {

    @ConfigValue("access_token_ttl")
    private int ACCESS_TOKEN_TTL;


    /**
     * Creates a secure JWT with the userId encoded in its payload.
     *
     * How it works:
     *      1. Random fingerprint is generated.
     *      2. JWT is created storing any necessary claims and the hash of the fingerprint.
     *      3. The JWT is ciphered to obfuscate any internal data stored in the payload.
     */
    public SecuredJwtToken generateJwt(String userId) {
        try {
            String fgp = fgpService.generateRandomFingerprint();

            String token = JWT.create()
                            .withIssuer(ISSUER)
                            .withIssuedAt(new Date())
                            .withExpiresAt(Date.from(Instant.now().plusSeconds(ACCESS_TOKEN_TTL)))
                            .withClaim("user_id", userId)
                            .withClaim("user_fingerprint", fgpService.hashFingerprint(fgp))
                            .sign(Algorithm.RSA512(null, keyManager.getPrivateKey()));

            // return new SecuredJwtToken(tokenCipher.cipherToken(token), fgp);
            return new SecuredJwtToken(token, fgp);
        } catch (JWTCreationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
