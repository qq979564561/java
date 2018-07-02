public class Person {
    public String  name;
    public int age;



    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }


    public static void main(String[] args){
        Person p_1 = new Person("小米", 12);
        System.out.println(p_1.name);
        System.out.println(p_1.age);
    }
}
