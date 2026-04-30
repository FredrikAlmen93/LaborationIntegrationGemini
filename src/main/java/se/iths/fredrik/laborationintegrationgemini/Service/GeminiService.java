package se.iths.fredrik.laborationintegrationgemini.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final Client client = new Client();

    public String askGemini(String prompt){

        GenerateContentResponse response =
                client.models.generateContent("gemini-1.5-pro", prompt, null);

        return response.toString();
    }
}
