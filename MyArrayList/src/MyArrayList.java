import java.util.Arrays;

public class MyArrayList {
        /*public int[] elem = new int[10];
        public int usedSize = 0;
        */
        private int[] elem;//null
        private int usedSize;

        public MyArrayList() {
            this.elem = new int[6];
        }

        public MyArrayList (int capacity) {
            this.elem = new int[capacity];
        }

        // 打印顺序表
        public void display() {
                for (int i = 0; i <elem.length ; i++) {
                        System.out.print(elem [i]+ " ");
                }
                System.out.println();
        }
        public boolean isfull() {
                if (this.usedSize == this.elem.length){
                        return true;
                }
                return false;
        }
        //扩大数组
        public void resize(){
                this.elem = Arrays.copyOf(this.elem,2*elem.length);

        }
        // 在 pos 位置新增元素
        public void add(int pos, int data) {
                if (isfull()) {
                        System.out.println("顺序表已满");
                        return;
                }
                if (pos < 0 || pos > usedSize) {
                        System.out.println("位置信息错误");
                        return;
                }
                for (int i = usedSize - 1; i >= pos; i--) {
                        elem[i + 1] = elem[i];
                }
                this.elem[pos] = data;
                this.usedSize++;
        }
        public void add1 (int data){
                if (isfull()) {
                        System.out.println("顺序表已满");
                        return;
                }
                this.elem [this.usedSize] = data;
                this.usedSize++;
        }
        // 判定是否包含某个元素
        public boolean contains(int toFind) {
               /* int left = 0;
                int right = this.usedSize-1;
                while(left <= right){
                        int mid = (right + left)/2;
                        if (this.elem [mid] == toFind){
                                return true;
                        }else if (this.elem[mid] < toFind){
                                left = mid + 1;
                        }else{
                                right = mid -1 ;
                        }
                }
                return false;*/
                for (int i = 0; i < this.usedSize ; i++) {
                        if (toFind == this.elem [i]){
                                return true;
                        }
                } return false;
        }
        // 查找某个元素对应的位置
        public int search(int toFind) {
                int left1 = 0;
                int right1= this.usedSize - 1;
                while (left1 <= right1) {
                        int mid = (right1 + left1) / 2;
                        if (this.elem[mid] == toFind) {
                                System.out.println("存在");
                                return mid;
                        } else if (this.elem[mid] < toFind) {
                                left1 = mid + 1;
                        } else {
                                right1 = mid - 1;
                        }
                }
                return -1;
        }
        // 获取 pos 位置的元素
        public int getPos(int pos) {
                if (pos < 0 || pos >= this.usedSize){
                        System.out.println("元素不存在");
                        return -1;
                }
                return -1;
        }
        // 给 pos 位置的元素设为 value
        public void setPos(int pos, int value) {
                if (pos < 0 || pos >= this.usedSize){
                        System.out.println("元素不存在");
                        return;
                }
                this.elem [pos] = value;
        }
        //删除第一次出现的关键字key
        public void remove(int toRemove) { }
        // 获取顺序表长度
        public int size() {
                System.out.println(usedSize);
                return 0; }
        // 清空顺序表
        public void clear() {
                this.usedSize = 0;
        }


    }


