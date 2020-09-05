package Dog;

import Animal.Animal;

public class Dog extends Animal {

    private static int quantityDog;

    public Dog(String name, int age) {
        super(name, age);
        quantityDog++;
    }

    public Dog() {
        super();
        quantityDog++;
    }

    @Override
    public void swim(int distance) {
        if(distance<MAX_SWIM_DISTANCE){
            System.out.println(name +" проплыл(а) "+distance+"м.");
        }
        else if(distance>MAX_SWIM_DISTANCE){
            System.out.println(name +" не смог(ла) проплыть "+distance+"м, предел "+MAX_SWIM_DISTANCE+"м.");
        }else{
            System.out.println(name +"  проплыл(а) "+distance+"м, животина чуть не померла это был ее предел.");
        }
    }

    public static int getQuantityDog() {
        return quantityDog;
    }

    @Override
    public void voice() {
        System.out.println("Собачка "+name+" говорит 'положи кота в коробку...т.е...Гав-Гав!!!'");
    }

}
