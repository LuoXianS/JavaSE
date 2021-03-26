public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList MyLinkedList = new MyLinkedList();
       // MyLinkedList.createList();
     /*   MyLinkedList.addFirst(9);
        MyLinkedList.addFirst(19);
        MyLinkedList.addFirst(29);
        MyLinkedList.addFirst(39);*/
       /* MyLinkedList.addLast(110);
        MyLinkedList.addLast(120);
        MyLinkedList.addLast(130);*/
   /*     MyLinkedList.addIndex(0,20);
        MyLinkedList.addIndex(1,30);
        MyLinkedList.addIndex(2,40);
        MyLinkedList.addIndex(2,120);*/
      /*  MyLinkedList.addIndex(0,120);
        MyLinkedList.addIndex(1,30);
        MyLinkedList.addIndex(2,40);
        MyLinkedList.addIndex(3,120);
        MyLinkedList.addIndex(4,30);
        MyLinkedList.addIndex(3,120);*/
        MyLinkedList.addFirst(19);
        MyLinkedList.addFirst(29);
        MyLinkedList.addFirst(39);
        MyLinkedList.addFirst(49);
        MyLinkedList.display();
        System.out.println(" ======");
        System.out.println(MyLinkedList.Size());
        Node ret =  MyLinkedList.returnMid1();
        System.out.println(ret.val);
        //MyLinkedList.reserveList();

       /* MyLinkedList.clear();
        MyLinkedList.display();*/

        /*System.out.println("========");
        MyLinkedList.removeAllKey(120);
        MyLinkedList.display();
        System.out.println("========");
        MyLinkedList.removeAllKey(30);
        MyLinkedList.display();*/

        /*System.out.println("========");
        MyLinkedList.remove(20);
        MyLinkedList.display();*/
        //System.out.println(MyLinkedList.Search(39));
        //Node ret = MyLinkedList.FindN(3);
        //System.out.println(ret.val);
        //System.out.println(MyLinkedList.Size());
        // Node ret = MyLinkedList.FindLastTwoN();
       //System.out.println(ret.val);
        //Node ret = MyLinkedList.FindLastN();
        //System.out.println(ret.val);

    }
}
