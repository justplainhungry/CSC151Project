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
   public PolicyHolder()
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
   public PolicyHolder(String pn, String provN, String hfn, String hln, String smk, double a, double hi, double wl)
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
      
   
   /**
      Set method to hold all variables
      @param pN Holder's policy number
      @param provN Provider Name
      @param hfn Holder's first name
      @param a Holder's age
      @param sm Holder's Smoking status
      @param hi Holder's height in inches
      @param wl Holder's weight in pounds
   */
   public void setPolicyHolder(String pn, String provN, String hfn, String hln, double a, String sm, double hi, double wl)
   {
      policyNumber = pn;
      providerName = provN;
      holderFirstName = hfn;
      holderLastName = hln;
      age = a;
      smokerStr = sm;
      heightInch = hi;
      weightLbs = wl;
   }   
   
   /**
      Copy Constructor.
      @param obj Copy Oobject
   */
   public PolicyHolder(PolicyHolder obj)
   {
      policyNumber = obj.policyNumber;
      providerName = obj.providerName;
      holderFirstName = obj.holderFirstName;
      holderLastName = obj.holderLastName;
      age = obj.age;
      smokerStr = obj.smokerStr;
      heightInch = obj.heightInch;
      weightLbs = obj.weightLbs;
   }
   
   //return weight **probably wrong to put a return type, possibly need another way to return this data
   public double getWeight()
   {
      return weightLbs;
   }
   
   //return height ******^^^^^^^^^^^^^^^^
   public double getHeight()
   {
      return heightInch;
   }
   
   //return age^^^^^^^^^^^^^^^^^^^^^^^
   public double getAge()
   {
      return age;
   }
   
   //return smoking status
   public String getSmokeStat()
   {
      return smokerStr;
   }
           
   /**
      Converts all data to string.
      @return str Data in String.
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNumber +
                   "Provider Name: " + providerName +
                   "Policyholder's First Name: " + holderFirstName +
                   "Policyholder's Last Name: " + holderLastName +
                   "Policyholder's Age: " + age +
                   "Policyholder's Smoking Status: " + smokerStr +
                   "Policyholder's Height: " + heightInch +
                   "Policyholder's Weight: " + weightLbs;
      return str;      
   }

}
