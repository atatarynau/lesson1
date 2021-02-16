package firstLessonTaskTest;

import firstLessonTaskTest.task1.FirstTaskTest;
import firstLessonTaskTest.task10.TenthTaskTest;
import firstLessonTaskTest.task2.SecondTaskTest;
import firstLessonTaskTest.task3.ThirdTaskTest;
import firstLessonTaskTest.task4.FourthTaskTest;
import firstLessonTaskTest.task5.FifthTaskTest;
import firstLessonTaskTest.task6.SixthTaskTest;
import firstLessonTaskTest.task7.SeventhTaskTest;
import firstLessonTaskTest.task8.EightTaskTest;
import firstLessonTaskTest.task9.NinthTaskTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses({FifthTaskTest.class, FirstTaskTest.class, SecondTaskTest.class, ThirdTaskTest.class, NinthTaskTest.class,
        TenthTaskTest.class, FourthTaskTest.class, SixthTaskTest.class, EightTaskTest.class, SeventhTaskTest.class})
@RunWith(Suite.class)
public class TestSuite {

}
