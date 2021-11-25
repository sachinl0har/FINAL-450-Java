import java.util.*;
public class largestSubArray8 {
    static long maxSumSubArray(int arr[], int n){
        int maxSum = 0, curSum = 0;
        for(int i = 0; i < n; i++){
            curSum = curSum + arr[i];
            if(curSum < 0){
                curSum = 0;
            }
            if(curSum > maxSum){
                maxSum = curSum;
            }
        }
        return maxSum;
    }

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
            System.out.println("Enter the " + i + " Element : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr, n);
        long maxSum = maxSumSubArray(arr, n);
        System.out.println("\nOutput : " + maxSum);
        input.close();
    }
}
