package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class StudentStorage {

    private List<Student> students = new LinkedList<>();


    public void add(Student student) {
   students.add(student);
        FileUtil.serializeStudent(students);

    }


    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printByLesson(Lesson lesson) {
        for (Student student : students) {
            for (Lesson studentLesson : student.getLessons()) {
                if (studentLesson.equals(lesson)){
                    System.out.println(student);
                }
            }
        }
    }

    public void deleteByEmail(String email) {
        students.removeIf(student -> student.getEmail().equals(email));
        System.out.println("The student has been deleted");
        FileUtil.serializeStudent(students);
    }
    public void initData(){
        this.students=FileUtil.deserializeStudent();
    }


}