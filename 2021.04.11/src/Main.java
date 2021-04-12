import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;
//输入两个字符串,删除第一个字符串里,所有的第二个字符串有的;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] str = s1.split("");
        StringBuffer str1 = new StringBuffer();
        for (int i = 0; i < str.length ;i++) {
            if (!s2.contains(str[i])){
                str1.append(str[i]);
            }
        }
        System.out.println(str1.toString());
    }
    //贪心算法求 每组中间值得总和
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num*3];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int j = 1; j <=num ; j++) {
            sum+=arr[arr.length-(j*2)];
        }
        System.out.println(sum);
    }
    //输入两个字符串,删除第一个字符串里,所有的第二个字符串有的;

}
