package Homework_1;

import Animal.Animal;
import Cat.Cat;
import Dog.Dog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Для рандомной генерации живности
//        Random random = new Random();
//        int length = 5+random.nextInt(5);
//        Animal[] animals = new Animal[length];
//        for(int i = 0; i < length; i++){
//            if(random.nextBoolean()){
//                animals[i] = new Cat("Cat"+i,i);
//            }
//            else {
//                animals[i] = new Dog("Dog"+i,i);
//            }
//            animals[i].run(100+random.nextInt(200));
//            animals[i].swim(100+random.nextInt(200));
//            System.out.println("--------------");
//        }

        //я захотел сделать животину уникальней, поэтому для создания объектов не использовал циклы
        Dog dog1 = new Dog("Бобик", 12);
        Dog dog2 = new Dog("Рэкс", 13);
        Dog dog3 = new Dog("Мухтар", 6);
        Cat cat1 = new Cat("Мурка", 2);
        Cat cat2 = new Cat("Сивка", 7);
        Cat cat3 = new Cat("Графиня де Мурмуа", 1);
        Cat cat4 = new Cat("Тупеня", 5);
        System.out.println("------------------------------");
        cat4.voice();
        dog1.voice();
        System.out.println("------------------------------");
        cat1.run(103);
        cat2.run(3434);
        cat3.run(6546);
        cat4.run(56);
        dog1.run(562);
        dog2.run(456);
        dog3.run(23435);
        System.out.println("------------------------------");
        cat1.swim(103);
        cat2.swim(3434);
        cat3.swim(6546);
        cat4.swim(56);
        dog1.swim(200);
        dog2.swim(456);
        dog3.swim(312);
        System.out.println("------------------------------");
        System.out.println("Котов создано: " + Cat.getQuantityCat());
        System.out.println("Собак создано: " + Dog.getQuantityDog());
        System.out.println("Животных Создано " + Animal.getQuantityAllAnimal());
    }
}
