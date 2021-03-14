import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    //1-100赋值数组
    public static int[] arg(int [] arr){
        for (int i = 0; i <100 ; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[100];
        System.out.println(Arrays.toString(arg(arr)));
    }
    //求数组之和
    public static int sum(int[] arr){
        int sum1 = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum1+=arr[i];
        }
        return sum1;
    }
    public static void main9(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(sum(arr));

    }
    //求数组的平均值;
    public static int func2(int [] arr){
        int sum = 0;
        int count = arr.length ;
        for (int i = 0; i <arr.length; i++) {
            sum+= arr[i];
        }
        return sum/count;
    }
    public static void main8(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(func2(arr));
    }
    //找出一个数组中的主要元素(超过数组一半长度的元素)
    public static int func1(int [] arr){
        int count = 1;
        int tmp = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    if (count > arr.length){
                        tmp = arr[i];
                        return tmp;
                    }
                }
            }
        }
        return 0;
    }
    public static void main7(String[] args) {
        int[] arr = {2,6,6,2,6,6,2,6,2,};
        System.out.println(func1(arr));
    }
    //返回数组中和等于target的元素的下标
    public static int[] func(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main6(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        System.out.println(Arrays.toString(func(arr,20)));
    }
    //二倍输出数组,且不修改原来的数组
    public static int[] func(int [] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ret[i] = arr[i]*2;
        }
        return ret;
    }
    public static void main5(String[] args) {
        int[] arr = {1,2,3,4,};
        System.out.println(Arrays.toString(arr));
        int[] ret= func(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] func() {
        //数组转化为字符串输出
        int[] ret = {1, 2, 3, 4,};
        return ret;
    }
    public static void main4(String[] args) {
        int[] ret = func();
        String str =Arrays.toString(ret);
        System.out.println(str);
    }
    //打印数组的三种方式
    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1,2,3,4,5,6,7};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int x:arr1) {
            System.out.print(x+" ");
        }
        String str = Arrays.toString(arr2);
        System.out.print(str);
    }
    //汉诺塔
    public static void move(char pose1, char pose2){
        System.out.print(pose1+"->"+pose2+" ");
    }
    public static void hannota(int n ,char pose1, char pose2, char pose3){
        if (n == 1){
            move(pose1,pose3);
            return;
        }else{
            hannota(n-1,pose1,pose3,pose2);
            move(pose1,pose3);
            hannota(n-1,pose2,pose1,pose3);
        }

    }
    public static void main2(String[] args) {
        hannota(1,'A','B','C');
        System.out.println();
        hannota(2,'A','B','C');
        System.out.println();
        hannota(3,'A','B','C');
    }
    public static void main1(String[] args) {
        //循环输出由*号组成的X图形
        Scanner  sca = new Scanner(System.in);
        while(sca.hasNextInt()){
            int n = sca.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n ; j++) {
                    if (j == i){
                        System.out.print("*");
                    }else if (j == n-1-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
