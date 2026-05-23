package util;

public class PerformanceAnalyzer {

    public static String calculateGrade(double marks) {

        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else
            return "Fail";
    }

    public static String getRemark(double marks) {

        if (marks >= 90)
            return "Excellent Performance";
        else if (marks >= 75)
            return "Good Performance";
        else if (marks >= 60)
            return "Average Performance";
        else
            return "Needs Improvement";
    }
}