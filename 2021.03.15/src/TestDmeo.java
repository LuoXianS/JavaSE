import javax.crypto.Mac;
import java.util.Arrays;

public class TestDmeo {
    //数组的逆置
    public static void reverse(int[] arr){
        if (arr == null){
            return;
        }
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean flg = false;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if (flg == false){
                return;
            }
        }
    }
    public static void main12(String[] args) {
        int[] arr = new int[]{2,6,1,5,96,3,58,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //判断数组是否为升序
    public static boolean isUp(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main11(String[] args) {
        int[] arr= new int[]{2,3,4,5,8,2,3,4};
        System.out.println(isUp(arr));
    }
    //二分查找找出数组某一元素
    public static int count1= 0;
    public static int binarySearch(int [] arr,int Num,int count){
        int left = 0;
        int right = arr.length-1;
        while(left <=right){
            count1++;
            count++;
            int mid = (right+left)/2;
            if (arr[mid] == Num) {
                System.out.println(count);
                return mid;
            }else if (arr[mid] < Num){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }

    public static void main10(String[] args) {
        int[] arr = new int[1_0000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i;
        }
        int count = 0;
        int Num = 9999;
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,Num,count));
        //System.out.println(Arrays.binarySearch(arr, Num));
        System.out.println(count1);
    }
    //找到数组中给定的元素
    public static int findNum(int[] arr, int Num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Num){
                return i;
            }
        }
        return -1;
    }
    public static void main8(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int Num = 6;
        System.out.println(findNum(arr,Num));
    }
    //求数组中的最大值
    public static int findMax(int[] arr){
        int Max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (Max < arr[i]){
                Max = arr[i];
            }
        }
        return Max;
    }
    public static void main7(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(findMax(arr));
    }
    public static void main6(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr1 = new int[]{arr.length};
        arr1 = Arrays.copyOfRange(arr,2,5);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    //数组的4种copy方法
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr1 = arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    public static void main4(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);//速度最快
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    public static void main3(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    public static void main2(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    //调用自己的方法来实现,数组转化成字符串.
    public static String Mytotring(int[] arr) {
        if (arr == null) {
            return null;
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main1(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print(Mytotring(arr));
    }
    //System.out.println(func(arr));
}

