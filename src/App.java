
import mod.MergeSort;
/**
 * Driver code for Sorting
 * Author: Nikhil Hegde
 */

public class App {
 
    public static void main(String[] args) {

        // Test Array
        int[] A = {0,9,8,7,6,5,4,3,2,1};
        
        System.out.println("-INFO: Before Sorting");
        MergeSort.print_array(A);
        MergeSort.sort(A, 0, A.length-1);
        System.out.println("-INFO: After Sorting");
        MergeSort.print_array(A);

    }
}
