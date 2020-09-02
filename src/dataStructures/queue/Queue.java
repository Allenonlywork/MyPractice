package dataStructures.queue;

public class Queue {
    public static void main(String[] args) {

    }

}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部，分析出front是指向对队列头的前一个位置
        rear = -1;//指向队列尾，指向队列尾的数据（即就是队列最后一个数据）
    }

    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize -1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return front == rear;
    }

    //添加数据到队列，入队列
    public void addQueue(int n){
        //判断队列是否满
        if(isFull()){
            System.out.println("队列满，不能加入数据！");
            return;
        }
        rear++;//rear后移
        arr[rear] = n;
    }
    //获取队列的数据，出队列
    public int getQueue(){
        //判断队列是否空
        if(isEmpty()){
            //通过抛出异常
            throw new RuntimeException("队列位空，不能取数据！");
        }
        front++;//front后移
        return arr[front];
    }

    //显示队列
    public void showQueue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for(int i =0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    //显示队列的头数据，不是取出数据
    public int headQueue(){
        //判断
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据！");
        }
        return arr[front+1];
    }

}
