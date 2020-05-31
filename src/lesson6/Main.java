package lesson6;

import animals.*;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static int catCount = 0;
    private static int dogsCount = 0;

    public static void main(String[] args) {
        Animal [] animals = new Animal[] {
                new Cat("Васька"),
                new Cat("Мурзик"),
                new Cat("Чероки"),
                new Cat("Барсик"),
                new Dog("Тузик"),
                new Dog ("Тор"),
                new Dog("Спайк")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].setMaxRunDistance(random.nextInt(500));
            animals[i].setMaxSwimDistance(random.nextInt(100));
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(random.nextInt(500));
            animals[i].swim(random.nextInt(100));
            if (animals[i] instanceof Cat) {
               catCount++;
            }
            if (animals[i] instanceof Dog) {
                dogsCount++;
            }
        }

        System.out.println("Всего животных - " + animals.length);
        System.out.println("Всего котов - " + catCount);
        System.out.println("Всего собак - " + dogsCount);

    }
}
