import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExperienceSec {

    ExperienceSec(){
        System.out.println("We are in the experience section, here you can attach your experiences");
    }

    public Map<String, String> takeTheDetails() {
        Map<String, String> storage = new LinkedHashMap<>();
        Scanner exp = new Scanner(System.in);
        
        System.out.println("Add position");
        String title = "";
        while(title.isEmpty()){
            System.out.println("Enter your title [Ex: Software Engineer](*) : ");
            title = exp.nextLine().trim();
            if(title.isEmpty()){
                System.out.println("Sorry! title can not be empty");
            }
        }
        storage.put("Title", title);


        System.out.println("Select an option for employee type:");
        System.out.println("1. FULL TIME");
        System.out.println("2. PART TIME");
        System.out.println("3. CONTRACTOR");
        System.out.println("4. INTERN");
        System.out.println("5. FREELANCER");

        int choice = 0;
        while (choice < 1 || choice > 5) {
            System.out.print("Enter your choice: ");
            choice = exp.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }

        String employeeType = "";
        switch (choice) {
            case 1:
                employeeType = "FULL_TIME";
                break;
            case 2:
                employeeType = "PART_TIME";
                break;
            case 3:
                employeeType = "CONTRACTOR";
                break;
            case 4:
                employeeType = "FREELANCER";
                break;
            case 5:
                employeeType = "INTERN";
                break;
            case 6:
                employeeType = "TRAINEE";
                break;

        }

        storage.put("Employee Type", employeeType);

        String companyName = "";
        while(companyName.isEmpty()){
            System.out.println("Enter your company name(*) : ");
            companyName = exp.nextLine().trim();
            if(companyName.isEmpty()){
                System.out.println("Sorry! company name can not be empty");
            }
        }
        storage.put("Company Name", companyName);

        String location = "";
        System.out.println("Enter your job location : ");
        String locationInp = exp.nextLine().trim();
        if(!location.isEmpty()){
            location = locationInp;
        }
        storage.put("Job Location", location);

        System.out.println("Select an option for location type:");
        System.out.println("1. On-site");
        System.out.println("2. Hybrid");
        System.out.println("3. Remote");

        int locType = 0;
        while (locType < 1 || locType > 3) {
            System.out.print("Enter your choice: ");
            locType = exp.nextInt();

            if (locType < 1 || locType > 3) {
                System.out.println("Invalid choice. Please select a number between 1 and 3.");
            }
        }

        String locationType = "";
        switch (locType) {
            case 1:
                locationType = "ONSITE";
                break;
            case 2:
                locationType = "HYBRID";
                break;
            case 3:
                locationType = "REMOTE";
                break;

        }

        storage.put("Location Type", locationType);

        String industry = "";
        while(industry.isEmpty()){
            System.out.println("Enter your industry [Ex: Computer Software](*) : ");
            industry = exp.nextLine().trim();
            if(industry.isEmpty()){
                System.out.println("Sorry! industry can not be empty");
            }
        }
        storage.put("Industry", industry);

        return storage;
    }

}
