import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int [][] arr4 = new int [2][];
        arr4[0] = new int[]{2,3,5,};
        arr4[1] = new int[3];
        for (int i = 0; i <arr4 .length ; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]+" ");

            }
            System.out.println();
        }

    }
    //二维数组的打印
    public static void main1(String[] args) {
        int [][] arr = new int[][]{{1,2,3},{2,3,5},{2,9,8}};
        int [][] arr1 = new int [2][3];
        int [][] arr2 = {{1,2,3},{8,6,9}};
        String ret  = Arrays.deepToString(arr2);
        System.out.println(ret);
        for (int i = 0; i <arr .length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
        for (int[] arr3:arr2) {
            for (int x:arr3){
                System.out.print(x+" ");

            }
            System.out.println();
        }
    }
}
