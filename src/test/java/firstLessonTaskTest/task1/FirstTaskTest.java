package firstLessonTaskTest.task1;

import org.junit.Assert;
import org.junit.Test;
import by.home.lesson1.task5.PerfectNumber;

public class FirstTaskTest {



    @Test
    public void testFirstTask(){
        PerfectNumber perfectNumber = new PerfectNumber();
        int number = 28;
        boolean actual = perfectNumber.iSPerfectNumber(28);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }
}
