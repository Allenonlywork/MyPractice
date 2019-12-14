package algorithm.tenTo20;

/**
 * 题目： 输出 9 *　9 口诀。
 */
public class MultiplicationTables {
    /**
     * Author xieqiong
     * @param args
     * Version 1.0
     * DATE 20191211
     */
    public static void main(String[] args) {
        for(int i = 1;i < 10 ;i++){
            for(int j = 1;j <= i ;j++){
                System.out.println(i + "*" + j + "=" + i * j);
//                System.out.println("   ");
            }
//            System.out.println("   ");
        }
    }
}
