public class Main {
    public static void main(String[] args) {

        int x = 100;
        Car bmw = new Car(); // создать объект класса, экз. класса
        bmw.setColor("Red");
        bmw.setName("Bmw");
        bmw.setPower(45200);
        Car toyota = new Car();
         System.out.println(toyota.color);
        System.out.println(toyota.power);

        Car skoda = new Car("Skoda","White",200);

        ECar tesla = new ECar();
        tesla.setColor("Blue");
        tesla.setName("Tesla");
        tesla.setPower(500);
        tesla.doBeep(); // ECar

        /* задание
         1) Выбрать предметную область
         2) Выделить 4 сущности - 4 класса
         3) Для каждого класс 3-4 поля
         4) Геттер/сеттеры
         5) Экземпляры классов
         6) Должно быть наследование
         7) Перегрузка/переопределение
         */


    }
}