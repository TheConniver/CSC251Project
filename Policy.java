public class Policy
{
   //instance field 
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokerStatus; // smoker or non smoker
   private  double height; // inches
   private double weight; // pounds
   
   
   //No-arg constructor // Default Values
   public Policy()
   {
    policyNumber = 0;
    providerName = "";
    firstName = "";
    lastName = "";
    age = 0;
    smokerStatus = "Non-Smoker";
    height = 0.0;
    weight = 0.0;
    }
    
    // Constructor that accepts argument for the varibles above
     public Policy(int num, String prov, String fir, String las, int a, String smoke, double h, double w)
     {
      policyNumber = num;
      providerName = prov;
      firstName = fir;
      lastName = las;
      age = a;
      smokerStatus = smoke;
      height = h;
      weight = w;
     }
     
     
    // Setters and getters
     public void setNumber(int num) // Policy Number
      { policyNumber = num; }
     public int getNumber()
      { return policyNumber; }
      
      public void setProvider(String prov)// Provider
      { providerName = prov; }
     public String getProvider()
      { return providerName; }
      
      public void setFirst (String fir) // First Name
      { firstName = fir; }
     public String getFirst()
      { return firstName; }
      
      public void setLast (String las) // last Name
      { lastName = las; }
     public String getLast()
      { return lastName; }
      
      public void setAge(int a) // age
      { age = a; }
     public int getAge()
      { return age; }
      
      public void setStatus(String smoke) // smoker status
      { smokerStatus = smoke; }
     public String getStatus()
      { return smokerStatus; }
      
      public void setHeight(double h) // height 
      { height = h; }
     public double getHeight()
      { return  height ; }
      
      public void setWeight(double w) // weight
      { weight = w; }
     public double getWeight()
      { return weight; }
      
      
     // Calculate BMI
      public double getBMI()
      {
       return (weight * 703.0) / (height * height);
      } 
      
      
     // Calculate Price of Policy
      public double getbase()
      {
       double base = 600;
      
       if ( age > 50) // Age over 50 charge $75 more
       {
        base += 75;
       }
    
       if ( smokerStatus.equalsIgnoreCase("smoker")) // Smokers charged $100 more
       { 
        base += 100;
       }
      
       double BMI = getBMI(); // Declare BMI varible
       if ( BMI > 35 ) // BMI over 35 charge based on formula
       {
      
        base += (BMI -35.0) * 20;
       }
       
       return base;
       
      }
      
      
     
}   
