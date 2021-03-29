public class TestDmeo {
    //判断两个链表是否相交,返回相交节点
    public static Node intersectionNode(Node headA,Node headB){
        int lenA = 0;
        int lenB = 0;
        Node cur1 = headA;//指向长链表的头
        Node cur2 = headB;//指向锻炼表的头
        while(cur1 != null){
            cur1 = cur1.next;
            lenA++;
        }
        while(cur2 != null){
            cur2 = cur2.next;
            lenB++;
        }
        int  len = lenA -lenB;
        if (len < 0){
            cur1 = headB;
            cur2 = headA;
            len = lenB-lenA;
        }else{
            cur1 = headA;
            cur2 = headB;
        }
        while (len != 0) {
            cur1 = cur1.next;
            len--;
        }
        while(cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    public static void main(String[] args) {

    }
}
