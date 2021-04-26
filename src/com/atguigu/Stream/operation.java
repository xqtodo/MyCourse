package com.atguigu.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lixq
 * @date 2021/4/26 10:25
 */
public class operation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","","world","","java");
        list.stream().filter(s -> !s.equals("")).forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(1,5,3,6,2,1,5);
        //获取流，去重，排序，收集
        /**
         * distinct():去重
         * sorted()：排序
         * collect(Collectors.toList()) 将流中的数据重新收集到集合中，这里是收集到list集合中
         *         Collectors 是Java8内置的工具类，内置各种收集器
         */
        List<Integer> integers = integerList.stream().distinct().sorted().collect(Collectors.toList());
        integers.forEach(System.out::println);
        System.out.println(integers);

        list.stream().sorted(Comparator.comparing(s -> s));

    }
}
