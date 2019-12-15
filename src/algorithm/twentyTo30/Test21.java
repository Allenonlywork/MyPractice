package algorithm.twentyTo30;

/**
 * 题目：求1+2!+3!+...+20!的和
 */
public class Test21 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191214
     */
    public static void main(String[] args) {
        long sum =0,ver =1;
        for(int i =1;i<=20;i++){
            ver = ver * i;
            sum+= ver;
        }
        System.out.println(sum);
    }
}
