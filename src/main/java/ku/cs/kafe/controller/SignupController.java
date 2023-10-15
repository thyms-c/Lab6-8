// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ku.cs.kafe.model.SignUpRequest;
import ku.cs.kafe.service.SignupService;

@Controller
public class SignupController {
    @Autowired
    private SignupService signupService;

    @GetMapping("/signup")
    public String getSignupPage() {
        return "signup"; // return หน้าฟอร์ม signup.html
    }

    @PostMapping("/signup")
    public String signupUser(@ModelAttribute SignUpRequest user, Model model) {

        if (signupService.isUsernameAvailable(user.getUsername())) {
            signupService.createUser(user);
            model.addAttribute("signupSuccess", true);
        } else {
            model.addAttribute("signupError", "Username not available");
        }
        // return signup.html
        return "signup";
    }

}
