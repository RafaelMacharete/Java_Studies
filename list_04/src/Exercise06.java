import java.util.Scanner;
public class Exercise06 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);

        System.out.println("Enter the note 1: ");
        int note1 = data.nextInt();

        System.out.println("Enter the note 2: ");
        int note2 = data.nextInt();

        double grade = (note1 * 4 + note2 * 6) / 10;
        System.out.println("Grade: " + grade);
        data.close();

    }
}
