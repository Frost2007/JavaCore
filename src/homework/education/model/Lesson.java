package homework.education.model;

import java.io.Serializable;

public class Lesson implements Serializable {
    private String lessonName;
    private double duration;
    private String lecturerName;
    private int price;

    public Lesson(String lessonName, double duration, String lecturerName, int price) {
        this.lessonName = lessonName;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }
    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lesson lesson = (Lesson) o;

        if (Double.compare(lesson.duration, duration) != 0) return false;
        if (price != lesson.price) return false;
        if (lessonName != null ? !lessonName.equals(lesson.lessonName) : lesson.lessonName != null) return false;
        return lecturerName != null ? lecturerName.equals(lesson.lecturerName) : lesson.lecturerName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = lessonName != null ? lessonName.hashCode() : 0;
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (lecturerName != null ? lecturerName.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", duration=" + duration +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}
