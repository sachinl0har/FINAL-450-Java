// REVERSE AN ARRAY

import java.util.*;

public class ReverseArray1 {
    static void reverseArray(int arr[], int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size){
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter The " + i + " Element : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Original Array : \n");
        printArray(arr, n);
        System.out.print("\nReversed Array : \n");
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
        input.close();
    }
}