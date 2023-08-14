package ufrn.br.aspectexample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {

    MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping
    public void doGet(){
        System.out.println("Hello World");
        service.performAction();
    }

}
