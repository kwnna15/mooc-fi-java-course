
import java.util.Scanner;
import static org.graalvm.compiler.nodes.java.RegisterFinalizerNode.register;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class TextUI {

    private final Scanner scanner;
    private final GradeStatistics gradeStatistics;

    public TextUI(Scanner scanner, GradeStatistics gradeStatistics) {
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printAverageAll();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();
    }

    private void readPoints() {
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            int points = Integer.valueOf(input);
            if (points == -1) {
                break;
            } else if (points >= 0 && points <= 100) {
                this.gradeStatistics.addPoints(points);
            }
        }
    }

    private void printAverageAll() {
        System.out.println("Point average (all): " + gradeStatistics.averageOfPointsAll());
    }

    private void printAveragePassing() {
        if (gradeStatistics.averageOfPassingPoints() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + gradeStatistics.averageOfPassingPoints());
        }
    }

    private void printPassingPercentage() {
        System.out.println("Pass percentage: " + gradeStatistics.passPercentage());
    }

    private void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            int stars = gradeStatistics.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
        }
    }

    private static void printStars(int numStars) {
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
    }
}
