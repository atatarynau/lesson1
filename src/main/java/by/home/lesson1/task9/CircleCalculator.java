package by.home.lesson1.task9;

public class CircleCalculator {
    public float circleLength(float radius){
        float length = (float) (2*Math.PI * radius);
        return length;
    }

    public float circleArea(float radius){
        float area = (float) (Math.PI * radius * radius);
        return area;
    }
}
