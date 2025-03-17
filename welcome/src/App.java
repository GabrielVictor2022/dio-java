import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Welcome class! We are training Java!
        // So, we will learn about how to create a academic grade with 4 grades in java
        // Let's start!

        try {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 1 grade: ");
        double grade = input.nextDouble();
        
        System.out.println("Enter your 2 grade: ");
        double grade2 = input.nextDouble();
            
        System.out.println("Enter your 3 grade: ");
        double grade3 = input.nextDouble();
        
        System.out.println("Enter your 4 grade: ");
        double grade4 = input.nextDouble();

        input.close();

        double average = (grade + grade2 + grade3 + grade4) / 4;
        
        if (average >= 7) {
            System.out.println("Congrats! You are approved! Your average is :" + average);
        }
        else{
            System.out.println("You are in the final test! Your average is :" + average); 
        }
        
        } catch (Exception e) {
            System.out.println("Please, type a valid number!");
        }
        }
    }

