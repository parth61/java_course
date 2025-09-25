package chapter10;

public class Apple extends Fruit {

    public Apple() {
        setCalories(234);
    }

    public void makeJuice() {
        System.out.println("Apple juice is made");
    }

    public void removeSeeds() {
        System.out.println("Remove the seeds");
    }
}
