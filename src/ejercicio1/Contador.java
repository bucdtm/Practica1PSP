package ejercicio1;

public class Contador extends Thread {
    private String nombre;
    private int n;

    public Contador(String nombre, int n) {
        this.nombre = nombre;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(nombre + ": " + i);
        }
    }
}
