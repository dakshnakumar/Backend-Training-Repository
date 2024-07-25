package assignments.lab1.qn1.part1;

import org.example.lab1.qn1.part1.AddMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddMethodTest {

    public AddMethod addMethod;
    int result;

    @BeforeEach
    void setUp() {
        addMethod = new AddMethod();
    }

    @Test
    void testAddTwoNum(){
         result = addMethod.add(30,12);
        assertEquals(42, result);
    }

    @Test
    void testAddThreeNum(){

        result = addMethod.add(10,20,30);
        assertEquals(60,result);
    }

    @Test
    void testAddFloat(){

        float result = addMethod.add(20f,40f);
        assertEquals(60f,result);
    }

    @Test
    void testAddString(){

        String result = addMethod.add("hii",2);
        assertEquals("hii2",result);
    }

}
