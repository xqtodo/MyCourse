package iuc.auok.Optional;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author lixq
 * @date 2021/4/26 16:54
 */
public class demo {
    public static void main(String[] args) {
        String str = "Hello";
        //Optional.of() 创建一个不能为null的optional对象
        Optional<String> str1 = Optional.of(str);
        System.out.println(str1.get());
        // isPresent() 判断是否不为空，有值返回true，无值返回false
        System.out.println(str1.isPresent());

        List<Student> list = Arrays.asList(new Student("大雄",10,60),
                                           new Student("静香",11,90),
                                           new Student("小夫",12,80),
                                           new Student("胖虎",13,50));
        //找出年龄大于10且成绩大于70
        for (Student student : list) {
            // 将student对象放入optional容器对象中
            Optional<Student> studentOptional = Optional.ofNullable(student);
            // 过滤年龄大于10岁的，并且将其映射成为成绩，最后有值就返回，无值就返回0(打印的是成绩)
            Integer score = studentOptional.filter(stu -> stu.getAge() > 10).map(Student::getGrade).orElse(0);
            if (score>70){
                //如果上一步返回的成绩大于70，就输出姓名
                System.out.println(student.getName());
            }
        }
    }
}
