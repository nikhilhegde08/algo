/**
 * Author: Nikhil Hegde
 * Algorithm: Recursive Quick Sort
 */

package mod;

public class QuickSort {


    // swap utility
    private static void swap(int[] A, int l, int r){

        int temp = A[l];

        A[l] = A[r];
        A[r] = temp;

    }

    // recursive quick sort
    public static void sort(int[] A, int left, int right){

        if (left < right){

            // identify the pivot : sorted position
            int p = partition(A, left, right);

            // first half
            sort(A, left, p-1);

            // second half
            sort(A, p+1, right);

        }

    }

    // partition function to identify sorted position
    private static int partition(int[] A, int left, int right){

        // pointers for low and high
        int l = left+1;
        int r = right;

        // first element to be pivot
        int p = A[l];

        // move pointer until low and high crosses
        while (l < r){

            // move low until item higher than pivot is found
            for (int e: A){
                
                if (e > p)
                {
                    l++;
                }
                else{
                    break;
                }
                
            }

            // move high pointer until item lower than pivot is found
            for (int e: A){
                
                
                if(e < p){
                    r--;
                }
                else{
                    break;
                }
            }

            // if pointer do not cross then swap item at low and high
            if (l < r){
                swap(A, l, r);
            }

        }

        // swap item at pivot and low to insert at sorted position
        swap(A, p, l);

        // return pivot index
        return p;

    }
    
}
