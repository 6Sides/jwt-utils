package dashflight;

import com.auth0.jwt.interfaces.DecodedJWT;
import dashflight.jwt.JwtUtil;

public class Main {

    public static void main(String[] args) {
        DecodedJWT jwt = new JwtUtil().verifySession(
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJ1c2VyX2lkIjoiOTExOWFjNDYtMmZmYi0xMWVhLTk3OGYtMmU3MjhjZTg4MTI1IiwiaXNzIjoiaHR0cHM6Ly9hcGkuZGFzaGZsaWdodC5uZXQiLCJleHAiOjE1ODI2NzA0MzksImlhdCI6MTU4MjY2OTUzOSwidXNlcl9maW5nZXJwcmludCI6IkIyQjAwMzNBNjBERDAzMTY4OTBGQTlBOTc3OTAyNTE3RkNCRDNEMENFMURERDdCOUYxMzVGNkVCMjI2NUYzMzgifQ.OO85LNI5HwIWNRxYt6YaQd1WJ52-0fDTvbN1ohzA-tpCMFAICc51argPkKhRFwkkRcjrmACxZgxAfTABcyRrspNWgLTntMWb_pRcCaJc-SCJbNNjuF5SpgPnDsTbsoJxHb1UrxcHYOHf7KnT04D46Wk04am3wX_fqP_1mqMqcgw",
                "C4D12AF5BD72044159E355A032995117CE553B8077C6CF1BCF6C8B7A5C7D7F30DE4D19D0F5364D2B793EAF3AE2D8F71A52A16DCD7E399D5C1D0E5726A5BBB085");

        System.out.println(jwt.getClaim("user_id").asString());
    }
}
