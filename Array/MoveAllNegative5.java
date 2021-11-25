import java.util.*;
public class MoveAllNegative5 {

    static void rearrange(int arr[], int n){
        int j = 0, temp;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
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
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        rearrange(arr, n);
        System.out.println("\nSorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
