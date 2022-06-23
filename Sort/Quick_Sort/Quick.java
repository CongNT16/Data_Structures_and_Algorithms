
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
public class Quick {

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
        
        Quick list = new Quick();
        // show unsorted array
        System.out.print("Unsorted array: ");
        list.displayArray(arr);

        list.sort(arr, 0, n - 1);
        
        // show sorted array
        System.out.print("Sorted array: ");
        list.displayArray(arr);

    }
    
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            // if element at index j smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] và arr[high] (hoặc pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
    public void sort(int arr[], int low, int high) {
        if (low < high) {

            // pi is index of pivot, arr[pi] is pivot
            int pi = partition(arr, low, high);

            //recursion
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    
    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    
    
}
