package dashflight.jwt.cache;

import net.dashflight.data.redis.BasicRedisCache;

/**
 * Handles tracking valid refresh tokens. Uses redis database 0.
 */
public class RefreshTokenCache extends BasicRedisCache {

    public RefreshTokenCache() {
        super();
        this.database = 0;
    }
}
