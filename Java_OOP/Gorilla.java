public class Gorilla extends Mammal {
    public Gorilla() {
        super(100);
    }

    public void throwSomething() {
        System.out.println("The Gorilla has viciously thrown something across the room!");
        energyLevel -= 5;
        System.out.println(energyLevel);
    }

    public void eatBanana() {
        System.out.println("The Gorilla took a break to eat a Banana");
        energyLevel += 10;
        System.out.println(energyLevel);
    }

    public void climb() {
        System.out.println("The Gorilla is climbing up the nearest tree");
        energyLevel -= 10;
        System.out.println(energyLevel);
    }
}
