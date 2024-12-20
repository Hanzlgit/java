package com.learn2.A03KeBianCanShu;

public class Test {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,4,5,6,7,8,9,10));
    }

    //默认 生成一个数组接受参数
    public static int getSum(int...args){
        int sum =0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        return sum;
    }
    //只能有一个可变参数.
//    public static double getSum(double...args,double args1){
//
//    }
    //有其他形参,可变参数写到最后.
    public static float getSum(float args1,float...args2){
        return 0;
    }
}
