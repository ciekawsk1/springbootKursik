package pl.restapitest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.restapitest.service.HelloService;
@RestController
@RequiredArgsConstructor
public class HelloControler {

    private final HelloService helloService;

    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }
}
