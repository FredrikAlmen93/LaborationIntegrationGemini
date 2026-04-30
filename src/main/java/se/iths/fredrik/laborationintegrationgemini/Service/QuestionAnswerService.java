package se.iths.fredrik.laborationintegrationgemini.Service;

import org.springframework.stereotype.Service;
import se.iths.fredrik.laborationintegrationgemini.Entity.QuestionAnswer;
import se.iths.fredrik.laborationintegrationgemini.Repository.QaRepository;

import java.util.List;

@Service
public class QuestionAnswerService {
    private final GeminiService geminiService;
    private final QaRepository repo;

    public QuestionAnswerService(GeminiService geminiService,
                                 QaRepository repo) {
        this.geminiService = geminiService;
        this.repo = repo;
    }

    public String AskAndSave(String prompt){
        String answer = geminiService.askGemini(prompt);
        repo.save(new QuestionAnswer(prompt, answer));
        return answer;
    }

    public List<QuestionAnswer> getAll(){
        return repo.findAllByOrderByIdDesc();
    }
}
