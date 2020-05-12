import java.util.Scanner;

/**
 * @author Issa Khodadadi 5/11/2020, 5:49 PM
 **/
public class Student2 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter grade");
            int studentGrade = sc.nextInt();

            System.out.println(studentGrade >=10 ? "passed" : "failed");
        }
    }
}
