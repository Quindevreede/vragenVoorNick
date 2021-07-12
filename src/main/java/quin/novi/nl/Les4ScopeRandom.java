package quin.novi.nl;

import java.util.Random;

public class Les4ScopeRandom {
    public static void main(String[] args) {
        int totalsum = 0;

        for (int i = 0; i < 10; i++) {
            Random random = new Random((int)(Math.random() * 11));
            totalsum = totalsum + random.nextInt();
        }
        System.out.println("De som van alle random-getallen is: " + totalsum);
    }
}
