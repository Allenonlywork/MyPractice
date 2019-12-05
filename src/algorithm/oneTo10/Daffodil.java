package algorithm.oneTo10;

/**
 * @Description
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Daffodil {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20191205
     */
    public static void main(String[] args) {
        int a,b,c;
        for(int i = 101;i<1000;i++){
           //个位数
            a = i%10;
            //十位数
            b = i/10%10;
            //百位数
            c = i/100;
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println(i);
            }
        }
    }
}
