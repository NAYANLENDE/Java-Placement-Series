package Arrays;

import java.util.*;
class Second_LargestandSecond_Smallest {

    //Brute Force Approach T.C.=O(NlogN)For sorting array S.C.=O(1)

    // static private void getElements(int arr[], int n){
    //     if (n<2){
    //         System.out.println(-1);
    //         System.out.println(" ");
    //         System.out.println(-1);
    //         System.out.println(" ");
    //         return;
    //     }
    //     Arrays.sort(arr);
    //     int second_largest = arr[n-2];
    //     int second_smallest = arr[1];
    //     System.out.println("Second largest: " + second_largest);
    //     System.out.println("Second smallest: "+ second_smallest);
    // }
    // public static void main(String [] args){
    //     int arr[] = {1, 2, 3, 4, 5};
    //     int n = arr.length;
    //     getElements(arr, n); 
    // }


    //Better Approach T.C.=O(N),We do linear traversals in our array S.C.=O(1)

    // static private void getElements(int[] arr, int n){
    //     if(n==0 || n==1){
    //         System.out.println(-1);
    //         System.out.println(" ");
    //         System.out.println(-1);
    //         System.out.println("\n");
    //     }
    //     int small = Integer.MAX_VALUE;
    //     int second_small = Integer.MAX_VALUE;
    //     int large = Integer.MIN_VALUE;
    //     int second_large = Integer.MIN_VALUE;
    //     int i;
    //     for(i=0; i<n; i++){
    //         small = Math.min(small,arr[i]);
    //         large = Math.max(large,arr[i]);
    //     }
    //     for(i=0; i<n; i++){
    //         if(arr[i] < second_small && arr[i] != small){
    //             second_small = arr[i];
    //         }
    //         if (arr[i] > second_large && arr[i] != large){
    //             second_large = arr[i];
    //         }
    //     }
    //     System.out.println("Second smallest: " + second_small);
    //     System.out.println("Second largest: " + second_large);
    // }
    // public static void main(String [] args){
    //     int arr[] = {1, 2, 3, 4, 5};
    //     int n = arr.length;
    //     getElements(arr, n);
    // }


    //Optimal approach T.C.=O(N),Single pass solution S.C.=O(1)

    static private int secondSmallest(int[] arr, int n){
        if(n < 2){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            } else if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }
        return second_small;
    }
    static private int secondLargest(int[] arr,int n){
        if (n < 2){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }else if(arr[i] > second_large && arr[i] != large){
                second_large = arr[i];
            }
        }
        return second_large;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Second smallest: " + secondSmallest(arr, n));
        System.out.println("Second largest: " + secondLargest(arr, n));
    }
}