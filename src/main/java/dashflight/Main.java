package dashflight;

import com.auth0.jwt.interfaces.DecodedJWT;
import dashflight.jwt.JwtCreator;
import dashflight.jwt.JwtUtil;
import dashflight.jwt.SecuredJwtToken;

public class Main {

    public static void main(String[] args) {
        DecodedJWT jwt = new JwtUtil().verifySession(
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJ1c2VyX2lkIjoiOTExOWFjNDYtMmZmYi0xMWVhLTk3OGYtMmU3MjhjZTg4MTI1IiwiaXNzIjoiaHR0cHM6Ly9hcGkuZGFzaGZsaWdodC5uZXQiLCJleHAiOjE1ODI5OTgzNjQsImlhdCI6MTU4Mjk5NzQ2NCwidXNlcl9maW5nZXJwcmludCI6IkFEQkMyRUNCMjMxQ0ZCRUIwMDVBNkE5N0JDNzQ2NUVEOTE5NTUxMTc4NkEzNjQzRjdFREY5RjZERjFBOTFBQ0QifQ.aCllk0o3b-V_6z1FkSBKNXNorjBJOl0W8FuEZNrY5U7z5TWXJ3Okpuj_bkebu3G5DT1ttPZYcNGn2sqosREYJ85X6QhsIsh_2nDYZ_GB0aXKzJ0-37QRupc7p8LN4N7I02EW1iDIgu9F3beBHanh1pAj9DT_7WV1ChGjT5scaL8",
                "BD0C4C1A25F94F390D29C68D97BC18B74F6F7894C646E4A52B8D8E945200235D7F65B669864D59C54357C1BF209346B36BFD939CE562FAB21D4A5FBA49626F65");

        System.out.println(jwt.getClaim("user_id").asString());
        System.out.println(jwt.getExpiresAt());

        SecuredJwtToken token = new JwtCreator().generateJwt("testuid");

        System.out.println(token.getToken());
        System.out.println(token.getFingerprint());
    }
}
