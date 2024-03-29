/**
   Project part 3. 
   This Policy class models an insurance policy for a single person. (aggregate class)
*/

public class Policy
{  
   private PolicyHolder holder;
   private static int instanceCount;
   
   /**
      Constructor to increment that amount of instances of this class that are created.
   */
   public Policy(PolicyHolder hold)
   {
      holder = new PolicyHolder(hold);
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
      Returns the policy holder's information.
      @return holder Policy Holder's information
   */
   public PolicyHolder information()
   {
      return new PolicyHolder(holder);
   }
   
   /**
      This method calculates and returns the policy holder's BMI.
      @return BMI Policy holder's BMI.
   */
   public static double calculateHolderBMI()  // shouldNT be a static method
   {
      PolicyHolder hold = new PolicyHolder();
      final double WEIGHT_MULTIPLIER = 703.0; 
      
      return (hold.getWeight() * WEIGHT_MULTIPLIER)/(hold.getHeight() * hold.getHeight()); 
      // how am I supposed to import weight and height from PolicyHolder?
      // answer: make both this method, and both return methods in the PolicyHolder class static methods
      // 2nd answer: create get methods for all types needing to be used for this method,
      // and the calculatePolicyPrice method.
      //
   }
   
   /**
      This method calculates the holder's policy price and returns it.
      @return price the policy's price for the holder.
   */
   public double calculatePolicyPrice() //shouldNT be a static method
   {  
      PolicyHolder hold = new PolicyHolder();
      
      final double BASE_FEE = 600.0;                    
      final double AGE_FEE = 75.0;                    
      final double SMOKER_FEE = 100.0;
      final double BMI_MULTI = 20;     
      
      final int AGE_LIMIT = 50;                           
      final int BMI_THRESHOLD = 35;                           
      
      double price = BASE_FEE;                                  
      
      if (hold.getAge() >= AGE_LIMIT) // need some way to import the smoking status and age
      {                     // Solution: make methods to reference in PolicyHolder.
         price += AGE_FEE; 
      }                         
                               
      if (hold.getSmokeStat().equalsIgnoreCase("smoker"));
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
      String str = "Policyholder's BMI: " + calculateHolderBMI() +
                   "Policy Price:  " + calculatePolicyPrice();
      return str;
   }
}

