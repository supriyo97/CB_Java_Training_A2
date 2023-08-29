import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IntroductionSec {
    IntroductionSec(){
        System.out.println("----------------------------------------------------------");
        System.out.println("\nWe are in Introduction section, here you have to give your basic information. And it's a mandatory section.");
    }

    public Map<String, String> takeTheDetails(){
        Map<String, String> storage = new LinkedHashMap<>();
        Scanner intro = new Scanner(System.in);
        System.out.println("\nNote : If any prompt contains (*) then it is mandatory otherwise optional. So, Let's begin!");
        
        // Basic Info
        String fName = "";
        while(fName.isEmpty()){
            System.out.println("Enter your first name(*) : ");
            fName = intro.nextLine().trim();
            if(fName.isEmpty()){
                System.out.println("Sorry! first name can not be empty");
            }
        }
        storage.put("First Name", fName);

        String mName = "";
        System.out.println("Enter your middle name (optional, press Enter to skip) : ");
        String mNameInp = intro.nextLine().trim();
        if(!mName.isEmpty()){
            mName = mNameInp;
        }
        storage.put("Middle Name", mName);

        String lName = "";
        while(lName.isEmpty()){
            System.out.println("Enter your last name(*) : ");
            lName = intro.nextLine().trim();
            if(lName.isEmpty()){
                System.out.println("Sorry! last name can not be empty");
            }
        }
        storage.put("Last Name", lName);
        
        String gender = "";
        System.out.println("Gender (Male/Female/Others) : ");
        String genderInp = intro.nextLine().trim();
        if(!gender.isEmpty()){
            gender = genderInp;
        }
        storage.put("Gender", gender);

        String Headline = "";
        while(Headline.isEmpty()){
            System.out.println("Enter your headline(*) : ");
            Headline = intro.nextLine().trim();
            if(Headline.isEmpty()){
                System.out.println("Sorry! headline can not be empty");
            }
        }
        storage.put("Headline", Headline);

        // Location
        String country = "";
        while(country.isEmpty()){
            System.out.println("Enter your country name(*) : ");
            country = intro.nextLine().trim();
            if(country.isEmpty()){
                System.out.println("Sorry! country name can not be empty");
            }
        }
        storage.put("Country", country);

        String city = "";
        System.out.println("Enter your city name : ");
        String cityInp = intro.nextLine().trim();
        if(!city.isEmpty()){
            city = cityInp;
        }
        storage.put("City", city);

        // Personal link
        String link = "";
        System.out.println("Provide your website link : ");
        String linkInp = intro.nextLine().trim();
        if(!link.isEmpty()){
            link = linkInp;
        }
        storage.put("Weblink", link);

        return storage;
    }
    
}
