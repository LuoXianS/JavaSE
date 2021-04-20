import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[100];
        int i =0;
        while(scanner.hasNext()){
            arr[i] = scanner.nextInt();
            i++;
        }
        int [] arr1 = new int[i-1];
        System.arraycopy(arr,0,arr1,0,i-1);
        Arrays.sort(arr1);
        for (int j = 0; j <arr[i] ; j++) {
            System.out.print(arr1[j]+" ");
        }
        }
    //删数
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
    //单调栈

    //数组中出现奇数个得值
    public static void main1(String[] args) {
                Scanner scan = new Scanner(System.in);
                while (scan.hasNext()) {
                    //用set实现，找出出现次数为奇数次的那俩个数字
                    Set<Integer> set = new HashSet<>();
                    int n = scan.nextInt();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = scan.nextInt();
                        if (!set.contains(arr[i])) {
                            set.add(arr[i]);
                        } else {//如果存在把之前加进来的踢出去，因为它出现了奇数次，就和最后的结果没有什么关系了
                            set.remove(arr[i]);
                        }
                    }
                    //到达这里，set里面就只剩下俩个出现奇数次的数字了
                    //得到这俩个数字
                    //第一种获取值的方法
                    int[] res = new int[2];
                    int k = 0;
                    for (int i = 0; i < n; i++) {
                        if (set.contains(arr[i])) {
                            set.remove(arr[i]);
                            res[k++] = arr[i];
                            if (k == 2) break;
                        }
                    }
                    //第二种获取值的方法，采用迭代器
            /*int[] res = new int[2];
            int k = 0;
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()){
                res[k++] = it.next();
            }*/
                    if (res[0] < res[1]) {
                        System.out.println(res[0] + " " + res[1]);
                    } else {
                        System.out.println(res[1] + " " + res[0]);
                    }
                }
            }
        }
