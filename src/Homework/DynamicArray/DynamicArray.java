package Homework.DynamicArray;

import java.util.Arrays;
import java.util.Stack;

public class DynamicArray {
    // Սա մեր հիմնական մասիվն է որտեղ պահելւ ենք մեր ավելացվող էլեմենտները:
    private int[] array1 = new int[10];
    //Սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է:
    private int size = 0;


//Ստուգել, եթե մասիվի մեջ տեղ չկա -> ,կանչել extend()  և ավելացնել

    public void add(int value) {
        if (size == array1.length) {
            extend();
            array1[size++] = value;
        } else {
            array1[size++] = value;
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
        if (index < 0 || index == array1.length) {
            return -1;
        }
        return array1[index];
    }

    //Տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i]);

        }

    }

}
