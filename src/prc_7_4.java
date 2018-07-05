public class prc_7_4 {

    public static void main(String[] args) {
//        DogInfo dog_1 = new DogInfo();
//        dog_1.setName(dog_1);
//        dog_1.printName(dog_1);
//        C c = new C(1, 2, 3);

        toString_test textExample = new toString_test();
        textExample.test();
        System.out.println("\n");
        System.out.println(textExample.toString());
    }

}

class DogInfo{
    private int age;
    private  String name;

    public void setName(DogInfo dog){
        dog.name = "Nemo";
    }
    public void printName(DogInfo dog){
        System.out.println(dog.name);
    }

}
//
//class A{
//
//}
//
//class B extends A{
//
//}

class A {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void say() {
        System.out.println("This is class A");
    }

    public A(int a) {
        this.a = a;
    }

}

class B extends A {

    private int b;

    public B(int a) {
        super(a);
    }

    public B(int a, int b) {
        super(a);
        this.b = b;
    }
}

class C extends B {

    private int c;

    public C(int a) {
        super(a);
    }

    public C(int a, int c) {
        super(a);
        this.c = c;
    }

    public C(int a, int b, int c) {

        super(a, b);
        this.c = c;
    }

}

class toString_test{
    public static String str1 = "This is test";

    @Override
    public String toString() {
        return "嘻嘻嘻";
    }

    void test(){
        String str = new String("Hello");
        System.out.printf("返回值： %s",str.toString());
    }

}