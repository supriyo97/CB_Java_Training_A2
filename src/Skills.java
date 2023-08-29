import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Skills {
    Skills(){
        System.out.println("We are in the skills section, here you can list out the skills");
    }

    public Map<String, String> takeTheDetails() {
        Map<String, String> storage = new LinkedHashMap<>();
        Scanner skill = new Scanner(System.in);
        
        String skills = "";
        while(skills.isEmpty()){
            System.out.println("Enter your skills with giving spaces(*) : ");
            skills = skill.nextLine().trim();
            if(skills.isEmpty()){
                System.out.println("Sorry! skills can not be empty");
            }
        }
        storage.put("Skills", skills);
        return storage;
    }

}
