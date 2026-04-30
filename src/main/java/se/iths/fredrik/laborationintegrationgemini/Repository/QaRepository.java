package se.iths.fredrik.laborationintegrationgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.iths.fredrik.laborationintegrationgemini.Entity.QuestionAnswer;

import java.util.List;

@Repository
public interface QaRepository extends JpaRepository<QuestionAnswer, Long> {
    List<QuestionAnswer> response(String response);
}