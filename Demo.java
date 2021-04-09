/**
   Main method for CSC151 project part 3.
*/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

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
      String fileInput = " ";
      double holderAge = 0;
      double heightInch = 0.0;
      double weightLbs = 0.0;
      double BMI = 0.0;
      double price = 0.0;
      int numSmokers = 0;
      
      // Open the file.
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //ArrayList to store Policy objects
      ArrayList<PolicyHolder> policyList = new ArrayList<PolicyHolder>();
      
      // Read from the PolicyInformation.txt file
      
      while (inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         holderFirstName = inputFile.nextLine();
         holderLastName = inputFile.nextLine();
         inputFile.nextLine();
         
         fileInput = inputFile.nextLine();
         holderAge = Double.parseDouble(fileInput);
         
         smoker = inputFile.nextLine();
         inputFile.nextLine();
      
         heightInch = inputFile.nextDouble();
         weightLbs = inputFile.nextDouble();
         inputFile.nextLine();
         
         if(inputFile.hasNext())
         {
             inputFile.nextLine();//this handles the end of the file to avoid an exception}
         }

         
         // Create object to insert data to the PolicyHolder and Policy class.
         PolicyHolder newHolder = new PolicyHolder(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smoker, heightInch, weightLbs);
         Policy policy = new Policy(newHolder);                                                                // ^ having issues with this not coverting to double, compiler thinks it's trying to be converted to string.
         policyList.add(newHolder);                                                                            //   probably an issue with how the file is being read ???
                  
         
         // Insert toString Method
         System.out.println(policy);
         
         for(int i=0; i < policyList.size(); i++)
         { 
            System.out.println(policy);
            System.out.println();
      
            if(newHolder.getSmokeStat().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++; 
         }  
         //print out the number of smokers and non-smokers
         System.out.println("There were " + policy.getInstanceCountPolicy() + " object created.");
         System.out.println("The number of policies with a smoker is: " + numSmokers);
         System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers));
         
      }
      
      // Clear the keyboard Buffer.
            
   }
}
