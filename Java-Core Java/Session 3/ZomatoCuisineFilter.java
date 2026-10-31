/* Build a Java program called ZomatoCuisineFilter that takes a string input for cuisine ('Indian', 'Chinese', 'Italian', 'Mexican')
 and uses a switch statement to print a list of 2-3 sample restaurants for the selected cuisine. Print 'Cuisine Not Found' for any other input. */
 
import java.util.Scanner;
public class ZomatoCuisineFilter
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cuisine");
        String cuisine=sc.next();
        switch(cuisine)
        {
            case "Indian" :
                {
                    System.out.println("Taj Hotel");
                    System.out.println("Hotel Raj");
                    System.out.println("Hotel Antiliya");
                    break;
                }
            case "Chinese" :
                {
                    System.out.println("China House");
                    System.out.println("Chinese Center");
                    System.out.println("Mainland China");
                    break;
                }
            case "Italian" :
                {
                    System.out.println("Allora Milano");
                    System.out.println("Kitcha: Together We Eat");
                    System.out.println("Salé & Pepe");
                    break;
                }
            case "Mexican" :
                {
                    System.out.println("DosBros Mexican Restaurant");
                    System.out.println("The Latin House");
                    System.out.println("Tres Amigos");
                    break;
                }
            default:
                {
                    System.out.println("Cuisine not found");
                }
        }
    }
}