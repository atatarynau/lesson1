package by.home.lesson1.task10;

public class FunctionCalculator {
    public float [][] calculateFunction(int x, int y, int h){
        int length = (y-x)/h+1;
        float [][] arr = new float[length][2];
        int elem = 0;
        for (int i = x; i < y ; i+=h) {
            arr[elem++] = new float[]{i,(float)Math.tan(i)};
        }
        return arr;
    }
}
