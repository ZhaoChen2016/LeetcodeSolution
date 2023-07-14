import java.util.*;

/**
 * creat by zhaochen on 2018/8/4 14:37
 */
public class Test {
    public static void main(String[] args) {
//输入第一行，读取n和m
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strs = s.split(" ");

        int n = Integer.valueOf(strs[0]);
        int m = Integer.valueOf(strs[1]);
//读取投票结果，存放在一个数组中，数组中存放的是选票上的信息
        String[] str = new String[m];
        for (int i = 0; i < m; i++)
            str[i] = in.nextLine();
// System.out.println(str.length);
//创建一个新数组，反转str，这样数组中的每一个元素都是以为球星的投票结果，并对其进行排序
        String[] new_str = new String[n];

        for (int i = 0; i < n; i++) {
            char[] c = new char[m];
            for (int j = 0; j < m; j++) {
                c[j] = str[j].charAt(i);
            }
            Arrays.sort(c);
            new_str[i] = new String(c);
        }

// for (String s : new_str) {
// System.out.println(s);
// }
//使用比较字符串的大小，判断是否存在球星，如果有最大值且大于一个，则不存在球星。
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (new_str[max].compareTo(new_str[i]) > 0) {
                max = i;
            }
            if (new_str[max].compareTo(new_str[i]) == 0) {
                System.out.println("-1");
                return;
            }
        }

        System.out.println(max);

    }
}
