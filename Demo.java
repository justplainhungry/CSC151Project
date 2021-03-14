// Main method for CSC151 project part 2.
import java.util.Scanner;
import java.io.*;

public class Demo
{
   public static void main(String[] args) throws IOException
   {
      // innitialize variables.
      String policyNumber = " ";
      String providerName = " ";
      String holderFirstName = " ";
      String holderLastName = " ";
      String smoker = " ";
      int holderAge = 0;
      double heightInch = 0.0;
      double weightLbs = 0.0;
      
      // Open the file.
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
            
      // Create object for the Policy class.
      Policy newHolder = new Policy();
      
      
      // Read from the PolicyInformation.txt file
      
      while (inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         newHolder.setPolicyNumber(policyNumber);
          
         providerName = inputFile.nextLine();
         newHolder.setProviderName(providerName);
         
         holderFirstName = inputFile.nextLine();
         newHolder.setHolderFirstName(holderFirstName);
         
         holderLastName = inputFile.nextLine();
         newHolder.setHolderLastName(holderLastName);
         
         holderAge = inputFile.nextInt();
         newHolder.setAge(holderAge);
         
         smoker = inputFile.nextLine();
         newHolder.setSmokeStr(smoker);
         
         inputFile.nextLine();
      
         heightInch = inputFile.nextDouble();
         newHolder.setHeightInch(heightInch);
      
         weightLbs = inputFile.nextDouble();
         newHolder.setWeightLbs(weightLbs);
         
         // Output data.
         System.out.println("\n\nPolicy Number: " + newHolder.getPolicyNumber());
         System.out.println("Provider Name: " + newHolder.getProviderName());
         System.out.println("Policyholder's First Name: " + newHolder.getHolderFirstName());
         System.out.println("Policyholder's Last Name: " + newHolder.getHolderLastName());
         System.out.println("Policyholder's Age: " + newHolder.getAge());
         System.out.println("Policyholder's Smoking Status: " + newHolder.getSmokeStr());
         System.out.println("Policyholder's Height: " + newHolder.getHeightInch());
         System.out.println("Policyholder's Weight: " + newHolder.getWeightLbs());
         System.out.printf("Policyholder's BMI: %,.2f", newHolder.calculateHolderBMI());
         System.out.printf("\nPolicy Price: $%,.2f", newHolder.calculatePolicyPrice());
      
         
         inputFile.nextLine();
         if(inputFile.hasNext())
         {
             inputFile.nextLine();//this handles the end of the file to avoid an exception}
         }

      }
      
      // Clear the keyboard Buffer.
           
      
            
   }
}
