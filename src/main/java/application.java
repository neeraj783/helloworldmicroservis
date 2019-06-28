import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.*")
public class application {
    public static void main(String[]agr){
        SpringApplication.run(application.class,agr);

    }
}
