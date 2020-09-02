//package dataStructures.linkedList;
//
//
//public class Josepfu {
//    public static void main(String[] args) {
//        //测试构建环形链表，和遍历是否ok
//        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
//        circleSingleLinkedList.addBoy(5);//加入5个小孩节点
//        circleSingleLinkedList.showBoy();
//
//    }
//}
//
////创建一个环形的单向链表
//class CircleSingleLinkedList{
//    //创建一个first节点，当前没有编号
//    private Boy first = new Boy(-1);
//
//    public void addBoy(int nums){
//        //nums 做一个数据校验
//        if(nums < 1){
//            System.out.println("nums的值不正确");
//            return;
//        }
//        Boy curBoy = null;//辅助指针，帮助构建环形链表
//        //使用for循环来创建环形链表
//        for(int i = 1;i<= nums;i++){
//            //根据编号，创建小孩节点
//            Boy boy = new Boy(i);
//            //如果是第一个小孩
//            if(i == 1){
//                first = boy;
//                first.setNext(first);//构成环
//                curBoy = first;//让curBoy指向第一个小孩
//            }else{
//                curBoy.setNext(boy);
//                boy.setNext(first);
//                curBoy = boy;
//            }
//        }
//    }
//
//    //遍历当前的环形链表
//    public void showBoy(){
//        //判空
//        if(first == null){
//            System.out.println("没有任何小孩~~");
//            return;
//        }
//        //因为first 不能动，因此我们仍然使用一个辅助指针完成遍历
//        Boy curBoy = first;
//        while(true){
//            System.out.printf("小孩的编号%d \n",curBoy.getNo());
//            if(curBoy.getNext() == first){//说明已经遍历完毕
//                break;
//            }
//            curBoy = curBoy.getNext();
//        }
//    }
//}
//
//
