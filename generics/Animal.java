package generics;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    void display(){
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Animal animal=new Animal();
        Fish fish=new Fish();
        Box<Fish> b=new Box<>(fish);
        List<Dog> dogs=new ArrayList<>();
//        List<Animal> animals=new ArrayList<>();
//        Dog[] dog=new Dog[3];
//        Animal[] animals=dog;
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        List<? extends Animal> animals=dogs;
        animals.forEach(animal1 ->  animal1.display());

        List<? super Dog>l1=dogs;
        l1.add(new Puppy());
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("Dog");
    }
}
class Puppy extends Dog{

}
class Cat extends Animal{
}
interface Swimmable {
    void swim();
}

class Fish extends Animal implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Swimmable");
    }
}
class Box<T extends Animal & Swimmable>{
    private T t;
    public Box(T t){
        this.t=t;
    }
}