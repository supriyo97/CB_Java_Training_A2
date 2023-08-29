import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EducationSec {

    EducationSec(){
        System.out.println("We are in the education section, here you can attach your education details");
    }

    public Map<String, String> takeTheDetails() {
        Map<String, String> storage = new LinkedHashMap<>();
        Scanner edu = new Scanner(System.in);
        
        String schoolName = "";
        while(schoolName.isEmpty()){
            System.out.println("Enter your school name(*) : ");
            schoolName = edu.nextLine().trim();
            if(schoolName.isEmpty()){
                System.out.println("Sorry! school name can not be empty");
            }
        }
        storage.put("School Name", schoolName);
        
        String degree = "";
        while(degree.isEmpty()){
            System.out.println("Enter your degree [Ex : Bachelor's](*) : ");
            degree = edu.nextLine().trim();
            if(degree.isEmpty()){
                System.out.println("Sorry! degree can not be empty");
            }
        }
        storage.put("Degree", degree);

        String startDate = "";
        System.out.println("Enter your start date [mm/yyyy] : ");
        String stDate = edu.nextLine().trim();
        if(!stDate.isEmpty()){
            startDate = stDate;
        }
        storage.put("Start Date", startDate);

        String endDate = "";
        System.out.println("Enter your end date [mm/yyyy] : ");
        String enDate = edu.nextLine().trim();
        if(!enDate.isEmpty()){
            endDate = enDate;
        }
        storage.put("End Date", endDate);

        String grade = "";
        System.out.println("Enter your grade : ");
        String grd = edu.nextLine().trim();
        if(!grd.isEmpty()){
            grade = grd;
        }
        storage.put("Grade", grade);

        return storage;
    }

}
