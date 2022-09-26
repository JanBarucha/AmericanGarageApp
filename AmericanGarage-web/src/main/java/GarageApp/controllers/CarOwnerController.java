package GarageApp.controllers;

import GarageApp.model.services.CarOwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarOwnerController {

    private final CarOwnerService carOwnerService;

    public CarOwnerController(CarOwnerService carOwnerService) {
        this.carOwnerService = carOwnerService;
    }

    @RequestMapping("/list/CarOwners")
    public String getListCarOwners(Model model){

        model.addAttribute("owners", carOwnerService.findAll());
        return "CarOwner/Index";
    }
}
