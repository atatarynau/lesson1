package firstLessonTaskTest.task5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.home.lesson1.task1.WorkWithDigit;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class FifthTaskTest {
    private int x;
    private int expected;

    public FifthTaskTest(int x, int expected){
        this.x = x;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object []> arr(){
        return Arrays.asList(new Object[][]{{10, 0}, {11, 1}, {9, 1}, {54, 6}});
    }

    @Test
    public void testFirstTask(){
        WorkWithDigit workWithDigit = new WorkWithDigit();
        double actual = workWithDigit.getLastDigitOfSquaredNumber(x);
        Assert.assertEquals(expected, actual, 0.1);
    }
}
