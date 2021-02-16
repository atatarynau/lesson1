package by.home.lesson1.task7;

public class SeventhTask {
    public static void main(String[] args) {
        int x1 = 100;
        int y1 = 21;
        int x2 = 16;
        int y2 = 18;
        PointDistanceComp pointDistanceComp = new PointDistanceComp();
        System.out.println(pointDistanceComp.compareDistance(x1, y1, x2, y2));
    }
}
