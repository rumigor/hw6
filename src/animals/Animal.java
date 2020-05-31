package animals;

public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int meters) {
        if (meters >= 0) {
            if (this.maxRunDistance >= meters) {
                System.out.println(this.name + " пробежал " + meters + " м.");
            } else if (this.maxRunDistance < meters) {
                System.out.println("Максимальное расстояние которое может пробежать " + name + " - " +
                        this.maxRunDistance + " м.");
            } else {
                System.out.println("Введено некорректное расстояние (отрицательное число)");
            }
        }
    }

    public void swim (int meters) {
        if (this.maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать:(");
            return;
        }
        if (meters >= 0) {
            if (this.maxSwimDistance >= meters) {
                System.out.println(this.name + " проплыл " + meters + " м.");
            } else if (this.maxSwimDistance < meters) {
                System.out.println("Максимальное расстояние которое может проплыть " + name + " - " +
                        this.maxSwimDistance + " м.");
            } else {
                System.out.println("Введено некорректное расстояние (отрицательное число)");
            }
        }
    }

    public void setMaxRunDistance(int maxRunDistance) {
        if (maxRunDistance >= 0) {
            this.maxRunDistance = maxRunDistance;
        }
        else {
            System.out.println("Расстояние не может быть меньше нуля!");
        }
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        if (maxSwimDistance >= 0) {
            this.maxSwimDistance = maxSwimDistance;
        } else {
            System.out.println("Расстояние не может быть меньше нуля!");
        }
    }
}


