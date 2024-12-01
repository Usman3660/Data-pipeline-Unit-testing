package Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        String filePath = "D:\\Fifth smester\\sqe\\Sqe_Project\\src\\Test\\valid_data.csv";

        DataPipelineTester tester = new DataPipelineTester();

        try {
          
            boolean isValid = tester.validateData(filePath);

            if (isValid) {
                System.out.println("The data in the file is valid.");
            } else {
                System.out.println("The data in the file is invalid.");
            }
        } catch (IOException e) {
            
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
