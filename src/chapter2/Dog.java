package chapter2;

public class Dog {
    int size;
    String breed;
    String name;

    void bark () {
        System.out.println("woof woof");
    }
}
class DogTestDrive {
    public static void main(String [] args){
        Dog d = new Dog();
        d.size = 10;
        System.out.println(d.size);
        d.bark();
    }
}
