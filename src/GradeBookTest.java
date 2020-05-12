import java.util.Scanner;

/**
 * @author Issa Khodadadi {5/5/2020}, {3:54 PM}
 **/
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String nm = name.nextLine();
        GradeBook gb = new GradeBook(nm);
        GradeBook gb2 = new GradeBook("kimm");

        System.out.println("my name is: " + gb.getPersonName());
        System.out.println("my book: " + gb2.getPersonName());

    }
}
