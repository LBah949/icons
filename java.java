import java.util.Scanner;

public class SimpleGradeCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Step 1: Ask number of subjects
        System.out.print("How many subjects? ");
        int n = in.nextInt();

        int sum = 0; // total marks

        // Step 2: Input marks with a FOR loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Marks for subject " + i + ": ");
            int m = in.nextInt();

            // IF to check valid marks
            if (m < 0 || m > 100) {
                System.out.println("Enter between 0 and 100.");
                i--; // repeat this subject
                continue;
            }
            sum += m;
        }

        // Step 3: Average
        double avg = (double) sum / n;
        System.out.println("\nTotal = " + sum);
        System.out.println("Average = " + avg);

        // Step 4: Decide grade with IF
        char g;
        if (avg >= 90) g = 'A';
        else if (avg >= 75) g = 'B';
        else if (avg >= 50) g = 'C';
        else if (avg >= 40) g = 'D';
        else g = 'F';

        System.out.println("Grade = " + g);

        // Step 5: Switch for feedback
        switch (g) {
            case 'A': System.out.println("Excellent!"); break;
            case 'B': System.out.println("Very Good!"); break;
            case 'C': System.out.println("Good."); break;
            case 'D': System.out.println("Pass."); break;
            case 'F': System.out.println("Fail."); break;
        }

        in.close();
    }
}