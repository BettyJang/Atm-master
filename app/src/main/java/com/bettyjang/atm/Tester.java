package com.bettyjang.atm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2018/1/2.
 */

public class Tester {
    public static void main(String[] args) {
        Date now = new Date(); //時間方法
        System.out.println(now);
        System.out.println(now.getTime()); //執行時間的當下毫秒數
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.format(now));
        //反過來 有字串 得Data物件
        String b = "1997/10/5";
        try {
            Date birthday = sdf.parse(b);
            System.out.println(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
