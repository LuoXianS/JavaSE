public class TestDmeo {
    public static void main(String[] args) {
        MyLinkedList MyLinkedList = new MyLinkedList();
        MyLinkedList.addFirst(49);
        MyLinkedList.addFirst(49);
        MyLinkedList.addFirst(69);
        MyLinkedList.addFirst(39);
        MyLinkedList.addFirst(49);
        MyLinkedList.addFirst(59);
        MyLinkedList.disPlay();
        System.out.println("========");
        MyLinkedList.removeSameNode();
        MyLinkedList.disPlay();

       /* Node ret = MyLinkedList.partition(50);
        System.out.println(ret.val);
        MyLinkedList.disPlay();*/
        //MyLinkedList.disPlay();
        //Node ret =  MyLinkedList.findLastNode(7);
        //System.out.println(ret);

        /*MyLinkedList.reserveList();
        MyLinkedList.disPlay();
        System.out.println("========");
        Node ret = new Node();
        ret = MyLinkedList.middle();
        System.out.println(ret.val);*/
        /*MyLinkedList.removeAll(49);
        MyLinkedList.disPlay();*/

    }

}
