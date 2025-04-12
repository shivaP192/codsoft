import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            int mark = scanner.nextInt();

            
            while (mark < 0 || mark > 100) {
                System.out.println(" Invalid marks! Enter a number between 0 and 100.");
                System.out.print("Re-enter marks for subject " + (i + 1) + ": ");
                mark = scanner.nextInt();
            }

            marks[i] = mark;
            totalMarks += mark;
        }

       
        double average = (double) totalMarks / numSubjects;

       
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        
        System.out.println("\n --- Result Summary ---");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
