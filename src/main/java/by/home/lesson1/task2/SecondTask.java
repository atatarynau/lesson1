package by.home.lesson1.task2;

public class SecondTask {
    public static void main(String[] args) {
        WorkWithDate workWithDate = new WorkWithDate();
        int month = 2;
        int year = 2020;
        int numberOfDays = workWithDate.getNumberOfDaysInMonth(year, month);
        System.out.println(numberOfDays);
    }
}
