import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            int number1, // first number to add
                number2, // second number to add
                sum; // sum of number1 and number2

            System.out.print("enter number1 : ");
            number1 = input.nextInt(); // first number from user

            System.out.print("enter number2 : ");
            number2 = input.nextInt(); // second number from user

            sum = number1 + number2;

            System.out.printf("sum is %d\n" , sum); // display sum
        } // end while loop
    } // end main method

} // end class Addition
