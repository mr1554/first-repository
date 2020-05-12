import java.util.Scanner;

/**
 * @author Issa Khodadadi 5/10/2020, 10:19 AM
 **/
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account(50.00); //new obj of Account
        Account acc2 = new Account(-7.53); //new obj of Account

        System.out.printf("account1 balance: $%.2f\n", acc1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", acc2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;
        System.out.println("enter deposit amount for acc1: ");
        depositAmount = input.nextDouble();

        System.out.printf("adding %.2f to acc1 balance...\n\n", depositAmount);
        acc1.credit(depositAmount);

        System.out.printf("acc1 balance: $%.2f\n", acc1.getBalance());
        System.out.printf("acc2 balance: $%.2f\n\n", acc2.getBalance());

        System.out.print("enter deposit amount for acc2: ");
        depositAmount = input.nextDouble();

        System.out.printf("adding %.2f to acc2 balance...\n\n", depositAmount);
        acc2.credit(depositAmount);

        System.out.printf("acc1 balance: $%.2f\n", acc1.getBalance());
        System.out.printf("acc2 balance: $%.2f\n", acc2.getBalance());
    } // end method main
} // end AccountTest class
