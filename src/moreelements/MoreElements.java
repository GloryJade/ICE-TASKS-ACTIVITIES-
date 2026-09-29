package moreelements;

import java.util.Scanner;

public class MoreElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array of 10 student names
        String[] students = {
            "Sibusiso Khumalo",
            "Nthabiseng Mokoena",
            "Liam Smith",
            "Fatima Patel",
            "Kabelo Modise",
            "Thabo Dlamini",
            "Tshepiso Rikotso",
            "Anesh Pillay",
            "Zane van der Merwe",
            "Chidera Okeke"
        };

        System.out.println("Top 10 Second year IT students\n");

        // First prompt (Valid input example)
        try {
            System.out.print("Please enter the position of the student whose name you want displayed: ");
            int position = scanner.nextInt();
            
            // Adjusting 1-based user input to 0-based array index
            System.out.println("The name of the student in position number " + position + " is " + students[position - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error message: Position out of range.");
        } finally {
            System.out.println();
        }

        // Second prompt (Out of bounds trigger example)
        try {
            System.out.print("Please enter the position that you want displayed: ");
            int position = scanner.nextInt();
            
            // Accessing array to trigger exception if position > 10
            System.out.println("The name of the student in position number " + position + " is " + students[position - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError message");
        } finally {
            scanner.close();
        }
    }
}