package Homework.DynamicArray;

public class DynamicTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        for (int i = 0; i < 10; i++) {
            da.add(i + 1);

        }
         int[] numbers={11,22,33,44,55};
        //  System.out.println();
        //System.out.println(da.getByIndex(110));
//        da.print();
//        da.delete(4);
//        System.out.println();
//        da.print();
//        da.delete(1);
//        System.out.println();
//        da.print();
//        da.add(11);
//        System.out.println();
//
//        da.add(13, 6);
//        da.print();
        da.add(numbers);
        da.print();
        System.out.println();
        System.out.println(da.isEmpty());;
        System.out.println(da.isExist(22));
    }

}










