import SchoolManagementSystem.School;
import SchoolManagementSystem.Student;
import SchoolManagementSystem.Teacher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @DisplayName("Checking teacher is added")
    @Test
    void getTeachers() {
        School school = new School(new ArrayList<Teacher>(), new ArrayList<Student>());
        school.addTeacher(new Teacher(1, "Bob", 50000));
        assertEquals(1, school.getTeachers().size());
    }

    @DisplayName("See if money was added")
    @Test
    void getTotalMoneyEarned() {
        School school = new School(new ArrayList<Teacher>(), new ArrayList<Student>());
        School.updateTotalMoneyEarned(5000);
        assertEquals(5000, school.getTotalMoneyEarned());
    }
}