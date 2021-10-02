package Lesson3;

public class ClassLong {
    public static void main(String[] args) {
        long distance;// distance
        long seconds;// seconds
         int days;
        int light;// light speed
        light=300000;// km/s
        days=1500;
        seconds=days*24*60*60;
        distance=light*seconds;
        System.out.println("in "+days+" days,light is cover "+distance+" kilometers");


    }
}
