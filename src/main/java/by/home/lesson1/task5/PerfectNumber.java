package by.home.lesson1.task5;

public class PerfectNumber {
    public boolean iSPerfectNumber(int number){
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if(number%i==0){
                sumOfDivisors +=i;
            }
        }
        if(sumOfDivisors == number){
            return true;
        }
        return false;
    }
}
