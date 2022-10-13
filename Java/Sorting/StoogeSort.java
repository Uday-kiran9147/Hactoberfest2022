package Algorithms;

import java.util.Arrays;

public class StoogeSort {

    public static void main(String[] args) {
        int arr[]={10,3,7,4,6,8,2,9,1};
        System.out.println(arr.length);
        int len=arr.length;
        // FUNCTION IS CALLED FOR SORTING
        //INITIALLY WE ARE PASSING ARRAY, STARTING INDEX AND LAST-INDEX
        //TO MAKE FIRST AND LAST ELEMENTS SWAP IF NOT IN ORDER.
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr));
        sort(arr,0,len-1);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int si, int li){
        //THIS FUNCTION SWAPS THE TWO ELEMENTS
        if(arr[si]>=arr[li]){
            int temp=arr[si];
            arr[si]=arr[li];
            arr[li]=temp;
        }
        
    }

    static void sort(int []arr,int si,int li){
        int calls = 0;
        calls=calls+1;
        //WE HAVE TO
        //01. SORT FIRST 2/3RD PART.
        //02. THEN LAST 2/3RD PART.
        //03. AGAIN FIRST 2/3RD PART.
        if(si>=li)
            return;

        swap(arr,si,li);
        if(li-si+1>2){
            //DIVIDING THE ARRAY INTO 2/3RD PART
            int newlength=(li-si+1)/3;

            //SORTING FOR THE 1ST 2/3 RD PART.
            sort(arr,si,li-newlength);

            //SORTING FOR THE LAST 2/3RD PART.
            sort(arr,si+newlength,li);

            //AGAIN SORTING FOR THE FIRST 2/3RD PART


            sort(arr,si,li-newlength);

        }
    }
}
