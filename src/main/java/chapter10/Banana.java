package chapter10;

public class Banana extends Fruit{

    public Banana(){
        setCalories(443);
    }
    public void makeJuice(){
        System.out.println("Banana milkshake is made");
    }

    public void peel(){
        System.out.println("Peel the banana");
    }
}
