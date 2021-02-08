// Main method for CSC151 project part 1.
import java.util.Scanner;

public class Project_Katherine_Cannon
{
   public static void main(String[] args) 
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
      
      // Set up the keyboard for input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create object for the Policy class.
      Policy newHolder = new Policy();
      
      // Prompt user for input and store.
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
      newHolder.setPolicyNumber(policyNumber);
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      newHolder.setProviderName(providerName);
      
      System.out.print("Please enter the Policyholder's First Name: ");
      holderFirstName = keyboard.nextLine();
      newHolder.setHolderFirstName(holderFirstName);
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      holderLastName = keyboard.nextLine();
      newHolder.setHolderLastName(holderLastName);
      
      System.out.print("Please enter the Policyholder's Age: ");
      holderAge = keyboard.nextInt();
      newHolder.setAge(holderAge);
      
      // Clear the keyboard Buffer.
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoker = keyboard.nextLine();
      newHolder.setSmokeStr(smoker);
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      heightInch = keyboard.nextDouble();
      newHolder.setHeightInch(heightInch);
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weightLbs = keyboard.nextDouble();
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
      
      
   }
}
