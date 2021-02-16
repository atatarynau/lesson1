package by.home.lesson1.task3;

public class WorkWithArea {
    public double areaOfASmallSquare(double areaOfABigSquare){
        double diagonalOfSmallSquare = Math.sqrt(areaOfABigSquare);
        double areaOfASmallSquare = (Math.pow(diagonalOfSmallSquare, 2) / 2);
        return areaOfASmallSquare;
    }
}
