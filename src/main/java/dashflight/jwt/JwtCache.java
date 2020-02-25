package dashflight.jwt;

import net.dashflight.data.redis.BasicRedisCache;

/**
 * Acts as a blacklist for invalidated JWTs. Uses redis database 1.
 */
public class JwtCache extends BasicRedisCache {

    public JwtCache() {
        super();
        this.database = 1;
    }
}
