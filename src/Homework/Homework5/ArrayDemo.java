package Homework.Homework5;

public class ArrayDemo {

    public static void main(String[] args) {
        Array array = new Array();
        int[] numbers = {2, 5, 34, 9, 66, 8, 7, 3, 1, 177};
        int[] numbers2 = {8, 5, 45, 89, 21, 47, 14, 23, 59, 75};

        System.out.println("Մասիվի բոլոր թվերն են");
        array.array(numbers);
        System.out.println("Զույգ թվերն են");
        array.evens(numbers);
        System.out.println("Զույգ թվերի քանակն է -  " + array.countOfEvens(numbers));

        System.out.println("Կենտ թվերն են");
        array.odds(numbers);
        System.out.println("Կենտ թվերի քանակն է -  " + array.countOfOdds(numbers));
        System.out.println("Մասիվի թվերի գումարը =" + array.sum(numbers));
        System.out.println("Միջին արժեքը =" + array.avg(numbers));
        System.out.println("Ամենափոքր թիվը =" + array.min(numbers));
        System.out.println("Ամենմեծ թիվը = " + array.max(numbers));
        System.out.println(array.max(numbers2));



    }

}
