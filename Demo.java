// Main method for CSC151 project part 2.
import java.util.ArrayList;
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
      double holderAge = 0;
      double heightInch = 0.0;
      double weightLbs = 0.0;
      int numSmokers = 0;
      
      // Add ArrayList to store the policy objects.
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      // Open the file.
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);      
      
      // Read from the PolicyInformation.txt file
      while (inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
                 
         providerName = inputFile.nextLine();
                
         holderFirstName = inputFile.nextLine();
                 
         holderLastName = inputFile.nextLine();
         inputFile.nextLine();
         
         holderAge = inputFile.nextDouble();
         inputFile.nextLine();
         
         smoker = inputFile.nextLine();
      
         heightInch = inputFile.nextDouble();
      
         weightLbs = inputFile.nextDouble();
        
        // extra lines if there's more to read from the file.
        if (inputFile.hasNext())
           inputFile.nextLine();
        if (inputFile.hasNext())
           inputFile.nextLine();
           
           
       
        // Add the Policy Object to the ArrayList.
            Policy policy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smoker, heightInch, weightLbs);
            policyList.add(policy);

         
         // Output data for each policy holder.
         for (int i=0; i <policyList.size(); i++)
         {
            System.out.println("\n\nPolicy Number: " + policyList.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(i).getHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(i).getHolderLastName());
            System.out.println("Policyholder's Age: " + policyList.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getSmokeStr());
            System.out.println("Policyholder's Height: " + policyList.get(i).getHeightInch());
            System.out.println("Policyholder's Weight: " + policyList.get(i).getWeightLbs());
            System.out.printf("Policyholder's BMI: %,.2f", policyList.get(i).calculateHolderBMI());
            System.out.printf("\nPolicy Price: $%,.2f", policyList.get(i).calculatePolicyPrice());
            
            if (policyList.get(i).getSmokeStr().equalsIgnoreCase("smoker"))
               numSmokers++;
         }
        
         // Display number of smokers and non-smokers.
         System.out.println("The number of policies with a smoker is: " + numSmokers);
         System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
         
         inputFile.nextLine();
         if(inputFile.hasNext())
         {
             inputFile.nextLine();//this handles the end of the file to avoid an exception}
         }

      }
      
      // Clear the keyboard Buffer.
           
      
            
   }
}
