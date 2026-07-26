import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== A Comprehensive Measure of Well-Being =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter Physical Health Score (1-10): ");
        int physical = sc.nextInt();

        System.out.print("Enter Mental Health Score (1-10): ");
        int mental = sc.nextInt();

        System.out.print("Enter Sleep Score (1-10): ");
        int sleep = sc.nextInt();

        System.out.print("Enter Stress Score (1-10): ");
        int stress = sc.nextInt();

        double average = (physical + mental + sleep + stress) / 4.0;

        System.out.println("\n----- Result -----");
        System.out.println("Name : " + name);
        System.out.println("Average Score : " + average);

        if (average >= 8) {
            System.out.println("Well-Being Status : Excellent");
        } else if (average >= 6) {
            System.out.println("Well-Being Status : Good");
        } else if (average >= 4) {
            System.out.println("Well-Being Status : Average");
        } else {
            System.out.println("Well-Being Status : Needs Improvement");
        }

        sc.close();
    }
}