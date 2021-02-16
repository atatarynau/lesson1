package firstLessonTaskTest.task7;

import org.junit.Assert;
import org.junit.Test;
import by.home.lesson1.task7.PointDistanceComp;

public class SeventhTaskTest {
    @Test
    public void testSeventhTest(){
        PointDistanceComp pointDistanceComp = new PointDistanceComp();
        int x1 = 11;
        int y1 = 22;
        int x2 = 10;
        int y2 = 23;
        String actual = pointDistanceComp.compareDistance(x1, y1, x2, y2);
        String expected = "first point is closer than second";
        Assert.assertEquals(expected, actual);
    }
}
