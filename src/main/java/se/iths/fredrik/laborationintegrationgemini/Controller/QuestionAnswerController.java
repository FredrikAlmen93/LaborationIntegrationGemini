package se.iths.fredrik.laborationintegrationgemini.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.iths.fredrik.laborationintegrationgemini.Service.QuestionAnswerService;

@Controller
public class QuestionAnswerController {
    private final QuestionAnswerService service;

    public QuestionAnswerController(QuestionAnswerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/ask")
    public String ask(@RequestParam String prompt, Model model){
        String answer = service.AskAndSave(prompt);
        model.addAttribute("answer", answer);
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model){
        model.addAttribute("items", service.getAll());
        return "history";
    }
}
