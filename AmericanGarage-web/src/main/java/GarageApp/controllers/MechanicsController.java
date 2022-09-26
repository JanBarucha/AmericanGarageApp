package GarageApp.controllers;


import GarageApp.model.services.MechanicsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MechanicsController {

    private final MechanicsService mechanicsService;

    public MechanicsController(MechanicsService mechanicsService) {
        this.mechanicsService = mechanicsService;
    }

    @RequestMapping("/list/Mechanics")
    public String getListMechanics(Model model){
        model.addAttribute("mechanics", mechanicsService.findAll());

        return "/Mechanics/index";
    }
}
