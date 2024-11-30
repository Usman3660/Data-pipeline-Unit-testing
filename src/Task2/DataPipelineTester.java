package Task2;

import java.io.*;
import java.util.*;

public class DataPipelineTester {
    public boolean validateData(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String header = reader.readLine();  
        if (!header.equals("id,name,age")) { 
            return false;
        }
        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            if (fields.length != 3 || fields[2].isEmpty()) {  
                return false;
            }
        }
        return true;
    }
}