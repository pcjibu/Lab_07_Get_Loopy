import java.util.Scanner;
public class Part8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        String trash = "";
        boolean done = false;
        System.out.println("Enter a temperature in celsius: ");

        do {
            if(in.hasNextDouble())
            {
                tempC = in.nextDouble();
                double tempF = (tempC * 1.8) + 32;
                System.out.println("The temperature in fahrenheit is: " + tempF);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid input " + trash);
                System.out.println("Please try again and enter a numerical value");


            }
        }while(!done);

    }
}
