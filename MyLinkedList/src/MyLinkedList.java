import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

class Node{
    public  int val ;
    public Node next;
    public Node(){

    }
    public Node(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    public Node head;
    //先创建一个LinkedList
    public void createList(){
        this.head = new Node(9);
        Node node1 = new Node(19);
        Node node2 = new Node(29);
        Node node3 = new Node(39);
        Node node4 = new Node(49);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
    }
    //输出
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //找到最后一个节点的引用
    public Node FindLastN(){
        Node cur = this.head;
        if (this.head == null){
            return null;
        }
        while(cur.next != null){
            cur  = cur.next;
        }
        return cur;
    }
    //找出倒数第二个节点
    public Node FindLastTwoN(){
        if (this.head == null){
            System.out.println("老铁,没有节点");
            return null;
        }
        if (this.head.next == null){
            System.out.println("只有一个节点");
            return this.head;
        }
        Node cur = this.head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        return cur;
    }
    //求链表长度
    public int Size(){
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //找到第N个节点
    public Node FindN(int n){
        if (this.head == null){
            System.out.println("链表为空");
            return null;
        }
        if (n < 0 || n > Size()){
            System.out.println("N不存在");
            return null;
        }
        Node cur = this.head;
        int count = 1;
        while (count != n){
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //求单链表中是否包含某个元素
    public boolean Search(int n){
        if (this.head == null){
            System.out.println("链表为空");
            return false;
        }
        Node cur = this.head;
        while(cur.val != n){
            cur = cur.next;
        }
        return true;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){
        Node cur = FindLastN();
        Node node = new Node(data);
            if (cur == null){
                this.head = node;
            }else{
                cur.next = node;
        }
    }//找到index-1的节点
    public Node findIndex(int index){
        int count = 0;
        Node cur  = this.head;
        while(count != index-1){
            count++;
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if (index < 0 || index > Size()){
            System.out.println("index不合法");
            return;
        }
        if(index == 0 ){
            this.addFirst(data);//头插法
            return;
        }
        if (index == Size()){
            this.addLast(data);//尾插法
            return;
        }else{
            Node cur = findIndex(index);
            Node node = new Node(data);
            node.next = cur.next;
            cur.next = node;
           /* Node cur = this.head;
            int count = 0;
            Node node = new Node(data);
            while(count != index-1){
                count++;
                cur = cur.next;
            }
            node.next = cur.next;
            cur.next = node;*/
        }
    }
    //找到前驱节点
    public Node findPrev(int key){
        Node cur = this.head;
        while(cur.next != null){
            if (cur.next.val == key){
                return cur;
            }else{
                cur = cur.next;
            }
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("链表为空");//链表为空
            return;
        }
        if (this.head.val == key) {
            this.head = this.head.next;//链表为1
            return;
        }//正常删除
        Node cur = findPrev(key);
        if (cur == null) {
            System.out.println("不存在key值");
        } else {
            //Node ret = cur.next;
            cur.next = cur.next.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head == null){
            System.out.println("空链表");
            return;
        }
        Node cur = this.head.next;
        Node prev = this.head;
        while(cur != null){
            if (cur.val ==key){
                prev.next = cur.next;
            }else{
                prev  = cur;
            }
            cur = cur.next;
        }
        if (this.head.val == key){
            this.head = this.head.next;
        }
    }
    //反转链表
    public Node reserveList(){
        Node cur = this.head;
        Node prev = null;//翻转的前驱节点
        while(cur != null){
            Node curNext = cur.next;//存放cur.next的值
            if (cur.next == null){
                this.head = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return this.head;
    }
    //返回中间节点,如果为两个则返回第二个中间节点
    public Node returnMid1(){
        int ret = Size()/2;
        Node cur =this.head;
         int count = 0;
         while(count != ret) {
             cur = cur.next;
             count++;
         }
         return cur;
    }
    public Node returnMid(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //清空
    public void clear() {
        this.head = null;
    }
    
}
