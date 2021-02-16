package by.home.lesson1.task4;

public class FourthTask {
    public static void main(String[] args) {
        int [] numbers = {1,2,4,1};
        WorkWithList workWithList = new WorkWithList();
        boolean result = workWithList.checkForTwoOrMoreEven(numbers);
        System.out.println(result);
    }

}
