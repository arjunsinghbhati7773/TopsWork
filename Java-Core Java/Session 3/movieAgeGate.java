/* Create a Java class MovieAgeGate that asks the user for their age and uses an if-else-if ladder to print 'Kids Section' if age < 13,
 'Teen Section' if age is between 13 and 17, and 'Adult Section' if age is 18 or above. */
import java.util.Scanner;
public class movieAgeGate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age =sc.nextInt();
        if(age < 13)
        {
            System.out.println("Kids");
        }
        else if(age > 13 && age <= 17)
        {
            System.out.println("Teen");
        }
        else if(age >= 18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Invalid Age");
        }
    }
}