/**
 * @author Issa Khodadadi 5/6/2020, 5:11 PM
 **/
public class RandomNumber {
    public static void main(String[] args){
        generateMyNumber();
    }
    public static void generateMyNumber()
    {
        int aNumber;
        aNumber = (int)((Math.random() * 6)+1);
        System.out.print((aNumber));
    }
}
