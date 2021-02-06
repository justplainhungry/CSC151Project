/**
   This is project 1. 
   This Policy class models an insurance policy for a single person,
*/

public class Policy
{  
   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int age;
   private boolean smoker;
   private double heightInch;
   private double weightLbs;

   // Set up constructor.
   public Policy(String pn, String provN, String hfn, String hln, int a, boolean sm, double hi, double wl)
   {
      policyNumber = pn;
      providerName = provN;
      holderFirstName = hfn;
      holderLastName = hln;
      age = a;
      smoker = sm;
      heightInch = hi;
      weightLbs = wl;
   }
   
   // Set up no-arg constructor
   
}
