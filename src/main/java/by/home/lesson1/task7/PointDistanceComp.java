package by.home.lesson1.task7;

public class PointDistanceComp {
    private float distanceFromStartToPoint(int x, int y){
        return ((float) Math.sqrt(x * x + y * y));
    }

    public String compareDistance(int x1, int y1, int x2, int y2){
        float distanceFromFirstPoint = distanceFromStartToPoint(x1,y1);
        float distanceFromSecondPoint = distanceFromStartToPoint(x2,y2);
        return distanceFromFirstPoint<distanceFromSecondPoint?"first point is closer than second":"second point is " +
                "closer than first";
    }
}
