import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;


public class JSONWriterExample {
    public static void main(String[] args) throws JsonMappingException {
        // Create a LinkedHashMap to store user details
        LinkedHashMap<String, String> userDetails = new LinkedHashMap<>();
        userDetails.put("firstName", "John");
        userDetails.put("lastName", "Doe");
        userDetails.put("email", "john.doe@example.com");

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Define the output JSON file path
        String jsonFilePath = "userDetails.json";

        try {
            // Write the user details to the JSON file
            objectMapper.writeValue(new File(jsonFilePath), userDetails);

            System.out.println("User details written to " + jsonFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
