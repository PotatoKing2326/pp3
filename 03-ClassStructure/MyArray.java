import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
    
    static int even(int[] array) {
        int counter = 0;
        for(int x = 0; x < array.length; x++) {
            if(array[x]%2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    static int positiveOdd(int[] array) {
        int counter = 0;
        for(int x = 0; x < array.length; x++) {
            if(array[x]%2 != 0 && array[x]>0) {
                counter++;
            }
        }
        return counter;
    }

    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        for(int x = 0; x < array.length - 1; x++) {
            newArray[x] = array[array.length - 1 - x];
        }
        return newArray;
    }

    static boolean compare(int[] array, int[] array2) {
        if(array == array2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean exist(int number, int[] array) {
        boolean isNumberInArray = false;
        for (int value : array) {
            if (value == number) {
                isNumberInArray = true;

                return isNumberInArray;
            }
        }

        return isNumberInArray;
    }

    static int secondMax(int[] array) {
        int largestNumber = array[0];
        int secondLargest = array[0];
        for (int value : array) {
            if (value > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = value;
            }else if (value > secondLargest && value < largestNumber) {
                secondLargest = value;
            }
        }
        return secondLargest;
    }

    static int lastColumn(int[][] array) {
        int sumOfLastColumn = 0;
        for (int[] rows : array) {
            sumOfLastColumn += rows[rows.length - 1];
        }

        return sumOfLastColumn;
    }


    public static void main(String[] args) {
        int[] testArray = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        int[] testArray2 = {1 ,2 ,3 ,4, -6};
        int[][] testArray3 = {{1, 2, 3},{1, 2, 3}};

        System.out.println(even(testArray));
        System.out.println(positiveOdd(testArray));
        System.out.println(Arrays.toString(reverse(testArray)));
        System.out.println(compare(testArray, testArray2));
        //System.out.println(different(testArray, testArray2));
        System.out.println(exist(0, testArray));
        System.out.println(secondMax(testArray2));
        System.out.println(lastColumn(testArray3));
    }
}
