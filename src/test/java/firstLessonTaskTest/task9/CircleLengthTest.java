package firstLessonTaskTest.task9;

import by.home.lesson1.task9.CircleCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CircleLengthTest {

    private float radius;
    private float expected;

    public CircleLengthTest(float radius, float expected) {
        this.radius = radius;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tableValue(){
        return Arrays.asList(new Object[][]{{0, 0}, {79, 496.4f}, {45, 282.7f}});
    }

    @Test()
    public void testFirstMethod(){
        CircleCalculator circleCalculator = new CircleCalculator();
        float actual = circleCalculator.circleLength(radius);
        Assert.assertEquals(expected, actual, 0.1);
    }
}
