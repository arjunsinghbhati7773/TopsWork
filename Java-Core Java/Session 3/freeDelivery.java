/* Given this Java snippet: <br><br>int cartTotal = 450;<br>String status = (cartTotal >= 500) ? "Eligible for Free Delivery" : 
"Add more items for Free Delivery";<br><br>Use ChatGPT to generate two alternate ways to write this logic using if-else and nested conditions. 
Copy and implement both in your code, then comment on which one you find clearer. */
import java.util.Scanner;
public class freeDelivery
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        int cartTotal = 450;
        String Status;


        // if else
        if(cartTotal >= 500)
        {
            Status = "Eligible for free delivery";
        }
        else{
            Status = "Add more itam";
        }
        System.out.println(Status);


        // Nested Condition
        if(cartTotal > 0)
        {
            if(cartTotal >= 500)
            {
                Status = "Eligible for free delivery";
            }
            else{
                Status = "Add more itam";
            }
        }
        else
        {
            Status = "Invalid Amount";
        }
        System.out.println(Status);


        // The if else condition is more cleare and simple
    }
}