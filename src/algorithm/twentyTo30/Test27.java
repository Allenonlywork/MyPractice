package algorithm.twentyTo30;

/**
 * 求100以内的素数
 */
public class Test27 {
    /**
     * @Author xieqiong
     * @param args
     * @Version 1.0
     * @DATE 20200214
     */
    public static void main(String[] args) {
        System.out.println(2);
        boolean flag = true;
        for(int i = 3;i<100;i++){
            for(int j =2;j<Math.sqrt(i);j++){
                if(i%j==0){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }

    }

}
