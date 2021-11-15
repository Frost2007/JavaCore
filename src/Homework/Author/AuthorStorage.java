package Homework.Author;

public class AuthorStorage {
    private Author[] array1 = new Author[10];
    int size = 0;

    public void add(Author author) {
        if (size == array1.length)
            extend();
        array1[size++] = author;
    }

    private void extend() {
        Author[] array2 = new Author[array1.length + 10];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        array1 = array2;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
            return null;
        }
        return array1[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array1[i] + " ");

        }
    }

}
