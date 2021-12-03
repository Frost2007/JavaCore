package homework.dynamicArray;

public class DynamicArray {
    // Սա մեր հիմնական մասիվն է որտեղ պահելւ ենք մեր ավելացվող էլեմենտները:
    private int[] array1 = new int[10];
    //Սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է:
    private int size = 0;


//Ստուգել, եթե մասիվի մեջ տեղ չկա -> ,կանչել extend()  և ավելացնել

    public void add(int value) {
        if (array1.length == size) {
            extend();
        }
        array1[size++] = value;
    }

    //masivi mej avelacnum enq value ishelov indexi tex@
    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
        } else {
            if (array1.length == size) {
                extend();
            }
            for (int i = size; i >= index; i--) {
                array1[i + 1] = array1[i];
            }
            array1[index] = value;
            size++;
        }

    }

    //karox enq avelacnel mer masivin mek ayl masiv;
    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }

    }

    public boolean isExist(int value) {
        for (int i = 0; i < size; i++) {
            if (i == value) ;
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
       return size==0;
    }


    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
        } else {
            array1[index] = value;
        }
    }

    //1.Ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ:
    //2. Պետք է քցել հին մասիվի էլեմենտները նորի մեջ:
    //3. հին  մասիվի հղումը կապենք նոր մասիվի հղման հետ:
    private void extend() {
        int[] array2 = new int[array1.length + 10];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        array1 = array2;
    }


    //Եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է
    // վերադարձնել մասիվի index-երրորդ էլեմենտները,հակառակ դեպքում վերադարձնել -1:

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
            return -1;
        }
        return array1[index];
    }

    public void delete(int index) {
        if (index < 0 || index > size)
            System.err.println("invalid index");
        for (int i = index + 1; i < size; i++) {

            array1[i - 1] = array1[i];
        }

        size--;


    }


    //Տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i] + " ");

        }

    }

}
