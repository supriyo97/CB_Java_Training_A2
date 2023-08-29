import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SavingTheDetails {

    public void save(Map<String, Map<String, String>> rowData, String defaultName){
        System.out.println("Details have been taken. Now, choose:");
        Scanner file = new Scanner(System.in);
        String fileFormat = "";

        while(fileFormat.isEmpty() || (!fileFormat.equalsIgnoreCase("csv") && !fileFormat.equalsIgnoreCase("json"))){
            System.out.println("\"csv\" to save the details in a CSV file.");
            System.out.println("\"json\" to save the details in a JSON file.");
            fileFormat = file.nextLine().trim();
            if(fileFormat.isEmpty() || (!fileFormat.equalsIgnoreCase("csv") && !fileFormat.equalsIgnoreCase("json"))){
                System.out.println("\nInvalid file format. Please try again!");
            }
        }
        String defaultFName = defaultName + "." + fileFormat;
        System.out.println("\nNow, choose your file name (Without any extension) to save the data. (or go with default : " + defaultFName + ")");
        String fileName = file.nextLine().trim();
        if(fileName.isEmpty()){
            fileName = defaultFName;
        }


        // Implementation of saving the data in csv/json file
        try{
            if(fileFormat.equalsIgnoreCase("csv")){
                BufferedWriter editor = new BufferedWriter(new FileWriter(fileName));
                for (String key : rowData.keySet()){
                    Map<String, String> data = rowData.get(key);
                    for (String key2 : data.keySet()){
                        editor.write(key2);
                        editor.write(",");
                    }
                    editor.newLine();
                    for (String key2 : data.keySet()){
                        editor.write(data.get(key2));
                        editor.write(",");
                    }
                }
                editor.close();
            }
            else if(fileFormat.equalsIgnoreCase("json")){

                ObjectMapper mapper = new ObjectMapper();
                mapper.writeValue(new File(fileName), rowData);
            }

        }
        catch(Exception e){
            System.out.println("The error is : " + e);
        }

        System.out.println("================================================");
        System.out.println("All the details have been saved in " + fileName);
        System.out.println("================================================");
    }
}
