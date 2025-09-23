import java.util.Scanner;

public class Project_Hadi_Eljarieh
{
   public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      
      //declare varibles
      int policyNum;
      String provName;
      String firName;
      String lasName;
      int ag;
      String smokerStat; 
      double hei; 
      double wei; 
      
      // Get user Input
       System.out.print( "Please enter the Policy Number: ");
       policyNum = keyboard.nextInt();
       keyboard.nextLine(); // Reset new line
     
       System.out.print( "Please enter the Provider Name: ");
       provName = keyboard.nextLine();
      
       System.out.print( "Please enter the Policyholder's First Name: ");
       firName = keyboard.nextLine();
      
       System.out.print( "Please enter the Policyholder's Last Name: ");
       lasName = keyboard.nextLine();
     
       System.out.print( "Please enter the Policyholder's Age: ");
       ag = keyboard.nextInt();
       keyboard.nextLine(); // reset new line
      
       System.out.print( "Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
       smokerStat = keyboard.nextLine();
      
       System.out.print( "Please enter Policyholder's Height (in inches): ");
       hei = keyboard.nextDouble();
      
       System.out.print( "Please enter the Policyholder's Weight (in pounds): ");
       wei = keyboard.nextDouble();
      
      //Instantate a Policy object 
       Policy policy = new Policy ( policyNum, provName, firName, lasName, ag, smokerStat, hei, wei);
     
      // Display results
       System.out.println();
       System.out.println("Policy Number: " + policy.getNumber());
       System.out.println("Provider Name: " + policy.getProvider());
       System.out.println("Policyholder's First Name: " + policy.getFirst());
       System.out.println("Policyholder's Last Name: " + policy.getLast());
       System.out.println("Policyholder's Age: " + policy.getAge());
       System.out.println("Policyholder's Smoking Status: " + policy.getStatus());
       System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
       System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
       System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
       System.out.printf("Policy Price: $%.2f%n", policy.getBase());
      
    }
}