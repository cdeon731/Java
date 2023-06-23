public class Bat extends Mammal {
    public Bat() {
        super(300);
    }

    public void fly() {
        System.out.println("The bat is flying around... Menacingly!");
        energyLevel -= 50;
        System.out.println(energyLevel);
    }

    public void eatHumans() {
        System.out.println("The bat is eating humans! Oh my god there's blood everywhere!!");
        energyLevel += 25;
        System.out.println(energyLevel);
    }

    public void attackTown() {
        System.out.println("The bat is attacking the town! Time to move...");
        energyLevel -= 100;
        System.out.println(energyLevel);
    }
}
