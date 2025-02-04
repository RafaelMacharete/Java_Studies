package list.src;

import java.util.Scanner;
public class Exercise01 {
    static public void main(String... argv){
        Scanner data = new Scanner(System.in);
        // User name
        System.out.println("Enter your name: ");
        String userName = data.nextLine();

        // User last name
        System.out.println("Enter your last name: ");
        String userLastName = data.nextLine();

        // User birth date
        System.out.println("Enter your date of birth: ");
        String userBirthDate = data.nextLine();

        // Salary claim
        System.out.println("Enter your salary claim: ");
        String userSalaryClaim = data.nextLine();

        // Level of education
        System.out.println("Enter your level of education: ");
        String userLevelEduc = data.nextLine();

        // Position sought

        System.out.println("Enter your position level sought: ");
        byte userPosiLevelSought = data.nextByte();

        System.out.println("Do you have a CNH type 'B'? Y/N: ");
        char cnhB = data.next().charAt(0);

        System.out.println("\nUser Data Collected:");
        System.out.println("Name: " + userName + " " + userLastName);
        System.out.println("Birth Date: " + userBirthDate );
        System.out.println("Salary Claim: " + userSalaryClaim);
        System.out.println("Level of Education: " + userLevelEduc);
        System.out.println("Position Level Sought: " + userPosiLevelSought);
        System.out.println("CNH Type B: " + (cnhB == 'Y' ? "Yes" : "NO"));
        data.close();
    }
}
