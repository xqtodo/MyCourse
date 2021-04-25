package com.atguigu.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
/**
 * @author lixq
 * @date 2021/4/25 16:22
 */
public class StreamTest {
    public static void main(String[] args) {
        /*
            生成流
         */
        //将数组转换为 list 集合
        List<String> stringList = Arrays.asList("hello","","world");
        //先生成流，再对流过滤，再收集进list集合
        List<String> string = stringList.stream().filter(list -> !list.isEmpty()).collect(Collectors.toList());
        System.out.println(string);
        string.forEach(System.out::println);
        /*
            for each
         */

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
