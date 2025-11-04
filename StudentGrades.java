import java.util.Scanner;

public class StudentGrades {

    // By: Carlo Sebastian M. Dingle

    static class ANSI {
        public static final String RESET = "\u001B[0m";
        public static final String PINK = "\u001B[95m";
        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {


        String[] students = {"Donasco", "Dingle", "Cachapero"};
        String[] subjects = {"CCINCOML", "CCPRGG1L", "CCPRGG2L"};
        int[][] grades = new int [3][3];
        double[] averages = new double[3];

        Scanner input = new Scanner(System.in);

        System.out.println(ANSI.PINK + "=========================================" + ANSI.RESET);
        System.out.println(ANSI.PINK + " NATIONAL UNIVERSITY - MOA GRADE REPORT" + ANSI.RESET);
        System.out.println(ANSI.PINK + "=========================================" + ANSI.RESET);

       for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter grades for " + students[i] + ":");
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = input.nextInt();
                sum += grades[i][j];
            }
            averages[i] = sum / (double) subjects.length;
        }

        double classAverage = 0;
        double highestAverage = averages[0];
        String topStudent = students[0];

        for (int i = 0; i < averages.length; i++) {
            classAverage += averages[i];
            if (averages[i] > highestAverage) {
                highestAverage = averages[i];
                topStudent = students[i];
            }
        }
        classAverage /= students.length;

        System.out.println(ANSI.PINK + "\n=========================================" + ANSI.RESET);
        System.out.println(ANSI.PINK + "           STUDENT GRADE REPORT          " + ANSI.RESET);
        System.out.println(ANSI.PINK + "=========================================" + ANSI.RESET);
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Name", "Math", "Science", "English", "Average");
        System.out.println(ANSI.PINK + "---------------------------------------------------" + ANSI.RESET);

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-10s", students[i]);
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("%-10d", grades[i][j]);
            }
            System.out.printf("%-10.2f%n", averages[i]);
        }
        System.out.println(ANSI.PINK + "---------------------------------------------------" + ANSI.RESET);

        System.out.println(ANSI.PINK + "Class Average: " + String.format("%.2f", classAverage) + ANSI.RESET);
        System.out.println(ANSI.PINK + "Highest Average: " + topStudent + " (" + String.format("%.2f", highestAverage) + ")" + ANSI.RESET);
        input.close();
    }
}