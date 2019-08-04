package algorithm.sort;

import algorithm.sort.algorithm.sort.BubbleSort;

import algorithm.sort.algorithm.sort.Sortable;
import algorithm.sort.domain.Person;

import java.util.Arrays;
import java.util.Random;

/**
 * 排序算法测试
 * <p>
 * Created by zhangwei on 2018/4/20.
 */
public class Main {

    public static void main(String[] args) {
        Person[] persons = makePersons();
        Sortable<Person> sort = null;
        // 冒泡法
         sort = new BubbleSort<>();
        // 选择法
        // sort = new SelectionSort<>();
        // 插入排序
//        sort = new InsertionSort<>();

        print(persons, sort);
    }

    private static void print(Person[] persons,Sortable<Person> sort) {
        // 打印排序前的数组
        System.out.println("********** " + sort.getName() + " **********");
        System.out.println("before sort");
        Arrays.asList(persons).stream().forEach(person -> System.out.print(person));
        long startTime = System.currentTimeMillis();
        sort.sort(persons);
        // 打印排序后的数组
        System.out.println();
        System.out.println("after sort, cousumed: " + (System.currentTimeMillis() - startTime) + " milliseconds");
        Arrays.asList(persons).stream().forEach(System.out::print);
    }

    private static Person[] makePersons() {
        int length = 10;
        Person[] persons = new Person[length];
        Random random = new Random();
        for (int i = 0; i < length; i ++) {
            Person person = new Person();
            person.setAge(random.nextInt(100) + 1);
            persons[i] = person;
        }
        return persons;
    }

}
