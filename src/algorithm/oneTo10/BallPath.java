package algorithm.oneTo10;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class BallPath {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191209
     */
    public static void main(String[] args) {
        double h = 100;
        double s = 100;
        for(int i=1;i<=10;i++){
            h = h/2;
            s+=2*h;
        }
        System.out.println("共经过"+ s + "米");
        System.out.println("第10次反弹" + h + "米");
    }
}
