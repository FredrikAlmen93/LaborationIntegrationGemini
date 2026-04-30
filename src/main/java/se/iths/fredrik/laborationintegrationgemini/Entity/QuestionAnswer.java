package se.iths.fredrik.laborationintegrationgemini.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class QuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String prompt;

    @NotBlank
    @Column(length = 5000)
    private String response;

    public QuestionAnswer(String prompt, String response) {
        this.prompt = prompt;
        this.response = response;
    }

    public QuestionAnswer() {}
}
