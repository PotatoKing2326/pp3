import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;
    int numberOfGrades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.numberOfGrades = new Random().nextInt(11);

    }

    StudentGrades(String name) {
        this.studentName = name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();

        grades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        scanner.close();
        
    }

    double lowestGrade(double[] grades) {
        return Arrays.stream(grades).min().orElse(Double.NaN);
    }

    double highestGrade(double[] grades) {
        return Arrays.stream(grades).max().orElse(Double.NaN);
    }

    int numberOfGrades(double[] grades) {
        return grades.length;
    }

    double average(double[] grades) {
        return Arrays.stream(grades).sum()/grades.length;
    }

    String displayStatus() {
        return "Students name: " + studentName + "\nStudents grades: " + Arrays.toString(grades) + "\nLowest grade: " + lowestGrade(grades) + "\nHighest grade: " + highestGrade(grades) + "\nGPA: " + average(grades);
    }

    public static void main(String[] args) {
        StudentGrades Amanda = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades James = new StudentGrades("James", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});

        System.out.println(Amanda.displayStatus() + "\n");
        System.out.println(James.displayStatus() + "\n");

        StudentGrades test = new StudentGrades("test");
        System.out.println(test.displayStatus());
    }
}
