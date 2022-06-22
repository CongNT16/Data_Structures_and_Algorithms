
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
public class Insertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array:   ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:   ");
        // enter element of array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        
        // show unsorted array
        System.out.print("Unsorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
         if (i < arr.length - 1) {
                System.out.print(", ");
            }
            
        }   
        System.out.println("]");

         //sort with insertion variable
        for (int i = 1; i < arr.length; i++) {

            int ins = arr[i];
            int j = i - 1;

            while (j >= 0 &&  arr[j] > ins) {
                arr[j + 1] = arr[j];
                j  = j - 1;
            }
            arr[j + 1] = ins;
        }
            
            

        
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
