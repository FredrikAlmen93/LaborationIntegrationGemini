package se.iths.fredrik.laborationintegrationgemini.Exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GeminiExceptionHandler {

    @ExceptionHandler(com.google.genai.errors.ServerException.class)
    public String handleGeminiError(Exception e, Model model) {
        model.addAttribute("errorMessage", "The AI is currently experiencing issues. Please try again later.");
        return "error";
    }
}
