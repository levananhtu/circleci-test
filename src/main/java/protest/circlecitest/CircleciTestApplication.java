package protest.circlecitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
public class CircleciTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircleciTestApplication.class, args);
    }

    @GetMapping(path = "/AB")
    public String A(HttpServletRequest request, HttpServletResponse response) {
        return request.getRequestURI() + "1";
    }

    @GetMapping(path = "/ab")
    public String a(HttpServletRequest request, HttpServletResponse response) {
        return request.getRequestURI() + "2";
    }
}
