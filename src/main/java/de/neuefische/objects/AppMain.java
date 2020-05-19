package de.neuefische.objects;

import de.neuefische.objects.db.StudentDB;
import de.neuefische.objects.model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student[] studentArr = new Student[3];
        studentArr[0] = new Student("Blue", true, 839);
        studentArr[1] = new Student("Red", false, 1);
        studentArr[2] = new Student("Orange", true, 40);

        StudentDB homieDB = new StudentDB(studentArr[2]);
        System.out.println(homieDB);
    }


}
