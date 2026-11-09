package ejercicio1;

public class Main {
    static void main() {
        Thread t1 = new Thread(new Contador("Contador A", 5));
        Thread t2 = new Thread(new Contador("Contador B", 10));
        Thread t3 = new Thread(new Contador("Contador C", 15));

        t1.start();
        t2.start();
        t3.start();
    }
}
