package ejercicio3;

import java.util.Random;

public class Caballo extends Thread{
    private int id;
    private int metros = 0;
    private Random rand = new Random();

    public Caballo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (metros < 100) {
            metros += rand.nextInt(10) + 1; // 1 a 10 metros
            System.out.println("Caballo " + id + ": " + metros + " metros");

            if (metros >= 100) {
                System.out.println("¡El caballo " + id + " ha llegado a la meta!");
                break;
            }

            try {
                Thread.sleep(rand.nextInt(401) + 100); // 100 a 500 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
