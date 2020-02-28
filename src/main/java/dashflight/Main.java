package dashflight;

import com.auth0.jwt.interfaces.DecodedJWT;
import dashflight.jwt.JwtUtil;

public class Main {

    public static void main(String[] args) {
        DecodedJWT jwt = new JwtUtil().verifySession(
                "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJ1c2VyX2lkIjoiOTExOWFjNDYtMmZmYi0xMWVhLTk3OGYtMmU3MjhjZTg4MTI1IiwiaXNzIjoiaHR0cHM6Ly9hcGkuZGFzaGZsaWdodC5uZXQiLCJleHAiOjE1ODI5MTYwMTYsImlhdCI6MTU4MjkxNTExNiwidXNlcl9maW5nZXJwcmludCI6IjI3MTI0QzhBNEZBRUVCNUIwOUU5OURFQkYyQzZCOUI3QkI1MEZDNjRENzhFMUEyOEMzRTdDMjkyOUM1Q0NGQTYifQ.huDxIbK-POBIkbPUe1Aw3b3NR0pvU-L3i0BASbQN7pvImMMDCIpuilIIr5MvFcu_dmV8HNZ6ccQZntcAWIQ-FVQsTYgcA-ybLpAFmI66KtuBynDLGssR2gPAvSvItsnI14n4t43p3KiDGR13Z2BOk9K_z4zkO_2M1bHsze2RLFI",
                "BC3D0FB397680B99A796A2EE8BA9002A3AFF6998A204DE8878DD9ACA7917212233C93046CE694CFBF7DE0B23DBEF5587FF940A55B7E75D4922F495AF5FF497BE");

        System.out.println(jwt.getClaim("user_id").asString());
    }
}
