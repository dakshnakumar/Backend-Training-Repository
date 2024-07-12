package org.example.lab1TestCase.part2;

import org.example.lab1.qn1.part2.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    Student obj;
    Student student;
    Student student1;
    Student student2;

    @BeforeEach
    void SetUp(){
        obj = new Student();
        student = new Student(001,"Kumar","kovilpatti",80,90,70,2000,true);
        student1 = new Student(002,"dakshna","madurai",90,100,92,5000,true);
        student2 = new Student(003,"mani","coimbatore",89,90,77,8000,true);
    }

    @Test
    void testGetAnnualFee(){
        student.getAnualFee();
        assertEquals(24000,student.getAnualFee());
    }

    @Test
    void testGetTotalMarks(){
        student.getTotalmarks();
        assertEquals(240,student.getTotalmarks());
    }

    @Test
    void testAverage(){
        student.getAverage();
        assertEquals(80,student.getAverage());
    }

    @Test
    void testGetResult(){
        student.getResult();
        assertEquals(true,student.getResult());
    }

    @Test
    void testGetHighTotalMark(){
        assertEquals("dakshna",obj.getHighTotalMarks(new Student[]{student,student1,student2}));
    }

    @Test
    void testLeastMonthlyFee(){
        assertEquals("dakshna",obj.leastMonthlyFee(new Student[]{student,student1,student2}));
    }

    @Test
    void testIsScholarshipEligibility(){
        assertEquals(true,student1.getIsEligibleForScholarship());
    }


}
