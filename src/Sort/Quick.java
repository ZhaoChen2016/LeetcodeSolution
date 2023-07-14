package Sort;

public class Quick {
/**
 *@program: Solution
 *@description: 快排
 *@author: liu yan
 *@create: 2022-03-29 14:13
 */
public static void sort(int[] a) {
    sort(a,0,a.length-1);
}

public static void sort(int[] arr,int lo,int li){
    if(lo>=li){
        return;}
    int mid = partition(arr,lo,li);
    sort(arr,lo,mid-1);
    sort(arr,mid+1,li);
}

public static int partition(int[] arr,int lo,int li){
    int a = arr[lo];
    int i = lo;
    int j = li+1;
    while (true){
        while (arr[++i] <=a){ if (i==li) {break;}}
        while (arr[--j] >=a){if (j==lo) {break;}}
        if(i>=j){
            break;
        }
        swap(arr,i,j);
    }
    swap(arr,j,lo);
    return j;
}

public static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static void main(String[] args) {
    int[] a = {1,3,6,2,7,0};
    sort(a);
    for(int i:a){
        System.out.println(i);
    }
}

}
