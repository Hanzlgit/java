package com.learn2.A07Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    // parse 编译时异常, 代码有报错,
    public static void main(String[] args) throws ParseException {
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);


        // 运行时异常: 不报错, 运行会出错
        int[] arr = {1,2,3,4};
        System.out.println(arr[10]);
    }
}
