package by.home.lesson1.task9;

public class NinthTask {
    public static void main(String[] args) {
        float radius = 45f;
        CircleCalculator circleCalculator = new CircleCalculator();
        float length = circleCalculator.circleLength(radius);
        float area = circleCalculator.circleArea(radius);
        System.out.println(length);
        System.out.println(area);
    }
}
