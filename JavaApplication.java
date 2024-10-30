package javaapplication1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JavaApplication {
    
    // Constants
    private static final int TOTAL_MARKS = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student grading system
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter total marks: ");
        int totalMarks = scanner.nextInt();
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scanner.nextInt();

        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = calculateGrade(percentage);
        double gpa = calculateGPA(percentage);
        displayMarkSheet(studentName, totalMarks, obtainedMarks, percentage, grade, gpa);

        // Rectangle operations
        Rectangle rectangle = new Rectangle();
        System.out.printf("Default Length: %.2f\n", rectangle.getLength());
        System.out.printf("Default Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Default Area: %.2f\n", rectangle.area());
        System.out.printf("Default Perimeter: %.2f\n", rectangle.perimeter());

        System.out.print("Enter new length: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        System.out.print("Enter new width: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.printf("Updated Length: %.2f\n", rectangle.getLength());
        System.out.printf("Updated Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Updated Area: %.2f\n", rectangle.area());
        System.out.printf("Updated Perimeter: %.2f\n", rectangle.perimeter());

        // Close scanner
        scanner.close();
    }

    private static double calculatePercentage(int obtainedMarks, int totalMarks) {
        return (obtainedMarks / (double) totalMarks) * 100;
    }

    private static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else return "F";
    }

    private static double calculateGPA(double percentage) {
        if (percentage >= 90) return 4.0;
        else if (percentage >= 80) return 3.7;
        else if (percentage >= 70) return 3.0;
        else if (percentage >= 60) return 2.0;
        else if (percentage >= 50) return 1.0;
        else return 0.0;
    }

    private static void displayMarkSheet(String studentName, int totalMarks, int obtainedMarks, double percentage, String grade, double gpa) {
        System.out.println("\n--------- Mark Sheet ---------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("------------------------------");
    }

    // Rectangle class definition
    static class Rectangle {
        private double length;
        private double width;

        public Rectangle() {
            this.length = 1.0;
            this.width = 1.0;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            if (length > 0.0 && length < 20.0) {
                this.length = length;
            } else {
                System.out.println("Length must be greater than 0.0 and less than 20.0.");
            }
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width > 0.0 && width < 20.0) {
                this.width = width;
            } else {
                System.out.println("Width must be greater than 0.0 and less than 20.0.");
            }
        }

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }
    }
}

