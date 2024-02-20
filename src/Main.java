import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the temperature in Celcius");

        int tempC = in.nextInt();

        double tempF = (1.8 * tempC)+32;

        System.out.println("The temperature in Celcius is: " +tempC);
        System.out.println("The temperature in Fahreneit is: " +tempF);
    }
}