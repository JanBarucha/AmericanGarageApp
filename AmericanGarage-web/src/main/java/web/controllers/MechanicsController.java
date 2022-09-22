package web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MechanicsController {

    @RequestMapping("/list/Mechanics")
    public String getListMechanics(){
        return "/Mechanics/index";
    }
}
