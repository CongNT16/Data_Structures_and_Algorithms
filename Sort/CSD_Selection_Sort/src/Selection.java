
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array:   ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:   ");
        // enter element ò array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
//        5
//        9 4 7 3 2
//        2 9 4 7 3
//        2 3 9 4 7
//        2 3 4 9 7 
//        2 3 4 7 9
        
        
        // show unsorted array
        System.out.print("Unsorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
         if (i < arr.length - 1) {
                System.out.print(", ");
            }
            
        }   
        System.out.println("]");

        //sort with selection sort
        for (int i = 0; i < arr.length; i++) {

            // Find smallest element in unsorted array
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the smallest and first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
            
            
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[i]) {
//                    int swap;
//                    swap = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = swap;
//                }
//                
////                for (int j1 = 0; j1 < n; j1++) {
////                    System.out.print(arr[j1] + ",");
////                }
////                System.out.println("");
//            }
        
        // show sorted array
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }   System.out.println("]");

    }
    
}
