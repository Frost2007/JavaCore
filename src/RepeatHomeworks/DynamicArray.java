package RepeatHomeworks;

public class DynamicArray {
    private int[] array1 = new int[10];
    int size = 0;

    //Ստուգել, եթե մասիվի մեջ տեղ չկա -> ,կանչել extend()  և ավելացնել
    void add(int value) {
        if (array1.length == size) {
            extend();
        }
        array1[size++] = value;
    }

    private void extend() {
        int[] array2 = new int[array1.length + 10];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];

        }
        array1 = array2;
    }
    public void print(){
        for (int i = 0; i <size ; i++) {
            System.out.print(array1[i]+",");

        }
    }
}
