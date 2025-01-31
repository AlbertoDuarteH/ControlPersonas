package mx.com.betodata.MVCcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.com.betodata.entities.Persona;
import mx.com.betodata.service.PersonaService;


@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public String getPersonas(Model model) {
        List<Persona> personas = personaService.findAllPersonas();
        model.addAttribute("personas", personas);
        return "personas/personas";
    }
    
}
