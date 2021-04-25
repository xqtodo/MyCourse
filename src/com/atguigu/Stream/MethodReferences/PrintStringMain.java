package com.atguigu.Stream.MethodReferences;

/**
 * @author lixq
 * @date 2021/4/26 4:21
 */
public class PrintStringMain {
    public static void main(String[] args) {
        /*拿到String类型(可以推导出来，所以省略)的数据，然后打印
        * 问题：
        *   对字符串进行打印的操作已经有了现成的实现，System.out方法的println(String)方法
        *   所以，就不用手动调用了*/
        ps(s -> System.out.println(s));
        /*方法引用核心：可推导可省略
        * 直接让 System.out中的println方法来取代lambda
        * 无需指定参数类似，方法重载形式，自动推导*/
        ps(System.out::println);
    }
    public static void ps(PrintString string){
        string.print("Hello,world");
    }
}
