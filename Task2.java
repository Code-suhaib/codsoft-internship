import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        double total = 0;
        
        System.out.println("Enter your marks of 5 subject and also take a note that marks should not be more than 100");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("plz Enter next subject marks: ");
            int mark = scanner.nextInt();
            
            while (mark < 0 || mark > 100) {
                System.out.print("plz Enter the valid marks: ");
                mark = scanner.nextInt();
            }
            
            marks[i] = mark;
            total += mark;
        }
        
        double percentage = (total / 500) * 100;
        
        System.out.println("Done");
        System.out.println("Your Total Marks are " + total);
        System.out.println("Your Percentage is " + percentage + "%");
        
        if (percentage >= 90) {
            System.out.println("Excellent, you have got A+ grade");
        } else if (percentage >= 80) {
            System.out.println("Very Good, you have got A grade");
        } else if (percentage >= 70) {
            System.out.println("Good, you have got B grade");
        } else if (percentage >= 35) {
            System.out.println("Satisfactory, you have got C grade");
        } else {
            System.out.println("Fail");
        }
        
        scanner.close();
    }
}
