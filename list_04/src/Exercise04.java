import java.util.Scanner;

public class Exercise04 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);

        System.out.println("Enter a integer number: ");
        int number = data.nextInt();
        int predecessorNum = number - 1;
        int sucessorNum = number + 1;

        System.out.println("Predecessor: " + (predecessorNum) + "\nSucessor: " + (sucessorNum));
        data.close();

    }
}
