package pro.pawelczyk.pppetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.pawelczyk.pppetclinic.services.VetService;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 14.04.2020
 * created VetController in pro.pawelczyk.pppetclinic.controllers
 * in project pp-pet-clinic
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
