package firstLessonTaskTest.task8;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.home.lesson1.task8.Calculator;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class EightTaskTest {
    private float x;
    private float expected;

    public EightTaskTest(float x, float expected) {
        this.x = x;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tableValues(){
        return Arrays.asList(new Object[][]{{10,-61},{6,-9},{2, 0.5f}});
    }

    @Test(timeout = 1)
    public void testThirdTask(){
        Calculator calculator = new Calculator();
        float actual = calculator.calculateFunction(x);
        Assert.assertEquals(expected, actual, 0.1);
    }
}
