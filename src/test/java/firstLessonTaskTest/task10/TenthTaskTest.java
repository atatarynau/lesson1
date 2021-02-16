package firstLessonTaskTest.task10;

import org.junit.Assert;
import org.junit.Test;
import by.home.lesson1.task10.FunctionCalculator;


public class TenthTaskTest {
    @Test
    public void testSeventhTest(){
        FunctionCalculator functionCalculator = new FunctionCalculator();
        int x = 5;
        int y = 10;
        int h = 2;
        float [][] actual = functionCalculator.calculateFunction(x,y,h);
        float [][] expected = new float[][]{{5,-3.380515f}, {7,0.871448f}, {9, -0.45231566f}};
        Assert.assertArrayEquals(expected, actual);
    }
}
