package se.iths.fredrik.laborationintegrationgemini.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import se.iths.fredrik.laborationintegrationgemini.Entity.Question;

import java.util.List;

@Service
public class QuestionService {
    private final JpaRepository repo;

    public QuestionService(JpaRepository repo) {
        this.repo = repo;
    }

    public Question createQuestion(Question question){
        if (question == null){
            throw new IllegalArgumentException("Question cannot be null");
        }
        try{
            return (Question) repo.save(question);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save question to database", e);
        }
    }

    public List<Question> getAllQuestions(){
        return repo.findAll();
    }
}
