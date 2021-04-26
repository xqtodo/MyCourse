package iuc.auok.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author lixq
 * @date 2021/4/26 12:53
 */
public class csdn {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<String> collect = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);

        String[] arr = {"ab","cd","qw"};
        List<String> collect1 = Arrays.stream(arr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> list = Arrays.asList(1, 3, 2, 8, 11, 4);
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce);

    }
}
