package ufrn.br.aspectexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AspectExampleApplication.class, args);
    }

}
