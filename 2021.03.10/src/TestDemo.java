import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        //求n的 n*n的乘法表
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"");
            }
            System.out.println();
        }
    }
    //输出一个整数的每一位
    public static void main13(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int  tmp = n;
        int count = 0;
        while (tmp != 0) {
            count++;
            tmp = tmp/10;//求出n是几位数
        }
        tmp = n;
        int a = 0;
        while (count != 0) {
            a = tmp%10;
            tmp = tmp/10;
            count--;
            System.out.print(a+" ");
        }
        //System.out.println(a);

    }

    public static void main12(String[] args) {
        //猜数字游戏
        Scanner sca = new Scanner(System.in);
        Random ran = new Random();
        int b = ran.nextInt(100)+1;
        while (true){
            int a = sca.nextInt();
            if (a > b){
                System.out.println("猜大了");
            }else if(a < b){
                System.out.println("猜小了");
            }else  {
                System.out.println("正确");
                break;
            }

        }
    }
    public static void main10(String[] args){
        //登录三次 正确退出程序错误可以重新输入3次
        Scanner sca = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            String PassWord = sca.nextLine();
            if (PassWord.equals("123456")){
                System.out.println("密码正确");
            }else{
                count--;
                System.out.println("密码错误"+"还有"+count+"机会");
            }
        }if (count == 0){
            System.out.println("登录失败");
        }

    }
    public static void main14(String[] args) {
        Scanner sca = new Scanner(System.in);
        //求1-999999 之间的自幂数
        int n = sca.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int  tmp = i;
            int count = 0;
            while (tmp != 0) {
                count++;
                tmp = tmp/10;//求出n是几位数
            }
            tmp = i;
            //int sum = 0;
            while (tmp != 0) {
                sum+=Math.pow(tmp%10,count);//求出每个数的幂数和
                tmp = tmp/10;
            }
            if (sum == i) {
                System.out.println(i);//判断是否为自幂数
            }
        }
    }
    public static void main8(String[] args) {
        int k = 1;
        double sum = 0.0;
        for (int i = 1; i <= 100 ; i++) {
            sum += 1.0/i *k;
            k = -k;
        }
        System.out.println(sum);
    }
    public static void main4(String[] args) {
        //求最大公约数
        int a = 12;
        int b = 18;
        int c = 0;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
    /* public static void main7(String[] args) {
          for (int i = 1; i <= 9 ; i++) {
              for (int j = 1; j <= i ; j++) {
                  if(i == j){
                      System.out.print("*");
                  }if (i != j){
                      System.out.print(" ");
                  }if()
              }
          }
      }*/
    public static void main56(String[] args) {
        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
        System.out.println("请输入一个年龄");
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        if (a <= 18) {
            System.out.println("当前年龄段的人是少年");
        } else if (a > 19 && a <= 28) {
            System.out.println("当前年龄段的人青年");
        } else if (a > 29 && a <= 55) {
            System.out.println("当前年龄段的人是中年");
        } else if (a > 56) {
            System.out.println("当前年龄段的人是老年");
        }
    }

    public static void main3(String[] args) {
        //判断是不是质数
        System.out.println("请输入一个数");
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()) {
            int a = sca.nextInt();
            int i = 0;
            for (int j = 1; j <= a; j++) {
                for (i = 2; i <= Math.sqrt(j); i++) {
                    if (j % i == 0) {
                        break;
                    }
                }
                if (i > Math.sqrt(j)) {
                    System.out.println(j + "");
                }
            }
        }
    }



    public static void main5(String[] args) {
        //打印 1 - 100 之间所有的素数
       /* System.out.println("请输入一个数");
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();*/
        int j = 2;
        for (int i = 1; i <= 100; i++) {
            for (; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.print( " ");
            }
        }
    }

    //输出1000-2000之间的所以闰年
    public static void main2(String[] args) {
        int i = 0;
        for(i = 1000; i <= 2000; i++){
            if(i % 4 == 0 && i % 100 !=0 ||i % 400 == 0){
                System.out.println(i);
            }
        }
    }

    //1-100出现多少次9
    public static void main1(String[] args) {
        int j = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 10 == 9 ){
                j++;
            }
            if (i / 10 == 9)
                j++;
        }
        System.out.println(j);
    }
}


