package by.home.lesson1.task6;

public class SixTask {
    public static void main(String[] args) {
        int seconds = 10000;
        TimeCalculator timeCalculator = new TimeCalculator();
        int [] result = timeCalculator.calculate(seconds);
        System.out.println(result[0]+":"+result[1]+":"+result[2]);
    }
}
