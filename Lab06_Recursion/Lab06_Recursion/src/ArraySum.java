import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        //Testing sum Method

        //Test case 1:
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Sum of array is: " + sum(array1));

        //Test case 2:
        int[] array2 = {0};
        System.out.println("Sum of array is: " + sum(array1));

    }
    public static int sum(int[] values) {
        if (values.length == 1) {
            return values[0];
        } else {
            int[] partialArray = Arrays.copyOfRange(values, 0, values.length - 1);
            return sum(partialArray) + values[values.length - 1];
        }
    }
}
