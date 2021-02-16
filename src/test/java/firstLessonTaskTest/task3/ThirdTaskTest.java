package firstLessonTaskTest.task3;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.home.lesson1.task3.WorkWithArea;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ThirdTaskTest {
    private double areaOfABigSquare;
    private double expected;

    public ThirdTaskTest(double areaOfABigSquare, double expected) {
        this.areaOfABigSquare = areaOfABigSquare;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tableValues(){
        return Arrays.asList(new Object[][]{{25,12.5},{5,2.5},{0,0}});
    }

    @Test
    public void testThirdTask(){
        WorkWithArea workWithArea = new WorkWithArea();
        double actual = workWithArea.areaOfASmallSquare(areaOfABigSquare);
        Assert.assertEquals(expected, actual, 0.1);
    }
}
