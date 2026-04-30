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
    public String Home(Model model) {
        model.addAttribute("items", service.getAll());
        return "index";
    }

    @PostMapping("/ask")
    public String ask(@RequestParam("question") String prompt) {
        service.AskAndSave(prompt);
        return "redirect:/";
    }
}
