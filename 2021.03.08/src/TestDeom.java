import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class TestDeom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//从键盘上循环读入一个数
        int sum = 0;
        while (sc.hasNext()) {
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum);//Ctrl+D结束循环
    }
  /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();//nextInt()后面不能跟nextLine()
                int cr = scanner.nextInt();
                System.out.println(str);
                System.out.println(cr);
    }*/
    public static void main5(String[] args) {
      /*  int j = 1;
        int sum = 0;
        while (j <= 5) {
            int i = 1;
            int ret = 1;
            while (i <= j) {
                ret *= i;
                i++;
            }
            sum += ret;
            j++;
        }
        System.out.println(sum);*/
    }
                 //求5!
    public static void main4(String[] args) {
       /* int i = 1; //初始化变量
        int ret = 1;//用于求存放阶乘
        int sum = 0;//用于存放阶乘的和
        while (i <= 5) {
            ret *= i;//保留上次阶乘的结果,下次继续乘i
            i++;
            sum += ret;//每次的阶乘结果想加
        }
        System.out.println(sum);*/
    }
   public static void main3(String[] args) {
      /* int i = 1;
       int ret = 1;
       while(i <= 5){
           ret*= i;//用作每次的阶乘结果
           i++;
       }
       System.out.println(ret)*/
    }
       public static void main2 (String[]args){
        /*for (int i = 1; i <10; i++) {
            System.out.println(i);
            
        }*/
       /* int a = 10;
        a = a ++;
        System.out.println(a);*/
        }
        public static void main1 (String[]args){
          /* int i = 1;
        while (i <= 10) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;
            }
            i++;
        }*/
    }
}


