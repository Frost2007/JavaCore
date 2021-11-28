package Homework.education;

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
            System.out.println(lessons[i]);
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
        if (lesson != null) {
            for (int i = 0; i < size; i++) {
                if (lessons[i].getLessonName().equals(lesson)) {
                    deleteByIndex(i);
                }

            }
            System.out.println("the lesson has been deleted");
        } else
            System.out.println("this type of lesson dos not exist");

    }

    private void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            lessons[i - 1] = lessons[i];

        }
        size--;
    }
}
