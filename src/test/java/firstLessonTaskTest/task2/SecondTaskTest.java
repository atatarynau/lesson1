package firstLessonTaskTest.task2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import by.home.lesson1.task2.WorkWithDate;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SecondTaskTest {
    private int year;
    private int month;
    private int expected;

    public SecondTaskTest(int year, int month, int expected) {
        this.year = year;
        this.month = month;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]>arr(){
        return Arrays.asList(new Object[][]{{2020, 2, 29}, {1995, 5, 31},{2001, 1, 31}});
    }

    @Test
    public void testSecondTask(){
        WorkWithDate workWithDate = new WorkWithDate();
        int actual = workWithDate.getNumberOfDaysInMonth(year, month);
        Assert.assertEquals(expected, actual);
    }
}
