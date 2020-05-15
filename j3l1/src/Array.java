import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    static String[] arr = new String[]{"0", "1", "2", "3", "4"};
    static String[] arr2 = new String[arr.length];

    public static void SwapArrayNums() {
        int n1 = 0;
        int n2 = 4;
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[n2] = arr[n1];
        arr2[n1] = arr[n2];
        System.arraycopy(arr2, 0, arr, 0, arr2.length);
        System.out.println("Swapping element[" + n1 + "] to [" + n2 + "].\n" + Arrays.toString(arr));
    }

    public static void ArrayToArrayList() {
        ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList(arr2));
        arrlist.add("5");
        arrlist.add("6");
        for (String elements: arrlist){ //просто для проверки
            System.out.printf(elements + ", ");
        }
    }
}

