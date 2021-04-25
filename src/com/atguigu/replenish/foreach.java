package com.atguigu.replenish;

import java.util.Arrays;
import java.util.List;

/**
 * @author lixq
 * @date 2021/4/25 17:19
 */
public class foreach {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ni","hao","wa");
        /*遍历stringList集合，依次将集合中的变量拿出来存入变量list中然后打印list*/
        stringList.forEach(System.out::println);
    }
}
