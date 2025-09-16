package chapter9;

import java.util.Arrays;

public class TasteTester{

    public static void main(String[] args) {
        WeddingCake wc = new WeddingCake();
        BirthdayCake bc = new BirthdayCake();

        bc.setFlavor("vanila");
        bc.setPrice(45);
        bc.setCandles(3);
        String [] b = {bc.getFlavor(),String.valueOf(bc.getCandles()), String.valueOf(bc.getPrice())};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }

}
