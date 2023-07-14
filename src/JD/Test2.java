package JD;

import java.util.Scanner;

/**
 * creat by zhaochen on 2018/9/9 20:07
 */

public class Test2
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while(T-- > 0)
        {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int arr[][] = new int[n][n];
            while(m-- > 0)
            {
                int i = cin.nextInt() - 1;
                int j = cin.nextInt() - 1;
                arr[i][j] = 1;
                arr[j][i] = 1;
            }
            int result[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    if(arr[i][j] == 1)
                        result[i]++;
                }
            }
            boolean flag = true;
            for(int i = 0; i < n; i++)
            {
                for(int j = i; j < n; j++)
                {
                    if(arr[i][j] == 0)
                    {
                        if(result[i] != result[j])
                        {
                            flag = false;
                            break;
                        }
                    }
                }

                if(!flag) break;
            }
            if(!flag)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
