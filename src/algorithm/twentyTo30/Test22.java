package algorithm.twentyTo30;

/**
 * 题目：利用递归方法求5!。
 */
public class Test22 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191214
     */
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    public static int fac(int i){
        if(i == 1){
            return 1;
        }else {
            return i*fac(i-1);
        }

    }
}
