package com.atguigu.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lixq
 * @date 2021/4/26 9:59
 */
public class Create {
    public static void main(String[] args) {
        /**
         * 创建Stream流的的方式：
         * 1、Arrays.stream()
         * 2、Stream.of()
         * 3、Collection.stream()
         * 4、Collection.parallelStream()创建并发流
         */
        //1.Arrays.stream()
        String[] arr = new String[]{"hello","","word","java",""};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);
        System.out.println("------------------------");
        //2.Stream.of()
        Stream<String> stream2 = Stream.of(arr);
        stream2.forEach(System.out::println);
        System.out.println("------------------------");
        //3.Collection.stream()
        List<String> list = Arrays.asList("hello","world","java");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);
        System.out.println("------------------------");


    }
}
