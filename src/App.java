
import mod.MergeSort;
import mod.QuickSort;
/**
 * Driver code for Sorting
 * Author: Nikhil Hegde
 */

public class App {

     // print array utility
     private static void print_array(int[] A){

        for(int a: A){
            System.out.print(a + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {

        // Test Array
        int[] A = {0,9,8,7,6,5,4,3,2,1};
        
        // Merge Sort driver
        System.out.println("    Merge Sort");
        System.out.println("-INFO: Before Sorting");
        print_array(A);
        MergeSort.sort(A, 0, A.length-1);
        System.out.println("-INFO: After Sorting");
        print_array(A);

        // Test Array
        int[] B = {0,9,8,7,6,5,4,3,2,1};
        
        // Merge Sort driver
        System.out.println("    Quick Sort");
        System.out.println("-INFO: Before Sorting");
        print_array(B);
        QuickSort.sort(B, 0, B.length);
        System.out.println("-INFO: After Sorting");
        print_array(B);

        
    }
}
