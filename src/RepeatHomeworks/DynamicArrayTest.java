package RepeatHomeworks;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        for (int i = 0; i <15 ; i++) {
            da.add(i+1);

        }
        da.print();
    }
}
