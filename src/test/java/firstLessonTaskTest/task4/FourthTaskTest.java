package firstLessonTaskTest.task4;

import org.junit.Assert;
import org.junit.Test;
import by.home.lesson1.task4.WorkWithList;


public class FourthTaskTest {


    @Test
    public void testThirdTask(){
        WorkWithList workWithList = new WorkWithList();
        boolean actual = workWithList.checkForTwoOrMoreEven(new int[]{1,4,5});
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}
