package mx.com.betodata.MVCcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class InitController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "inicio/index";
    }
    
}
