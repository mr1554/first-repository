import java.util.Scanner;

/**
 * @author Issa Khodadadi 5/11/2020, 5:40 PM
 **/
public class Student {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter grade");
            int studentGrade = sc.nextInt();

            if (studentGrade >= 10 && studentGrade <=20) {
                System.out.println("u pass\n");
            } else if (studentGrade < 10 ) {
                System.out.println("u fail\n");
            } else
                System.out.println("out of range\n");
        }
    }

}
