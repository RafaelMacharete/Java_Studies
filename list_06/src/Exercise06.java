package list_06.src;
import java.util.Scanner;
public class Exercise06 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);
        System.out.println("What number would you like to know the multiplication table?");
        int numberOfTable = data.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberOfTable + "*" + i + " = " + numberOfTable * i);
        }
    }
}
