package Homework.ArrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int nums[] = new int[]{15, 6, 8, 9, 77, 26, 4, 120, -6, 13};
        System.out.println("Մասիվի բոլոր թվերն են");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Զույգ թվերն են");
        int count = 0;
        for (int j = 0; j < nums.length; j++)
            if (nums[j] % 2 == 0) {
                count++;
                System.out.print(nums[j] + " ");
            }
        System.out.println();
        System.out.println("Զույգ թվերի քանակն է( " + count + ")");
        System.out.println("Կենտ թվերն են");

        int count1 = 0;
        for (int k = 0; k < nums.length; k++)
            if (nums[k] % 2 == 1) {
                count1++;
                System.out.print(nums[k] + " ");
            }
        System.out.println();
        System.out.println("Կենտ թվերի քանակն է (" + count1 + ")");

        int sum = 0;
        for (int m = 0; m < nums.length; m++)
            sum += nums[m];
        System.out.println("Մասիվի թվերի գումարը =" + sum);

        double result = 0;
        for (int r = 0; r < nums.length; r++)
            result = result + nums[r];
        System.out.println("Միջին արժեքը =" + result / nums.length);

        int minimal = nums[0];
        int minIndex = 0;
        for (int z = 1; z < nums.length; z++) {
            if (nums[z] < minimal)
                 {
                minimal= nums[z];
                minIndex = z;

            }

        }
        System.out.println("Ամենափոքր թիվը =" + minimal);
        for (int z = 0; z <nums.length ; z++) {
            if ( nums[z]>minimal){
                minimal=nums[z];
                minIndex=z;
            }

        }
        System.out.println("Ամենամեծ թիվը ="+minimal);
    }
}
