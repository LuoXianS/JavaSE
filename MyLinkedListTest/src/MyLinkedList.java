class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
    public Node(){

    }
}
public class MyLinkedList {
    public Node head;

    //输出链表
    public void disPlay() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找到最后一个节点的引用
    public Node findLastNode() {
        if (this.head == null) {
            System.out.println("空链表");
            return null;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找到倒数第二个节点
    public Node findLastTwoNode() {
        if (this.head == null) {
            System.out.println("空链表");
            return null;
        }
        if (this.head.next == null) {
            System.out.println("只有一个节点");
            return null;
        }
        Node cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //求链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //找到第N个节点
    public Node findNode(int N) {
        if (this.head == null) {
            System.out.println("空链表");
            return null;
        }
        if (N < 0 || N > size()) {
            System.out.println("N不存在");
            return null;
        }
        Node cur = this.head;
        int count = 1;
        while (count != N) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //求单链表中是否包含某个元素
    public boolean searchNode(int N) {
        if (this.head == null) {
            System.out.println("空链表");
            return false;
        }
        Node cur = this.head;
        while (cur.val != N) {
            cur = cur.next;
        }
        return true;
    }

    //头插法
    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //找到pos-1节点
    public Node findPose(int pos) {
        Node cur = this.head;
        int count = 0;
        while (count != pos - 1) {
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int pos, int val) {
        if (pos < 0 || pos > size()) {
            System.out.println("pos不合法");
            return;
        }
        if (pos == 0) {
            addFirst(val);
            return;
        }
        if (pos == size()) {
            addLast(val);
            return;
        }
        Node cur = findPose(pos);
        Node node = new Node(val);
        node.next = cur.next;
        cur.next = node;
    }

    //找到key的前驱节点
    public Node findPre(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("链表为空");
            return;
        }
        if (this.head.val == key) {
            System.out.println("只有一个");
            this.head = this.head.next;
            return;
        }
        Node cur = findPre(key);
        if (cur == null) {
            System.out.println("不存在key");
            return;
        } else {
            cur.next = cur.next.next;
        }
    }
    //删除所有的key
    public void removeAll(int key) {
        if (this.head == null) {
            System.out.println("链表为空");
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
            return;
        }

    }
    //反转链表
    public void reserveList(){
        if (this.head == null) {
            System.out.println("链表为空");
            return;
        }
        Node prev = null;
        Node cur = this.head;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        this.head = prev;
    }
    //求链表的中间值
    public Node middle() {
        Node fast = this.head;
        Node low = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }
    //求链表倒数第N项
    public Node findLastNode(int N){
        if (this.head ==null){
            return null;
        }
        if (N <= 0 ){
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;
        int count = 0;
        while(count != N-1) {
            if (fast.next == null) {
                return null;//当走到尾巴节点,直接return
            } else {
                fast = fast.next;
                count++;
            }
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
    //合并两个有序链表
    public Node meRgeTwoList(Node headA,Node headB){
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(headA != null && headB !=null){//两个链表必须为费控链表
            if (headA.val < headB.val){
                tmp.next = headA;
                headA = headA.next;
            }else{
                tmp.next = headB;
                headB = headB.next;
            }
            tmp = tmp.next;
        }
        if (headA != null){
            tmp.next = headA;

        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead;
    }
    //给定一个数,让链表中小于这个数的在左,大于这个数的在右,不改变顺序
    public Node partition(int val) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.val < val) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = cur
                    ;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null){
            return as;//第一部分为不为空
        }
        be.next = as;
        this.head =bs;
        if (as != null){
            ae.next = null;//尾节点必须置为空
        }
        return bs;
    }//删除链表中重复的节点
    public Node removeSameNode(){
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = this.head;
        if (this.head == null){
            return null;
        }
        if (this.head.next == null){
            return null;
        }
        while(cur != null){
            if (cur.next != null &&cur.val == cur.next.val){
                while(cur.next != null &&cur.val == cur.next.val){
                    cur = cur.next;
                }
            }else{
                tmp.next = cur;
                tmp = tmp.next;
            }
            cur = cur.next;
        }
        this.head = newHead.next;
        tmp.next = null;
        return newHead.next;
    }

}

