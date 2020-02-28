package dashflight;

import com.auth0.jwt.interfaces.DecodedJWT;
import dashflight.jwt.JwtCreator;
import dashflight.jwt.JwtUtil;
import dashflight.jwt.SecuredJwtToken;

public class Main {

    public static void main(String[] args) {
        DecodedJWT jwt = new JwtUtil().verifySession(
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJ1c2VyX2lkIjoidGVzdHVpZCIsImlzcyI6Imh0dHBzOi8vYXBpLmRhc2hmbGlnaHQubmV0IiwiZXhwIjoxNTgyOTIwMTMzLCJpYXQiOjE1ODI5MTkyMzMsInVzZXJfZmluZ2VycHJpbnQiOiIzRDQ5MDc0REJBRDIwNjk0MDZGOEE0MUJDNkI0MDc1MjExRDVDNkRGMUNFRUQzOUI3QzQxNUY0NDMxMTI5OUYyIn0.TxyviN7qr9zIMcaX1LnmonqpYKQjzcovnZeqQikbfqe5Bdy6ESZBLcuJADcQqp1U-4SyhzMhUn3BcieVPMH3gDCmF2EjuBrMqxiqSDlEPZgWeqE_c2FpWkBvBK2lK5buAaKY75sbBU7wVfYiaH0G2rKKvHzvsTsV7Eh7AHITpUM",
                "B36E2C9B0ECCF591C1630D79BDCBD364F43E023909FE36A6B074D7845D2B22F42C153C76D96BA750FE7111997CA719D399AD8533E7B03670446E6621CFEA6286");

        System.out.println(jwt.getClaim("user_id").asString());
        System.out.println(jwt.getExpiresAt());

        SecuredJwtToken token = new JwtCreator().generateJwt("testuid");

        System.out.println(token.getToken());
        System.out.println(token.getFingerprint());
    }
}
