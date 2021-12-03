package classwork1;

public class StudentTest {
    public static void main(String[] args) {
        Student poxos = new Student("Poxos", "Poxosyan", 23, "java", "098651102");
        System.out.println(poxos.getName());
        poxos.setName("Poxosik");
        System.out.println(poxos.getName());
        System.out.println(poxos.getPhoneNumber());
    }
}
