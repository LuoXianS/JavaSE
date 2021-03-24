import java.util.Arrays;

public class ArrayList {
    private int [] elem ;
    private int useSize;

    public ArrayList(){
        this.elem = new int [5];
    }
    public ArrayList(int capacity){
        this.elem = new int [capacity];
    }
    //扩大列表
    public void reSize(){
        Arrays.copyOf(this.elem,2*elem.length);
    }
    //判断表是否为满
    public boolean isFull(){
        if (useSize== elem.length){
            return true;
        }
        return false;
    }
    //输出顺序表
    public void disPlay(){
        for (int i = 0; i <useSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
    //添加元素
    public void add1(int data){
        if (isFull()){
            System.out.println("顺序表已满");
            return;
        }
        this.elem[this.useSize] = data;

    }
    //添加某个元素
    public void add(int pos, int data){
        if (isFull()){
            System.out.println("顺序已满");
            return;
        }
        if (pos < 0 || pos > useSize){
            System.out.println("pos位置信息错误");
            return;
        }
        for (int i = useSize-1; i >= pos ; i--) {
            this.elem[i+1]= this.elem [i];
        }
        this.elem[pos] = data;
        useSize++;
    }
    //判断表中是否存在某个元素
    public boolean contains(int toFind){
        for (int i = 0; i <this.useSize ; i++) {
            if (this.elem[i] == toFind){
                return true;
            }
        }return false;
    }
    //查找数组中某个元素
    public int search(int toFind) {
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }return -1;
    }
    //获取pos的位置的元素
    public int getPos(int pos){
        if (pos < 0 || pos >=useSize){
            System.out.println("元素不存在");
            return -1;
        }
        return this.elem[pos];
    }
    //给pos位置设置value
    public void setPos(int pos,int value){
        if (pos < 0 || pos >= this.useSize){
            System.out.println("pos不存在");
            return;
        }
        this.elem[pos] = value;
    }
    //删除第一次出的关键字key
    public void reMove(int key){
        int index = search(key);
        if (search(key) == -1){
            System.out.println("元素不存在");
        }
        for (int i = index; i <= this.useSize-2; i++) {
            this.elem[i] = this.elem[i+1];
        }
        useSize--;
    }
    //获取顺序表长度
    public int length(){ return this.useSize; }
    //清空顺序表
    public void clear(){ this.useSize = 0; }

}
