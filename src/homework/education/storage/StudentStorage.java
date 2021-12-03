package homework.education.storage;

import homework.education.model.Student;
import homework.education.util.ArrayUtil;

import java.util.Arrays;

public class StudentStorage {

    private Student[] students = new Student[10];
    private int size;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, size);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
    }

    public Student printByLesson(String lesson) {
        if (lesson != null) {
            for (int i = 0; i < size; i++) {
                if (Arrays.toString(students[i].getLesson()).contains(lesson)) {
                    System.out.println(students[i]);
                }
            }
        }
        return null;
    }

    public void deleteByEmail(String email) {
        if (email != null)
            for (int i = 0; i < size; i++) {
                if (students[i].getEmail().equals(email))
                    ArrayUtil.deleteByIndex(students, i, size);

            }
        System.out.println("The student has been deleted");
    }


}