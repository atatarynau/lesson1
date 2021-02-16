package by.home.lesson1.task3;


public class ThirdTask {
    public static void main(String[] args) {
        double areaOfABigSquare = 25;
        WorkWithArea workWithArea = new WorkWithArea();
        double areaOfASmallSquare = workWithArea.areaOfASmallSquare(areaOfABigSquare);
        double diffBetweenSquares = areaOfABigSquare/areaOfASmallSquare;
        System.out.println(areaOfASmallSquare);
        System.out.println(diffBetweenSquares);
    }
}
