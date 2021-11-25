import java.util.*;
public class UnionIntersection6 {

    static void union(int arr[], int n, int brr[], int m){
        Set<Integer> unionSet = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            unionSet.add(arr[i]);
        }
        for(int i = 0; i < m; i++){
            unionSet.add(brr[i]);
        }
        for(int ele : unionSet){
            System.out.print(ele + " ");
        }
        System.out.print("\n");
    }
    static void intersection(int arr[], int n, int brr[], int m){
        int i = 0, j = 0;
        Set<Integer> intersectionSet = new HashSet<Integer>();
        while(i < n && j < m){
            if(arr[i] < brr[j]){
                i++;
            }else if(arr[i] > brr[j]){
                j++;
            }else{
                intersectionSet.add(arr[i]);
                i++;
                j++;
            }
        }
        for(int ele : intersectionSet){
            System.out.print(ele + " ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arr[] = new int [100];
        int brr[] = new int[100];
        int n, m;
        System.out.println("Enter the Size of Array A : ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the " + i + " Element of Array A : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the Size of Array B : ");
        m = input.nextInt();
        for(int i = 0; i < m; i++){
            System.out.println("Enter the " + i + " Element of Array B : ");
            brr[i] = input.nextInt();
        }
        union(arr, n, brr, m);
        intersection(arr, n, brr, m);
        input.close();
    }
}
