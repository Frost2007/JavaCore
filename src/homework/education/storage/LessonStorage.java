package homework.education.storage;

import homework.education.LessonStudentTest;
import homework.education.model.Lesson;
import homework.education.util.ArrayUtil;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[10];
    private int size;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, size);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            if(lessons[i] != null)
            System.out.println(lessons[i]);
            else{
                System.out.println("THERE IS NO LESSON");
            }

        }
    }


    public Lesson getByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().equals(lessonName))
                return lessons[i];


        }
        return null;
    }

    public void deleteLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().equals(lesson)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
                size--;

            }
        }


    }
}