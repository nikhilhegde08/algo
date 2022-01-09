/**
 * Author: Nikhil Hegde
 * Algorithm: Recursive Merge Sort
 */

package mod;

public class MergeSort {

    
    // print array utility
    public static void print_array(int[] A){

        for(int a: A){
            System.out.print(a + " ");
        }
        System.out.println();
        
    }

    // recursive merge sort
    public static void sort(int[] A, int left, int right){
    
        if (left < right){
        
            int mid  = (left + right) / 2;

            // divide the first half
            sort(A, left, mid);
            
            // divide the second half
            sort(A, mid+1,right);
            
            // merge the two halves in sorted order
            merge(A, left, mid, right);

        }
    }

    // merge array in sorted format
    private static void merge(int[] A, int left, int mid, int right){
        
        // compute the size of 2 halves
        int sizeB = mid-left+1;
        int sizeC = right-mid;
        
        // two temporary arrays to copy 2 halves
        int[] B = new int[sizeB];
        int[] C = new int[sizeC];

        // copy first half
        for (int i=0; i< sizeB; i++){
            B[i] = A[left+i]; // first half from left to sizeB
        }

        // copy second half
        for (int j=0; j< sizeC; j++){
            C[j] = A[mid+1+j]; // second half from mid+1 to sizeC
        }


        int i=0, j=0, k=left;

        // merging the array
        while(i < sizeB && j < sizeC){

            // first array and second array comparison
            if(B[i] >= C[j]){
                A[k++] = C[j++];
            }
            else{
                A[k++] = B[i++];
            }
        }

        // merging the leftover elements from first half
        while(i < sizeB){
            A[k] = B[i];
            i++;
            k++;
        }

        // merging the leftover elements from second half
        while(j < sizeC){
            A[k] = C[j];
            k++;
            j++;
        }

    }    
    
}
