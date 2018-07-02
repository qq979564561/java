public class Dog {
    String name;
    public Dog(String name){
        //System.out.println("小狗的名字: " + name);
        this.name = name;
    }



    public static void main(String[] args) {
        Dog mydog = new Dog("小江");
        System.out.println(mydog.name);
    }
}
