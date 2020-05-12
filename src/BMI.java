import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter w8: ");
        int w8 = sc.nextInt();

        System.out.println("enter H8: ");
        double h8 = sc.nextDouble();

        double z = h8 * h8;

        System.out.println("bmi is " + w8 / z);

    }
}
