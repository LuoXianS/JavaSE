class Node{
    private int val;
    private Node prev;
    private  Node next;

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node(int val) {
        this.val = val;
    }
}

public class DoubleLinkedList {
    private Node head;
    private Node last;
    public void addFirst(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.head.setPrev(node);
            node.setNext(this.head);
            this.head = node;
        }
    }
    public void addLast(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.setNext(node);
            node.setPrev(last);
            this.last = node;
        }
    }
    public void disPlay(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getVal()+" ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    //求长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur  = cur.getNext();
        }
        return count;
    }
    //在index插入data
    public void addIndex(int index ,int data){
        if (index < 0|| index >size()){
            System.out.println("不合法");
            return;
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == size()){
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node cur = this.head;
        while(index != 0){
            cur = cur.getNext();
            index--;
        }
        node.setPrev(cur.getPrev());
        node.setNext(cur);
        cur.getPrev().setNext(node) ;
        cur.setPrev(node);
    }
    //查找是否有key
    public boolean search(int key){
        Node cur = this.head;
        while(cur != null){
            if (cur.getVal() ==key){
                return true;
            }
            cur = cur.getNext();
            }
        return false;
    }
     //是否存在key
    public Node searchKey(int key){
        Node cur = this.head;
        while(cur != null){
            if (cur.getVal() == key){
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }
    //删除第一次出现的key
    public void remove(int key){
        Node cur = searchKey(key);
        if (cur == null) {
            return;
        }
        if (cur == this.head){
            this.head = this.head.getNext();
            this.head.setPrev(null);
            return;
        }
        if (cur ==this.last){
            this.last = this.last.getPrev();
            this.last.setNext(null);
            return;
        }
        cur.getPrev().setNext(cur.getNext());
        cur.getNext().setPrev(cur.getPrev());
    }
    public void remove1(int key){
        Node cur = searchKey(key);
        while(cur != null){
            if (cur.getVal() == key){
                if (cur == this.head){
                    this.head = this.head.getNext();
                    this.head.setPrev(null);
                }else{
                    cur.getPrev().setNext(cur.getNext());
                    if (cur.getNext() != null){
                       cur.getNext().setPrev(cur.getPrev());
                    }else{
                        this.last = this.head.getPrev();
                        this.head.setNext(null);
                    }

                }
            }
            cur = cur.getNext();
        }
    }
    public void clear(){
        this.head = null;
        this.last = null;
    }
}
