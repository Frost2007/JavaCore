package Lesson12.Recursion;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    //вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}
