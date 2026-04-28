package se.iths.fredrik.laborationintegrationgemini.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @GetMapping("/question")
    public String question(@RequestParam String input){
        return "question";
    }
}
