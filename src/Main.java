import java.util.Scanner;

/**
 * creat by zhaochen on 2018/8/30 20:00
 */
public class Main {
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] vis = new int[1000010];
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int cnt = 0,num = 0;
        double m = Math.sqrt(n + 0.5);
        int a, b, c;
        for (int i = 1; i <= m; i++) {
            for (int j = i + 1; j <= m; j += 2) {
                if (gcd(j, i) == 1) {
                    a = j * j - i * i;
                    b = 2 * i * j;
                    c = i * i + j * j;
                    if (c <= n) {
                        num++;
                        vis[a] = 1;
                        vis[b] = 1;
                        vis[c] = 1;
                    }
                    for (int k = 2; c * k <= n; k++)
                        vis [k * a] = vis[k * b] = vis[k * c] = 1;
                }
            }
        }

        System.out.println(num);

    }
}

