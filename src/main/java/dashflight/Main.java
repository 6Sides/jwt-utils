package dashflight;

import com.auth0.jwt.interfaces.DecodedJWT;
import dashflight.jwt.JwtUtil;

public class Main {

    public static void main(String[] args) {
        DecodedJWT jwt = new JwtUtil().verifySession(
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJ1c2VyX2lkIjoiOTExOWFjNDYtMmZmYi0xMWVhLTk3OGYtMmU3MjhjZTg4MTI1IiwiaXNzIjoiaHR0cHM6Ly9hcGkuZGFzaGZsaWdodC5uZXQiLCJleHAiOjE1ODI5MDMzMTAsImlhdCI6MTU4MjkwMjQxMCwidXNlcl9maW5nZXJwcmludCI6IjBGODExQjc1MEQ0RTg0QUJENjAzNDBCRERGMkNENzhFNDc5QTFDNzkwQTEzNUIxRDNERTk2MENBQTc1QUQ5MjEifQ.IkezZc1188DSO1C5cuNClMRAC4IVo8swfJODeAdz1P9c_UPJ7K3c_78Dq5Jn8vio-KeKvVn1nfYbKEmJYKf_YnnAcUu3MCZEqlo6lmnrtvKXXfgKWNi8ItLTg4It8zd_ATp97e-PcmddyFoy7P_IliK_j-ca3j2-YPT2vTywdtk",
                "AC9F2885D640F7A8828B33A728FDE5F9B3EAEEBB3D21715CE5950E4EFD0DF8A1E950AD3631CCD74C37E0AE83A7A38DF47C63F7F7FE436D4BAE80397E07027A9A");

        System.out.println(jwt.getClaim("user_id").asString());
    }
}
