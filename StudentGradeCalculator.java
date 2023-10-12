import java.util.*;
 public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalmarks = 0;
        for(int i =1;i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject" + i + "(out of 100): ");
            int marks = scanner.nextInt();
            totalmarks += marks;

        }
        double averagePercentage = (double) totalmarks / (numSubjects *100) * 100;
        char grade;
        if(averagePercentage >= 90) {
            grade = 'A';

        } else if(averagePercentage >= 80) {
            grade ='B';
        } else if(averagePercentage >= 70) {
            grade ='c';
         } else if(averagePercentage >= 60) {
            grade ='D';
        } else {
            grade ='f';
        }
        System.out.println("Total marks:" + totalmarks);
        System.out.println("Average percentage:" + averagePercentage + "%");
        System.out.println("Grade:" +grade);
        scanner.close();

    }
 }