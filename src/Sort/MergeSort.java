package Sort;

public class MergeSort {
/**
 *@create: 2023-05-05 14:46
 */
    private static int[] aux;
    private static void merge(int[] a, int lo, int mid, int hi){
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++){
            if (i > mid)  {a[k] = aux[j++];}
            else if (j > hi) {a[k] = aux[i++];}
            else if (aux[i] > aux[j]) {a[k] = aux[j++];}
            else {a[k] = aux[i++];}
        }
    }
    private static void sort(int[] a, int lo, int hi){
        if (lo >= hi) {return;}
        int mid = lo + (hi - lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    public static void main(String[] args) {
        int[] a = {0,1,7,3,100,5,6,3};
        aux = new int[a.length];
        sort(a,0,a.length-1);
        for (int i : a){
            System.out.println(i);
        }
    }
}
