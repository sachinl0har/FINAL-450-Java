import java.util.*;
public class findDuplicate11 {
    static void findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print("\n" + j + " ");
        }
        }

    static void printArray(int arr[], int n){
        for(int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 2, 4, 5, 4, 6, 1, 5};
        int n = arr.length;
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the Size of array : ");
        // n = input.nextInt();
        // for(int i = 0; i < n; i++){
        //     arr[i] = input.nextInt();
        // }
        System.out.println("Array");
        printArray(arr, n);
        findDuplicate(arr);
        input.close();
    }
}
