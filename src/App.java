import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App{
    public static void main (String[] args) throws IOException{
        // Check for the "profile.csv" file
        boolean isCSVPresent = csvFileChecker("profile.csv");
        ProfileBuilder profile = new ProfileBuilder();
        Map<String, Map<String, String>> profileData = new LinkedHashMap<>();
        Scanner scn = new Scanner(System.in);

        if(!isCSVPresent){
            // Create a new user profile
            System.out.println("Welcome to LinkedIn Profile Builder! to create your profile, you need to give the details");
            profileData.put("Introduction", profile.takeIntroDetails());
            // details.save(profileData, "profile");
            // System.out.println(profileData);

        }

        else{
            // Exiting user
            System.out.println("We already have an existing user. You want to edit the profile? (Y/N)");
            String canEdit = scn.nextLine().trim();
            if(canEdit.equalsIgnoreCase("n")){
                System.out.println("Are you sure! you don't want to modify the data? (Y/N)");
                String canEdit2 = scn.nextLine().trim();
                if(canEdit2.equalsIgnoreCase("n")){
                    System.out.println("=====================");
                    System.out.println("Exiting..");
                    System.out.println("=====================");
                    System.exit(0);
                }
                else if(canEdit2.equalsIgnoreCase("y")){
                    System.out.println("Invalid choice! Try again.");
                }
            }
        }

        System.out.print("Add experience (Y/N)? ");
        String hasExprnAdded = scn.nextLine().trim();
        if(hasExprnAdded.equalsIgnoreCase("y")){
            profileData.put("Experience", profile.takeExprnDetails());
            // details.save(profileData, "profile");
        }

        System.out.print("Add education (Y/N)? ");
        String hasEduAdded = scn.nextLine().trim();
        if(hasEduAdded.equalsIgnoreCase("y")){
            profileData.put("Education", profile.takeEduDetails());
            // details.save(profileData, "profile");
        }

        System.out.print("Add skills (Y/N)? ");
        String hasSkillsAdded = scn.nextLine().trim();
        if(hasSkillsAdded.equalsIgnoreCase("y")){
            profileData.put("Skills", profile.takeSkillsDetails());
            // details.save(profileData, "profile");
        }

        System.out.print("Add language (Y/N)? ");
        String hasLangAdded = scn.nextLine().trim();
        if(hasLangAdded.equalsIgnoreCase("y")){
            profileData.put("Language", profile.takeLangDetails());
        }
        
        SavingTheDetails details = new SavingTheDetails();
        details.save(profileData, "profile");

    }

    private static boolean csvFileChecker(String fileName) {
        // Check if the file exists
        File csvFile = new File(fileName);
        if (csvFile.exists()) {
            // Check if the file is empty
            try {
                BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                String line = reader.readLine();
                if (line == null) {
                    return false;
                } else {
                    return true;
                }
                // reader.close();
            } 
            catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }

        }
        return false;
    }
}