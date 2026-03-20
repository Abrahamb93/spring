package cl.bancox.saldo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class Hola {
@RestController
public class HolaController {
   
    @GetMapping("/hola")
    public String Holamundo() {
        return "¡HOLA MUNDO!";

    }

    @GetMapping("/hola")
    public String chaoMundo() {
        return "¡CHAO MUNDO!";

    }

}
}
