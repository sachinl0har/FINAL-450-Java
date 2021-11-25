import java.util.*;
public class merge12 {
    // BRUTEFORCE APPROACH
    static void merge(int arr[], int arr1[]){
        int n = arr.length;
        int m = arr1.length;
        int l = n + m;
        int ans[] = new int[l];
        Set<Integer> result = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            ans[i] = arr[i];
        }
        for(int i = 0; i < m; i++){
            ans[n + i] = arr1[i];
        }
        Arrays.sort(ans);
        for(int i = 0; i < l; i++){
            result.add(ans[i]);
        }
        for(int ele : result){
            System.out.print(ele + " ");
        }
    }
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr1[] = {2, 5, 8, 9, 10, 12};
        System.out.println("First Array : ");
        printArray(arr);
        System.out.println("\nSecond Array : ");
        printArray(arr1);
        System.out.println("\nMerged Array : ");
        merge(arr, arr1);
    }
}
