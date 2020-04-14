package pro.pawelczyk.pppetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 14.04.2020
 * created OwnersController in pro.pawelczyk.pppetclinic.controllers
 * in project pp-pet-clinic
 */
@Controller
public class OwnersController {

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    String listOwners() {

        return "owners/index";
    }
}
