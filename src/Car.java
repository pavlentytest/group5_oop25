public class Car {
    String model; // private-package
    private String name;
    private String color;
    private int power;
    protected double speed;

    public void doBeep() {
        System.out.println("Beep!");
    }

    public String doBeep(String beep) {
        return beep;
    }


    public Car() {

    }
    public Car(String name_, String color_, int power_) {
        name = name_;
        color = color_;
        power = power_;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power > 0 && power < 1000) {
            this.power = power;
        }
    }
}
