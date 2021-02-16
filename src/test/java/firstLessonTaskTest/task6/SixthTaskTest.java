package firstLessonTaskTest.task6;

import org.junit.Assert;
import org.junit.Test;
import by.home.lesson1.task6.TimeCalculator;

public class SixthTaskTest {
    @Test
    public void testSixTest(){
        TimeCalculator timeCalculator = new TimeCalculator();
        int sec = 10000;
        int [] actual = timeCalculator.calculate(sec);
        int [] expected = new int[]{2,46,40};
        Assert.assertArrayEquals(expected, actual);
    }
}
