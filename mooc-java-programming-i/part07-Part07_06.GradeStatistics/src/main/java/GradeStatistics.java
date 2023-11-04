
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class GradeStatistics {

    private final ArrayList<Integer> points;
    private final ArrayList<Integer> passingPoints;
    private final ArrayList<Integer> grades;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
        if (points >= 50) {
            passingPoints.add(points);
        }
    }

    public double averageOfPointsAll() {
        if (points.isEmpty()) {
            return -1;
        } else {
            return getTotalPoints() / (points.size() * 1.0);
        }
    }

    public double averageOfPassingPoints() {
        if (passingPoints.isEmpty()) {
            return 0;
        } else {
            return getTotalPassingPoints() / (passingPoints.size() * 1.0);
        }
    }

    private int getTotalPoints() {
        return points.stream().reduce(0, Integer::sum);
    }

    private int getTotalPassingPoints() {
        return passingPoints.stream().reduce(0, Integer::sum);
    }

    public double passPercentage() {
        int participants = points.size();
        int passing = passingPoints.size();
        double passingRatio = passing / (participants * 1.0);
        if (participants == 0) {
            return -1;
        } else {
            return 100 * passingRatio;
        }
    }

    public static int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }

    public int totalGradesFromPoints(int grade) {
        return (int) grades.stream()
                .filter(g -> g == grade)
                .count();
    }
}
