
import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of grades:");
        int n = scan.nextInt();
        System.out.println("Enter each grade:");
        int avgGrades=0;
        for (int i = 0; i < n; i++) {
            int grades = scan.nextInt();
            avgGrades +=grades;
        }
        System.out.println("Average grade: " +avgGrades/n);
    }
}
