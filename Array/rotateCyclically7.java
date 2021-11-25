import java.util.*;
public class rotateCyclically7 {

    static void rotate(int arr[], int n){
        int temp = arr[n - 1];
        for(int i = n - 1; i >= 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    static void printArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[100];
        int n;
        System.out.println("Enter the size of array : ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter the " + i + " element : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr, n);
        rotate(arr, n);
        System.out.println("Output : ");
        printArray(arr, n);
        input.close();
    }
}
