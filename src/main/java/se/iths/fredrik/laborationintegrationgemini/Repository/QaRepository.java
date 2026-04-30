package se.iths.fredrik.laborationintegrationgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.iths.fredrik.laborationintegrationgemini.Entity.QuestionAnswer;

@Repository
public interface QaRepository extends JpaRepository<QuestionAnswer, Long> {
}
