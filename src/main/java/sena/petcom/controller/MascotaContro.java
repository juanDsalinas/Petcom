package sena.petcom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import sena.petcom.model.Mascota.IMascota;
import sena.petcom.model.Mascota.Mascota;

@Controller
public class MascotaContro {

    @Autowired
    private IMascota iMascota;

    @GetMapping("/modulMasco")
    public String modulMasco(){
        return "modulMascota";
    }

    @GetMapping("/regisMascoV")
    public String regisMascoV(Model m){
        m.addAttribute("masco", new Mascota());

        return "registrarMasco";
    }

    @PostMapping("/regisMasco")
    public String regisMasco(@Validated Mascota masco, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/regisMascoV";
        }
        else{
            iMascota.save(masco);
            return "redirect:/modulMasco";
        }
        
    }
    
    @GetMapping("/listMasco")
    public String verMasco(Model m){
        m.addAttribute("mascotas",iMascota.findAll());
        return "listMasco";
    }

}
