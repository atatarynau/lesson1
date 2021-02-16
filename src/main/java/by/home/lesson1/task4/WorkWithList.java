package by.home.lesson1.task4;

public class WorkWithList {
    public boolean checkForTwoOrMoreEven(int[] numbers){
        int counter = 0;
        for (int number : numbers) {
            if(number%2==0){
                counter++;
            }
        }
        if(counter>=2){
            return true;
        }
        return false;
    }
}
