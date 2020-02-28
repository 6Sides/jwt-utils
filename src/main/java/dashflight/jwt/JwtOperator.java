package dashflight.jwt;

import net.dashflight.data.ConfigurableDataSource;
import net.dashflight.data.keys.DefaultRSAKeyManager;
import net.dashflight.data.keys.RSAKeyManagerFactory;

/**
 * Base class for services handling Jwt manipulation.
 * Stores some common fields necessary for Jwt creation/verification.
 */
public abstract class JwtOperator extends ConfigurableDataSource {

    protected static final String ISSUER = "https://api.dashflight.net";

    // protected final TokenCipher tokenCipher = new TokenCipher();
    protected final FingerprintService fgpService = new FingerprintService();

    protected DefaultRSAKeyManager keyManager = RSAKeyManagerFactory.withDefaults();

    public JwtOperator() {
        super("jwt-utils");
    }
}
