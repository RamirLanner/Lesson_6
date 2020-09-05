package Animal;

import Cat.Cat;

import java.util.Random;

public abstract class Animal {

    private static int quantityAllAnimal;
    protected String name;
    protected int age;

    protected final int MAX_RUN_DISTANCE;
    protected final int MAX_SWIM_DISTANCE;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        MAX_RUN_DISTANCE =  randomDistanceRun();
        MAX_SWIM_DISTANCE =  randomDistanceSwim();
        this.quantityAllAnimal++;
    }

    public Animal() {
        MAX_RUN_DISTANCE =  randomDistanceRun();
        MAX_SWIM_DISTANCE =  randomDistanceSwim();
        this.quantityAllAnimal++;
    }

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

    public static int getQuantityAllAnimal() {
        return quantityAllAnimal;
    }

    private int randomDistanceRun(){
        Random random = new Random();
        return  300+random.nextInt(300);
    }

    private int randomDistanceSwim(){
        Random random = new Random();
        return 100+random.nextInt(200);
    }

    public final void run(int distance){
        if(distance<MAX_RUN_DISTANCE){
            System.out.println(name +" пробежал(а) "+distance+"м.");
        }
        else if(distance>MAX_RUN_DISTANCE){
            System.out.println(name +" не смог(ла) пробежать "+distance+"м, предел "+MAX_RUN_DISTANCE+"м.");
        }else{
            System.out.println(name +" пробежал(а) "+distance+"м, животина чуть не померла это был ее предел.");
        }
    }

    public abstract void swim(int distance);
    public abstract void voice();
}
