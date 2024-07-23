import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddMethodsTest {
    private AddMethods addMethods;
    @BeforeEach
    void setUp(){
        addMethods=new AddMethods();
    }
    @Test
    void testAddTwoIntegerNumbers(){
        int actual=addMethods.add(20,30);
        int expected=20+30;
        assertEquals(expected,actual,"Perfectly adding two integer values");
    }
    @Test
    void testAddThreeIntegerNumbers(){
        int actual=addMethods.add(10,20,30);
        int expected=10+20+30;
        assertEquals(expected,actual,"Perfectly adding three integer values");
    }
    @Test
    void testAddTwoDoubleValues(){
        double actual=addMethods.add(20.6,10.2);
        double expected=20.6+10.2;
        assertEquals(expected,actual,"Perfectly adding two double values");
    }
    @Test
    void testAddOneStringAndOneInteger(){
        String actual=addMethods.add("Hello",10);
        String expected="Hello "+10;
        assertEquals(expected,actual,"Perfectly conatenating String and Integer");
    }
}
