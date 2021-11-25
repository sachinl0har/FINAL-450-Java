// PENDING

import java.util.*;
public class getMinDiff9 {
    static void printArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[100];
        int n;
        System.out.println("Enter the Size of Array : ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter the " + i + " Element : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr, n);
    }
}
