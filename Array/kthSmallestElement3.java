// FIND Kth SMALLEST ELEMENT

import java.util.*;

public class kthSmallestElement3 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter the " + i + " Element : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter K : ");
        k = input.nextInt();
        Arrays.sort(arr);
        System.out.print("Sorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.printf("\n%dth Smallest Element in an Array is : %d\n", k, arr[k - 1]);
        input.close();
    }
}
