package lab2;
import java.util.Scanner;

public class MarkSheet {
    

    public static String getStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        return scanner.nextLine();
    }

    public static double getTotalMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total marks: ");
        return scanner.nextDouble();
    }

    public static double getObtainedMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the obtained marks: ");
        return scanner.nextDouble();
    }

 
    public static double calculatePercentage(double totalMarks, double obtainedMarks) {
        return totalMarks == 0 ? 0.0 : (obtainedMarks / totalMarks) * 100;
    }


    public static char determineGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else return 'F';
    }


    public static double calculateGPA(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'F': return 0.0;
            default: return 0.0;
        }
    }


    public static void displayMarkSheet(String name, double totalMarks, double obtainedMarks) {
        double percentage = calculatePercentage(totalMarks, obtainedMarks);
        char grade = determineGrade(percentage);
        double gpa = calculateGPA(grade);

        System.out.println("\nMark Sheet");
        System.out.println("-----------");
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Obtained Marks: %.2f%n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("GPA: %.2f%n", gpa);
    }


    public static void main(String[] args) {
        String name = getStudentName();
        double totalMarks = getTotalMarks();
        double obtainedMarks = getObtainedMarks();
        
        displayMarkSheet(name, totalMarks, obtainedMarks);
    }
}
