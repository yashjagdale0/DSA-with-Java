package aritametic;

public class PercentageCalculator {
    public static void main(String[] args) {
        int totalMarks = 500;
        int obtainedMarks = 425;

        double percentage = (obtainedMarks * 100.0) / totalMarks;

        System.out.println("Percentage = " + percentage + "%");
    }
}
