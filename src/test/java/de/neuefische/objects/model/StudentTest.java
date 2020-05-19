package de.neuefische.objects.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    // Test for isSingle
    @Test
    public void ifStudentIsSingleThisShouldReturnTrue() {

        //GIVEN
        Student student1 = new Student("Blue", true, 5);

        //WHEN
        boolean result = student1.isSingle();

        //THEN
        assertEquals(true, result);
    }


    // Test for flagColor
    @Test
    public void ifStudentsFlagColorIsRedThisShouldReturnTrue() {

        //GIVEN
        Student student1 = new Student("Red", true, 5);

        //WHEN
        String result = student1.getFlagColor();

        //THEN
        assertEquals("Red", result);
    }

    // Test for getFails
    @Test
    public void ifStudentsHasFiveFailsThisShouldReturnTrue() {

        //GIVEN
        Student student1 = new Student("Red", true, 5);

        //WHEN
        int result = student1.getFails();

        //THEN
        assertEquals(5, result);
    }

}