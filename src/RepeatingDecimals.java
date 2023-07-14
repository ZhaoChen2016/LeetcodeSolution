/**
 * creat by zhaochen on 2018/8/30 19:13
 */


import java.util.Scanner;

/**
 * 循环小数（Repeating  Decimals)
 * 题目：
 * 输出a/b的循环小数表示以及循环节长度
 * Created by Administrator on 2018/4/12.
 * <p>
 * 第一步：先算出 a/b 的 商
 * 第二步：算出 a%b 的余数
 * 第三步：循环计算  （余数远远小于除数，所以需要将余数扩大10倍，然后再被除数相除,然后循环）
 *
 * @author 春风吹又生
 */

import java.util.Scanner;

/**
 * 循环小数（Repeating  Decimals)
 * 题目：
 * 输出a/b的循环小数表示以及循环节长度
 * Created by Administrator on 2018/4/12.
 * <p>
 * 第一步：先算出 a/b 的 商
 * 第二步：算出 a%b 的余数
 * 第三步：循环计算  （余数远远小于除数，所以需要将余数扩大10倍，然后再被除数相除,然后循环）
 *
 * @author 春风吹又生
 */
public class RepeatingDecimals {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a, b;
            while(input.hasNext()) {
                a = input.nextInt();
                b = input.nextInt();

                int[] num = new int[3005];
                int[] digit = new int[3005];
                int a1 = a;
                int tempD = 0;
                num[0] = a/b;
                tempD = a % b;
                a = a % b * 10;


                int k = 0;
                int index = -1;

                //当余数再次出现时，说明循环节出现
                while(a != 0 && digit[tempD] == 0) {
                    num[++k] = a/b;
                    digit[tempD] = k;
                    tempD = a % b;
                    a = a % b * 10;
//                    index++;
                }
                int len  = 0;
                if(a == 0) {
                    for(int i = 1; i <= k; i++){
//                        System.out.print(num[i]);
                        index++;
                    }



                }
                else {
                    for(int i = 1; i < digit[tempD] ; i++) {
//                        System.out.print(num[i]);
                        index++;
                    }

                    //输出循环节
//                    System.out.print("(");
                    for(int i = digit[tempD]; i <= k && i < digit[tempD] + 50; i++) {
//                        System.out.print(num[i]);
                        index++;
                    }

                  len  = k - digit[tempD] + 1;
                }
                System.out.println(--index+" "+len);
            }
        }
    }




