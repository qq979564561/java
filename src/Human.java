public class Human {
    String name;
    String sex;
    int age;
    static int power = 10;

    Human(String name, String sex, int age, int power){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.power = power;
    }

    Human(){

    }

    static {
        System.out.println("This is Human:");
    }

    Human ageAdd(){
        this.age++;
        return this;
    }

    Human agePrint(){
        System.out.printf("The age: %d",this.age);
        //System.out.println("The age: " + age);
        return this;
    }

    public static void main(String[] args) {
        final Human Adam = new Human();
        Adam.ageAdd().ageAdd().ageAdd();
        Adam.agePrint();
        System.out.println(Adam.power);
        System.out.println(Human.power);
    }

}
