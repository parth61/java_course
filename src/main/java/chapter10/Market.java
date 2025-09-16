package chapter10;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();
        apple.makeJuice();
        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Fruit banana = new Banana();
        ((Banana) banana).peel();

        Banana banana2 = new Banana();
        banana2.peel();

        Fruit orange = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(orange);
        squeeze(banana2);
    }
    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
