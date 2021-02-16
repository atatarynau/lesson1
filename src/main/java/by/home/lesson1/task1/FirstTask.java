package by.home.lesson1.task1;

public class FirstTask {
    public static void main(String[] args) {
        int number = 10;
        WorkWithDigit workWithDigit = new WorkWithDigit();
        int result = workWithDigit.getLastDigitOfSquaredNumber(number);
        System.out.println(result);
    }
}
