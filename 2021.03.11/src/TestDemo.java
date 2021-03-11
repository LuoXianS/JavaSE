import java.util.Scanner;

public class TestDemo {
    //菲波那切数迭代
    public static int  fib1(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        int per1 = 0;
        int per2 = 1;
        int sum = 0;
        for (int i = 2; i <= n ; i++) {
            sum = per1 + per2;
            per1 = per2;
            per2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fib1(7));
    }
    public static void main9(String[] args) {
        int[] arr = {1, 5, 6, 9, 2, 3};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] % 2 == 0) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(arr.length);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    //求斐波那契数(递归)
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;//递终止的条件是N=1orN=2
        }
        return fib(n-1)+fib(n-2);//归的时n-1+n-2候实现
    }

    public static void main8(String[] args) {
        System.out.println(fib(6));
    }
    //输入一个数求组成这个数的数字之和
    public static int sum1(int n){
        if ( n > 9){
            return sum1(n / 10)+n%10;
        }else{
            return n;
        }

    }

    public static void main7(String[] args) {
        System.out.println(sum1(2345));
    }
    //递归求1+...+n的和
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        int sum = 0;
        return sum =n +sum(n-1);
    }
    public static void main6(String[] args) {
        System.out.println(sum(10));
    }
    //123顺序输出(递归)
    public static void  fac3(int n) {
        if (n > 9) {
            fac3(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main5(String[] args) {
        int ret = 456;
        fac3(ret);
    }
    //方法的重载
    public static int sum(int a ,int b){
        int ret = a + b;
        return  ret;
    }
    public static double sum(double a ,double b){
        double ret = a + b;
        return ret;
    }
    public static float sum(float a ,float b){
        float ret = a + b;
        return ret;
    }

    public static void main4(String[] args) {
        System.out.println(sum(5,5));
        System.out.println(sum(2.0,3.0));
        System.out.println(sum(3.0,4.0));
    }
    //用数组进行a,b值得交换
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main3(String[] args) {
        int[] arr ={10,20};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
    //可变参数编程
    public static int fac1(int ... arr){
        int ret =0;
        for (int x: arr){
            ret += x;
        }
        return ret;
    }
    public static void main2(String[] args) {
        System.out.println(fac1(2, 3, 5, 6));
        System.out.println(fac1(2, 4, 6, 8));
    }
    //递归求N!
    public static int fac(int n){
        if(n == 0) {
            return 1;
        }
         int tmp = n * fac(n-1);
         return  tmp;
        }

    public static void main1(String[] args) {
        int ret = fac(5);
        System.out.println(ret);
    }
}
