package jamfinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maxime on 03/10/15.
 */
@Controller
public class UserController {

    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repository){
        this.repository = repository;
    }

    @RequestMapping(value = "/users/new", method = RequestMethod.POST)
    public User userSubmit(@ModelAttribute User user, Model model){
        User result = repository.save(user);
        model.addAttribute("statusMessageKey","success");
        return result;
    }
}
