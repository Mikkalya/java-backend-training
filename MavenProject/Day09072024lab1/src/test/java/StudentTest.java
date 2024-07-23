import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student student;
    @BeforeEach
    void setUp(){
        student=new Student(1,"mikkalya","Cuddalore",78,69,81,12000.599f,false);
    }
    @Test
    void testGetAnnualFee(){
        int actual=student.getAnnualFee();
//        int expected=(int) (student.feePerMonth*12);
        assertEquals(144007,actual);
    }

    @Test
    void testGetTotalMarks(){
        int actual=student.getTotalMarks();
//        int expected=student.marks1+student.marks2+student.marks3;
//        System.out.println(student.marks1+student.marks2+student.marks3);
        assertEquals(228,actual);
    }
    @Test
    void testGetAverage(){
        float actual=student.getAverage();
//        float expected=(student.getTotalMarks()/3);
//        System.out.println(student.getTotalMarks()/3);
        assertEquals(76,actual);
    }
    @Test
    void testGetResult(){
        String actual=student.getResult();
//        String expected="pass";
        assertEquals("pass",actual);
    }
}
