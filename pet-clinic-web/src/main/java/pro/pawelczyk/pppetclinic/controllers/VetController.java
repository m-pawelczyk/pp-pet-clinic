package pro.pawelczyk.pppetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 14.04.2020
 * created VetController in pro.pawelczyk.pppetclinic.controllers
 * in project pp-pet-clinic
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    String listVets() {

        return "vets/index";
    }
}
