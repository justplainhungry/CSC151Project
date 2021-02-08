/**
   Project part 1. 
      COMPLETE LAST -> NOTES FOR METHODS.
   This Policy class models an insurance policy for a single person.
*/

public class Policy
{  
   // Set up class fields.
   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private String smokerStr;  
   private double age;
   private double heightInch;
   private double weightLbs;
   private double BMI;
   private double price;
   private boolean smokerBool; 
   private double BASE_FEE;                      
   private double AGE_FEE;                       
   private double SMOKER_FEE;                     
   private int AGE_LIMIT;                           
   private double BMI_SUB;                           
   private double BMI_MULTI;
   private double WEIGHT_MULTIPLIER;                      

   
   // Set up constructor.
   public Policy(String pn, String provN, String hfn, String hln, double a, double hi, double wl)
   {
      policyNumber = pn;
      providerName = provN;
      holderFirstName = hfn;
      holderLastName = hln;
      age = a;
      heightInch = hi;
      weightLbs = wl;
   }
   
   // Set up no-arg constructor.
   public Policy()
   {
      final double BASE_FEE = 600.0;                      
      final double AGE_FEE = 75.0;                        
      final double SMOKER_FEE = 100.0;                     
      final int AGE_LIMIT = 50;                           
      final double BMI_SUB = 35;                           
      final double BMI_MULTI = 20; 
      final double WEIGHT_MULTIPLIER = 703.0;                       

   }
   
   // Create setters.
   public void setPolicyNumber(String pn)
   {
      policyNumber = pn;
   }
   
   public void setProviderName(String provN)
   {
      providerName = provN;
   }
   
   public void setHolderFirstName(String hfn)
   {
      holderFirstName = hfn;
   }
   
   public void setHolderLastName(String hln)
   {
      holderLastName = hln;
   }
   
   public void setAge(double a)
   {
      age = a;
   }
   
   public void setSmokeStr(String sm)
   {
      smokerStr = sm;
   }
   
   public void setHeightInch(double hi)
   {
      heightInch = hi;
   }
   
   public void setWeightLbs(double wl)
   {
      weightLbs = wl;
   }
   
   // Create getters.
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   public double getAge()
   {
      return age;
   }
   
   public String getSmokeStr()
   {
      return smokerStr;
   }
   
   public double getHeightInch()
   {
      return heightInch;
   }
   
   public double getWeightLbs()
   {
      return weightLbs;
   }
   
   /**
      This method 
   */
   public boolean convertBooleanSmoker()
   {
      if (smokerStr == "smoker")
      {
         smokerBool = true;
      }
      else if (smokerStr == "non-smoker")
      {
         smokerBool = false;
      }
      else 
      {
         System.out.print("ERROR: You must enter either smoker or non-smoker.");
         System.out.println("Please restart the program.");
         System.exit(0);
      }
      
      return smokerBool;
   }

   // Calculate and return the policy holder's BMI and return it.
   public double calculateHolderBMI()  
   {
      final double WEIGHT_MULTIPLIER = 703.0;
      double BMI;
      double insertBMI;
      
      BMI = (weightLbs * WEIGHT_MULTIPLIER)/(heightInch * heightInch); 
      insertBMI = calculatePolicyPrice(BMI);
      return BMI;
   }
   
   // Calculate the holder's policy price and return it.
   public static double calculatePolicyPrice(double BMI) 
   {  
      final double BASE_FEE = 600.0;                      
      final double AGE_FEE = 75.0;                        
      final double SMOKER_FEE = 100.0;                     
      final int AGE_LIMIT = 50;                           
      final double BMI_SUB = 35;                           
      final double BMI_MULTI = 20; 
      double price; 
      double BMIFee;
      double zeroFee = 0.0;
                                                                      
      price = BASE_FEE;
      
      if (age >= AGE_LIMIT)
      {
         price += AGE_FEE;
      }
      else
      {
         price += zeroFee;
      }
      
      if (smokerBool == true)
      {
         price += SMOKER_FEE;
      }
      else
      {
         price += zeroFee;         
      }
      
      if (BMI >= 35.0)// OUTPUT DOESN'T CALCULATE PRICE WITH BMI ??
      {
         BMIFee = (BMI - BMI_SUB) * BMI_MULTI;
         price += BMIFee;
      }
      else
      {
         price += zeroFee;
      }
      
      return price;   
   } 
}

