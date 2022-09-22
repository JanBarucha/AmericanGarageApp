package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarOwnerController {

    @RequestMapping("/list/CarOwners")
    public String getListCarOwners(){
        return "CarOwner/Index";
    }
}
