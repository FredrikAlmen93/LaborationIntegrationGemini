package se.iths.fredrik.laborationintegrationgemini.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.fredrik.laborationintegrationgemini.Service.QuestionAnswerService;

@Controller
public class HistoryController {

    private final QuestionAnswerService service;

    public HistoryController(QuestionAnswerService service) {
        this.service = service;
    }

    @GetMapping("/history")
    public String history(Model model) {
        model.addAttribute("items", service.getAll());
        return "history";
    }
}