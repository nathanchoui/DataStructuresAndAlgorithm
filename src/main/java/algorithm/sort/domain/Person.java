package algorithm.sort.domain;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/20.
 */
public class Person implements Comparable<Person> {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge())
            return 1;
        else if (this.getAge() < o.getAge())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return age + " ";
    }
}
