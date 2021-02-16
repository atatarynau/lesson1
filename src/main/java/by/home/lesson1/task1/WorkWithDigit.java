package by.home.lesson1.task1;

public class WorkWithDigit {
    private int getLastDigitOfNumber(int num){
        return num%10;
    }

    public int getLastDigitOfSquaredNumber(int num){
        int lastNumber = getLastDigitOfNumber(num);
        int powLastNumber = (int)Math.pow(lastNumber, 2);
        return getLastDigitOfNumber(powLastNumber);
    }
}
