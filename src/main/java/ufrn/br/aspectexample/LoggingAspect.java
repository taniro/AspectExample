package ufrn.br.aspectexample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* ufrn.br.aspectexample.*.*(..))")
    public void beforeMethodExecution() {
        System.out.println("Método será executado em breve...");
    }
}

