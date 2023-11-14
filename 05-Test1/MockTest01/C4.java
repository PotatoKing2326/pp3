public class C4 {
    
    static int even(int[] array) {
        int counter = 0;
        for (int value : array) {
            if (value%2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    
    static int positiveOdd(int[] array) {
        int counter = 0;
        for (int value : array) {
            if (value > 0 && value%2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,-6,5,8};
        int[] arr2 = {3,2,-5,4,1,-7};
        System.out.println(C4.even(arr1));
        System.out.println(C4.positiveOdd(arr2));

    }
}
