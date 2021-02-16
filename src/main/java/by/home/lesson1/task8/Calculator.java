package by.home.lesson1.task8;

public class Calculator {
    public float calculateFunction(float x){
        if(x>=3){
            return -(x*x)+3*x+9;
        }else{
            return ((float) (1 / (Math.pow(x, 3) - 6)));
        }
    }
}
