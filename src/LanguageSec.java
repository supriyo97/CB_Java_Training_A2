import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

enum Proficiency {
    ELEMENTARY,
    LIMITED_WORKING,
    PROFESSIONAL_WORKING,
    FULL_PROFESSIONAL,
    NATIVE_BILLINGUAL
}

public class LanguageSec {
    LanguageSec(){
        System.out.println("We are in the language section, here you can choose your language for communication");
    }

    public Map<String, String> takeTheDetails() {
        Map<String, String> storage = new LinkedHashMap<>();
        Scanner lang = new Scanner(System.in);
        
        String name = "";
        while(name.isEmpty()){
            System.out.println("Enter your language name(*) : ");
            name = lang.nextLine().trim();
            if(name.isEmpty()){
                System.out.println("Sorry! language name can not be empty");
            }
        }
        storage.put("Name", name);

        String proficiency = "";
        System.out.println("Select proficiency : (in terms of number of stars (*))");
        String prof = lang.nextLine().trim();
        if(!prof.isEmpty()){
            proficiency = prof;
        }
        storage.put("Proficiency", proficiency);

        return storage;
    }

}
