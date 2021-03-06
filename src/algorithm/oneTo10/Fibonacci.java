package algorithm.oneTo10;

/**
 * @Description
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Fibonacci {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191204
     */
    public static void main(String[] args) {
        int f1 = 1,f2 = 1,f;
        int M = 30;
        System.out.println(f1);
        System.out.println(f2);
        for(int i=3;i<M;i++){
            f = f2;
            f2 = f1 + f2;
            f1 = f2;
            System.out.println(f2);
        }
    }
}
