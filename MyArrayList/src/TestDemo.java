import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList  list = new MyArrayList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.display();
        list.add1(32);
        list.add1(32);
        list.display();
        list.contains(65);
        //list.search(4);
    }
}
