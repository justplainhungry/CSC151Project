/**
   Project part 3. 
   This Policy class models an insurance policy for a single person.
*/

public class Policy
{  
   private static int instanceCount;
   
   /**
      Constructor to increment that amount of instances of this class that are created.
   */
   public Policy()
   {
      instanceCount++;
   }
   
   /**
      Returns the amount of instances of the class.
      @return instanceCount The number of instances of this class has been created
   */
   public int getInstanceCountPolicy()
   {
      return instanceCount;
   }
   
   /**
      This method calculates and returns the policy holder's BMI.
      @return BMI Policy holder's BMI.
   */
   public double calculateHolderBMI()  
   {
      final double WEIGHT_MULTIPLIER = 703.0; 
      
      return (weightLbs * WEIGHT_MULTIPLIER)/(heightInch * heightInch); 
   }
   
   /**
      This method calculates the holder's policy price and returns it.
      @return price the policy's price for the holder.
   */
   public double calculatePolicyPrice() 
   {  
      final double BASE_FEE = 600.0;                    
      final double AGE_FEE = 75.0;                    
      final double SMOKER_FEE = 100.0;
      final double BMI_MULTI = 20;     
      
      final int AGE_LIMIT = 50;                           
      final int BMI_THRESHOLD = 35;                           
      
      double price = BASE_FEE;                                  
      
      if (age >= AGE_LIMIT) 
      {
         price += AGE_FEE; 
      }                         
                               
      if (smokerStr.equalsIgnoreCase("smoker"));
      {
         price += SMOKER_FEE;  // for some reason my code keeps adding $100 smoking fee, even when non-smoker is chosen. 
      }
      
      if (calculateHolderBMI() > BMI_THRESHOLD) 
      {
         price += (calculateHolderBMI() - BMI_THRESHOLD) * BMI_MULTI;
      }
           
      return price;   
   } 
   
   /**
      This method converts the returning code to a String.
      @return str Returning data in String.
   */
   public String toString()
   {
      String str = "Policyholder's BMI: " + calculateHolderBMI();
                   "Policy Price:  " + calculatePolicyPrice();
      return str;
   }
}

