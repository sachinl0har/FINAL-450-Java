// FIND THE MINIMUN AND MAXIMUM VALUES IN AN ARRAY

import java.util.*;
public class MinMaxArray2 {
// CLASS PAIR IS USED TO RETURN TWO VALUES FROM getMinMax();
    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
// IF THERE IS ONLY ONE ELEMENT THEN RETURN IT AS MIN AND MAX
        if(n == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
// IF THERE ARE MORE THAN ONE ELEMENTS THEN INITIAL MIN AND MAX
        if(arr[0] > arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }else{
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for(int i = 2; i < n; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
    public static void main(String args[]){
        int arr[] = new int[100];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter the " + i + " Element : ");
            arr[i] = input.nextInt();
        }
        Pair minmax = getMinMax(arr, n);
        System.out.printf("Minimun Element in an Array is : %d\n", minmax.min);
        System.out.printf("Maximun Element in an Array is : %d\n", minmax.max);
        input.close();
    }
}
