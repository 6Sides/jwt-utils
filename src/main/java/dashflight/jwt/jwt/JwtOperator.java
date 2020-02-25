package dashflight.jwt.jwt;


import dashflight.jwt.FingerprintService;
import dashflight.jwt.keys.DefaultRSAKeyManager;
import dashflight.jwt.keys.RSAKeyManager;

/**
 * Base class for services handling Jwt manipulation.
 * Stores some common fields necessary for Jwt creation/verification.
 */
public abstract class JwtOperator {

    protected static final String ISSUER = "https://api.dashflight.net";

    // protected final TokenCipher tokenCipher = new TokenCipher();
    protected final FingerprintService fgpService = new FingerprintService();

    protected RSAKeyManager keyManager = new DefaultRSAKeyManager();

}
