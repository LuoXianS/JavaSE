import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.time.Period;
import java.util.Arrays;

/*class Person{
    private String name ;
    private int age ;
    public String sex;
    public static int count;
    {
        System.out.println("实例化代码块");
    }
    static{
        count = 99;
        System.out.println("静态代码块");
    }
    public Person(int age ,String name){
        this.age = age;
        this.name = name;
        System.out.println("带有两个参数的构造方法");
    }
    public Person(){
        System.out.println("没有参数的构造方法");

    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

    public void setAge(int age){
        this.age = age;
    }
    public int  getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", sex='" + this.sex + '\'' +
                '}';
    }
}*/

   /* class Test {
        {
            System.out.println("diyi");
        }

        public String toString() {

            System.out.print("aaa");

            return "bbb";
        }
    }*/
   class Test {
       public static int a1= 1;
       public static void hello() {
           System.out.println("hello");
       }
   }
    public class TestDemo {
        public static int a= 1;
        public static void main(String[] args) {
            Test T  =  new Test();
            T.a1++;
            Test test=null;
            System.out.println();
            test.hello();
        }

        public static void func(int[] arr){
            for (int i = 0; i <arr.length-1; i++) {
                for (int j = 0; j <arr.length-1-i ; j++) {
                    if (arr[j] %2 == 1){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }

                }
            }
        }
       public static void main26(String[] args) {
            int[] arr = new int[]{1,2,6,5,4,7,};
            func(arr);
           System.out.println(Arrays.toString(arr));

       }
       public static void change(int[] arr1, int[] arr2) {
           for (int i = 0; i < arr1.length; i++) {
               int tmp = arr1[i];
               arr1[i] = arr2[i];
               arr2[i] = tmp;
           }
       }
       public static void main2(String[] args) {
           int[] arr = new int[]{2, 3, 6, 4, 8};
           int[] arr1 = new int[]{5, 6, 4, 8, 7};
           System.out.println(Arrays.toString(arr1));
           System.out.println(Arrays.toString(arr));
           change(arr,arr1);
           System.out.println(Arrays.toString(arr1));
           System.out.println(Arrays.toString(arr));
       }
   }
        //public static void main3(String[] args) {

            //System.out.println(new Test());
        //}
    //}

    /*static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main4(String[] args){
        System.out.println("cnt =" + cnt);
    }
    static{
        cnt /=3;
    };
    public static void main2(String[] args) {
        String s = null;
        System.out.println("s="+s);
    }*/
    //public static void main1(String[] args) {
        //System.out.println(Person.count);
        //Person person = new Person(10,"zhangsan");
       //System.out.println(Person.count);
        /*person.setName("zhangsan");
        person.getName();
        person.setAge(10);
        person.getAge();
        System.out.println(person);
        person.sleep();
        person.eat();*/


