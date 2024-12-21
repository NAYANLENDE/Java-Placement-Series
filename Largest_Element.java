import java.util.*;
public class Largest_Element {
    //Brute Force Approach- T.C.=O(N*log(N)) and S.C.=O(n)
    public static void main(String [] args){
        int arr1[] = {1,4,2,5,3};
        System.out.println("The largest Element in the array is " + sort(arr1));

        int arr2[] = {8,9,20,3,5};
        System.out.println("The largest Element in the array is " + sort(arr2));
    }

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    } 


    //Recursive Approach T.C.=O(N) and S.C.=O(1)
    public static void main(String [] args){
        int arr1[] = {1,4,2,5,3};
        System.out.println("The largest element in the array is " + findLargestElement(arr1));

        int arr2[] = {3,5,6,10,9};
        System.out.println("The largest element in the array is " + findLargestElement(arr2));
}
     static int findLargestElement(int arr[]){
     int max = arr[0];
     for (int i=0; i<arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
     }
     return max;
    }
}


