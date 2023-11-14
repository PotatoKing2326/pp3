import java.util.Arrays;

public class MyArrays {

    static int odd(int[] array) {
        int counter = 0;
        for (int value : array) {
            if (value%2 != 0 && value > 0) {
                counter ++;
            }
        }
        return counter;
    }

    static int above(int[] array) {
        int sum = 0;
        double arithmeticMean = Arrays.stream(array).sum()/array.length;
        for (int value : array) {
            if (value > arithmeticMean) {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, -5, 4, 1, -7};
        int[] arr2 = {5, 2, 7, 4, 2};

        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));
    }
}
