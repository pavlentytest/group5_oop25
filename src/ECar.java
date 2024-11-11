public class ECar extends Car {
    private int batteryCapacity;

    public ECar() {

    }

    public ECar(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public ECar(String name_, String color_, int power_, int batteryCapacity) {
        super(name_, color_, power_);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void doBeep() {
        System.out.println("ECar beeped!");
        double speed = this.speed;
    }
}
