package protest.circlecitest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
public class CircleciTestApplication {
    @Value(value = "${spring.datasource.username}")
    private String username;
    @Value(value = "${spring.datasource.password}")
    private String password;

    public static void main(String[] args) {
        SpringApplication.run(CircleciTestApplication.class, args);
    }

    @GetMapping(path = "/AB")
    public String AB(HttpServletRequest request, HttpServletResponse response) {
        return request.getRequestURI() + "1";
    }

    @GetMapping(path = "/ab")
    public String ab(HttpServletRequest request, HttpServletResponse response) {
        return request.getRequestURI() + "2";
    }

    @GetMapping(path = "/")
    public String home(HttpServletRequest request, HttpServletResponse response) {
        return request.getRequestURI() + "3";
    }

    @GetMapping(path = "/username")
    public String getUsername() {
        return username;
    }

    @GetMapping(path = "/password")
    public String getPassword() {
        return password;
    }
}
