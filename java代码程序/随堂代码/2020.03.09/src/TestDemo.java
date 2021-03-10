import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //求1-999999 之间的自幂数
        int n = sca.nextInt();
        //int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int count = 0;
            while (tmp != 0) {
                count++;
                tmp = tmp / 10;//求出n是几位数
            }
            tmp = i;
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10, count);//求出每个数的幂数和
                tmp = tmp / 10;
            }
            if (sum == i) {
                System.out.println(i);//判断是否为自幂数
            }
        }
    }
}
