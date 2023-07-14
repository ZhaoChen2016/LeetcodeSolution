package JD;

import java.util.Scanner;

/**
 * creat by zhaochen on 2018/9/9 19:59
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n =  cin.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = cin.nextInt();
            }
        }

        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1] && arr[j][2] > arr[i][2]) {
                    num++;
                    break;
                }
            }
        }
        System.out.println(num);



    }

}

