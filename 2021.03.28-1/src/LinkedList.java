class Node{
    public int val;
    public Node next;
    public Node(){
        this.val = val;
    }
}
public class LinkedList {
    //回文结构
    public Node head;
    public boolean huiWen(){
        //找到中间节点
        Node fast = this.head;
        Node slow = this.head;
        Node prev = null;
        while (fast != null&&fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        prev = slow;
        //从slow开始逆置
        Node cur = slow.next;
        while(cur != null){
            Node curNext = cur.next;//应该放在里面这样子就不会空指针异常
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        while(slow != head){
            if (slow.val != head.val){
                return false;
            }
            if (this.head.next == slow){
                return true;//偶数情况
            }
                slow = slow.next;
                head = head.next;

        }
        return true;//计数情况
    }
    //判断链表是否有环
    public boolean hasCycle(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null&& fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null&& fast.next == null){
            return false;
        }
        return true;
    }
    //返回环的节点
    public Node hasCycle1(){
        Node fast1 = this.head;
        Node slow1 = this.head;
        while(fast1 != null&& fast1.next != null){
            fast1 = fast1.next.next;
            slow1 = slow1.next;
            if (fast1 == slow1){
                break;
            }
        }
        if (fast1 == null&& fast1.next == null){
            return null;
        }
        fast1 = this.head;
        while(fast1 != slow1){
            fast1 = fast1.next;
            slow1 = slow1.next;
        }
         return fast1;

    }
    //旋转链表

}
