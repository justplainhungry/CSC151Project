/**
   Project 3 file. (Supposed to represent a person that is associated with an insurance policy)
*/
public class PolicyHolder
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
            

   // Set up no-arg constructor.
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      smokerStr = "";
      age = 0.0;
      heightInch = 0.0;
      weightLbs = 0.0;                     

   }
   
   // Set up constructor. 
   public Policy(String pn, String provN, String hfn, String hln, String smk, double a, double hi, double wl)
   {
      policyNumber = pn;
      providerName = provN;
      holderFirstName = hfn;
      holderLastName = hln;
      smokerStr = smk;
      age = a;
      heightInch = hi;
      weightLbs = wl;
   }
      
   // Create setters.
   
   /**
      This method sets the holder's policy number.
   */
   public void setPolicyNumber(String pn)
   {
      policyNumber = pn;
   }
   
   /**
      This method sets the holder's provider name.
   */
   public void setProviderName(String provN)
   {
      providerName = provN;
   }
   
   /**
      This method sets the policy holder's first name.
   */
   public void setHolderFirstName(String hfn)
   {
      holderFirstName = hfn;
   }
   
   /**
      This method sets the policy holder's last name.
   */
   public void setHolderLastName(String hln)
   {
      holderLastName = hln;
   }
   
   /**
      Thie method sets the policy holder's age.   
   */
   public void setAge(double a)
   {
      age = a;
   }
   
   /**
      This method sets the policy holder's smoking status.
   */
   public void setSmokeStr(String sm)
   {
      smokerStr = sm;
   }
   
   /**
      This method sets the policy holder's height.
   */
   public void setHeightInch(double hi)
   {
      heightInch = hi;
   }
   
   /**
      This method sets the policy holder's weight.
   */
   public void setWeightLbs(double wl)
   {
      weightLbs = wl;
   }
   
   // Create getters.
   
   /**
      This method gets the policy holder's policy number.
      @return policyNumber Holds the policy number.
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      This method gets the insurance provider's name
      @return providerName Holds the provider's name.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      This method gets the policy holder's first name.
      @return holderFirstName Holds the holder's first name.
   */
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   /**
      This method gets the policy holder's last name.
      @return holderLastName Policy holder's lastName.
   */
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   /**
      This method gets the policy holder's age.
      @return age Policy holder's age.
   */
   public double getAge()
   {
      return age;
   }
   
   /**
      This method returns the smoking status as a string.
      @return smokerStr Policy holder's smoking status.
   */
   public String getSmokeStr()
   {
      return smokerStr;
   }
   
   /**
      This method returns the policy holder's height in inches.
      @return heightInch Policy holder's height in inches.
   */
   public double getHeightInch()
   {
      return heightInch;
   }
   
   /**
      This method gets the policy holder's weight in pounds.
      @return weightLbs Policy holder's weight in pounds.
   */
   public double getWeightLbs()
   {
      return weightLbs;
   }

}