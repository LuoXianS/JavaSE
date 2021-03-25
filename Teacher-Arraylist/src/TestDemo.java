public class TestDemo {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,9);
        myArrayList.add(1,19);
        myArrayList.add(2,29);
        myArrayList.display();
        myArrayList.add2(8888);
        myArrayList.add2(11111);
        myArrayList.add2(444444);
        myArrayList.display();
        myArrayList.contains(19);

    }
}
