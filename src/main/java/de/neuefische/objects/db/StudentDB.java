package de.neuefische.objects.db;

import de.neuefische.objects.model.Student;

import java.util.Objects;

public class StudentDB {

    // datentyp "Student" definiert durch homies
    private Student homies;

    public StudentDB(Student homies) {
        this.homies = homies;
    }

    public Student getHomies() {
        return homies;
    }

    public void setHomies(Student homies) {
        this.homies = homies;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "homies=" + homies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(homies, studentDB.homies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homies);
    }
}
