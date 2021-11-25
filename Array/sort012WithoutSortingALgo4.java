public class sort012WithoutSortingALgo4 {

    public static void sort012(int arr[], int n){
        int c0 = 0, c1 = 0, c2 = 0, i = 0;
        for(i = 0; i < n; i++){
            if(arr[i] == 0){
                c0++;
            }else if(arr[i] == 1){
                c1++;
            }else{
                c2++;
            }
        }
        for(i = 0; i < c0; i++){
            arr[i] = 0;
        }
        for(i = 0; i < c0 + c1; i++){
            arr[i] = 1;
        }
        i = 0;
        while(c0 > 0){
            arr[i++] = 0;
            c0--;
        }
        while(c1 > 0){
            arr[i++] = 1;
            c1--;
        }
        while(c2 > 0){
            arr[i++] = 2;
            c2--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = 12;
        System.out.print("Original Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sort012(arr, n);
        System.out.print("\nSorted Array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
