package dashflight.jwt.random;

public interface RandomGenerator {

    /**
     * Populates the specified array with random bytes
     */
    void nextBytes(byte[] bytes);

}
