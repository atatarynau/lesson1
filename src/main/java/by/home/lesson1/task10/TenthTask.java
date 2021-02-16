package by.home.lesson1.task10;

public class TenthTask {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int h = 2;
        FunctionCalculator functionCalculator = new FunctionCalculator();
        float [][] result = functionCalculator.calculateFunction(x, y, h);
        for (float[] floats : result) {
            System.out.println(floats[0]+"-"+floats[1]);
        }
    }
}
