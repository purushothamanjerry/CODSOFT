package Studentgradeclac;
import java.util.Scanner;

public class main {
    
	
	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        int tmark = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            if (marks > 100) {
                error();
                i--;             } else {
                tmark += marks;
            }
        }        double averagePercentage = (double) tmark / subjects;
char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("----------------------------");
        System.out.println("Total Marks: " + tmark);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }


    public static void error() {
        System.out.println("Enter the mark out of 100");
    }
}
