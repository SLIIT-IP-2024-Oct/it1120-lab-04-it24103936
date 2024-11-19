import java.util.Scanner;

public class it24103936lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        double examMarks = getValidMarks(scanner, "Enter the exam marks (out of 100): ");

        // Input and validate lab submission marks
        double labMarks = getValidMarks(scanner, "Enter the lab submission marks (out of 100): ");

        // Input and validate the percentages
        double examPercentage = getValidPercentage(scanner, "Enter the percentage for the exam (out of 100): ");
        double labPercentage = getValidPercentage(scanner, "Enter the percentage for the lab submission (out of 100): ");

        // Ensure the percentages add up to 100
        while (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100%. Please try again.");
            examPercentage = getValidPercentage(scanner, "Enter the percentage for the exam (out of 100): ");
            labPercentage = getValidPercentage(scanner, "Enter the percentage for the lab submission (out of 100): ");
        }

        // Calculate the final mark
        double finalMark = calculateFinalMark(examMarks, labMarks, examPercentage, labPercentage);

        // Output the final mark
        System.out.println("The final mark is: " + finalMark);
    }

    // Method to input and validate marks
    public static double getValidMarks(Scanner scanner, String prompt) {
        double marks;
        while (true) {
            System.out.print(prompt);
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100. Please try again.");
            }
        }
        return marks;
    }

    // Method to input and validate percentages
    public static double getValidPercentage(Scanner scanner, String prompt) {
        double percentage;
        while (true) {
            System.out.print(prompt);
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Percentage should be between 0 and 100. Please try again.");
            }
        }
        return percentage;
    }

    // Method to calculate the final mark based on the given weights
    public static double calculateFinalMark(double examMarks, double labMarks, double examPercentage, double labPercentage) {
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        return finalMark;
    }
}
