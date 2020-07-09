package protest.circlecitest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
public class CircleciTestApplication implements CommandLineRunner {
    private final Environment env;
    private static final Logger LOGGER = LoggerFactory.getLogger(CircleciTestApplication.class);

    public CircleciTestApplication(Environment env) {
        this.env = env;
    }

    public static void main(String[] args) {
        SpringApplication.run(CircleciTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("JAVA_HOME {}", env.getProperty("JAVA_HOME"));
        LOGGER.info("app.name {}", env.getProperty("app.name"));
        LOGGER.info("debug {}", env.getProperty("debug"));
        LOGGER.info("GOOGLE_APPLICATION_CREDENTIALS {}", env.getProperty("GOOGLE_APPLICATION_CREDENTIALS"));
    }

    @Value(value = "${spring.datasource.username}")
    private String username;

    @Value(value = "${spring.datasource.password}")
    private String password;

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
