package Cat;

import Animal.Animal;

public class Cat extends Animal {

    private static int quantityCat;

    public Cat(String name, int age) {
        super(name, age);
        quantityCat++;
    }

    public Cat() {
        super();
        quantityCat++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name+" конечно бы могла проплыть "+MAX_SWIM_DISTANCE+"м, но как известно коты не плавают. Максимум тыгдык тыгдык." );
    }

    public static int getQuantityCat() {
        return quantityCat;
    }

    @Override
    public void voice() {
        System.out.println("Котейка "+name+" говорит 'мяю'!");
    }

}
