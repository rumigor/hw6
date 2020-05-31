package animals;

public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    public static int count;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.maxRunDistance = runDistance;
        this.maxSwimDistance = swimDistance;
    }



    public void run(int meters) {
        System.out.println("Животное " + this.name + "пробежало " + meters + " м.");
    }

    public void swim(int meters) {
        System.out.println("Животное " + this.name + "проплыло " + meters + " м.");
    }
}


