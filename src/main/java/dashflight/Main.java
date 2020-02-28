package dashflight;

import com.auth0.jwt.interfaces.DecodedJWT;
import dashflight.jwt.JwtCreator;
import dashflight.jwt.JwtUtil;
import dashflight.jwt.SecuredJwtToken;

public class Main {

    public static void main(String[] args) {
        DecodedJWT jwt = new JwtUtil().verifySession(
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJ1c2VyX2lkIjoidGVzdHVpZCIsImlzcyI6Imh0dHBzOi8vYXBpLmRhc2hmbGlnaHQubmV0IiwiZXhwIjoxNTgyOTE1NDUyMTQ2LCJpYXQiOjE1ODI5MTU0NTIsInVzZXJfZmluZ2VycHJpbnQiOiJBOUMzNzNBNUI5RURBMzcxQTQ0QzRCRTQxRjI0RDQ0MzY3MEQxMTdEREM0RUJCOTk5QTk3RDAwNUUxOUFGRkY1In0.Fcm7WgVOH1G8Qn3uRFpFPPwLmInePyYDW0RbBOdA2JY2RkE2Vpv-8HzOnABic93j0ZM2lETDusZMSmRPgwD4u7OClStexMebDBweVnrJRyrdKZdo_B7yYrkIVjbBid-wAG1YDdc4eW20tYy2o1TaXQ1QB0_K10JrTay5gbVH67k",
                "33994B3CC77C5AFAE8D707B4ED733BCF056ECB697C96EDBBFA98506B8ACDEAFE13D929AB2340E2479FD98750B6C9693A1DE3EF17732F1E7AB4AAC0988C2547AC");

        System.out.println(jwt.getClaim("user_id").asString());

        SecuredJwtToken token = new JwtCreator().generateJwt("testuid");

        System.out.println(token.getToken());
        System.out.println(token.getFingerprint());
    }
}
