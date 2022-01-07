package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class LessonStorage {

    private List<Lesson> lessons = new ArrayList<>();

    public void add(Lesson lesson) {
        lessons.add(lesson);
        FileUtil.serializeLesson(lessons);
    }


    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }


    public Lesson getByLessonName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getLessonName().equals(lessonName)) {
                return lesson;
            }else {
                System.err.println("This lesson does not exist");
            }
        }return null;
    }

    public void deleteLesson(String lessonName) {
        lessons.removeIf(lesson -> lesson.getLessonName().equals(lessonName));
        FileUtil.serializeLesson(lessons);
    }
     public void initData(){
         this.lessons = FileUtil.deserializeLesson();

     }
}