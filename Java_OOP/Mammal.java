public class Mammal {
    protected int energyLevel;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("This Animals energy level is: " + energyLevel);
        return energyLevel;
    }
}
