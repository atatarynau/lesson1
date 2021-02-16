package by.home.lesson1.task6;

public class TimeCalculator {
    public int [] calculate(int seconds){
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int sec = seconds%60;
        return new int[]{hours, minutes, sec};
    }
}
