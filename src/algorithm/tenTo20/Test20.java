package algorithm.tenTo20;

/**
 * 题目：有一分数序列：
 * 2/1，3/2，5/3，8/5，13/8，21/13...
 * 求出这个数列的前20项之和。
 */
public class Test20 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191213
     */
    public static void main(String[] args) {
        double sum =0,ver=2;
        for(int i =1;i<=10;i++){
            sum+= ver/i;
            ver+=i;
        }
        System.out.println(sum);
    }
}
