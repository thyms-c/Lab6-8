// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Warm mugs and cozy hugs.");
        return "home";
    }

}
