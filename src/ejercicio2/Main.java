package ejercicio2;

public class Main {
    static void main() {
        Hilo h1 = new Hilo();
        h1.run();

        Hilo h2 = new Hilo();
        h2.setName("Trabajador");
        h2.start();

        System.out.println("Hilo principal: " + Thread.currentThread().getName());
    }
}
