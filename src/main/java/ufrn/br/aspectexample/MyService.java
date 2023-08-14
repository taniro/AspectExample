package ufrn.br.aspectexample;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void performAction() {
        System.out.println("Realizando ação...");
    }
}
