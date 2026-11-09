package ejercicio2;

public class Hilo extends Thread{
    @Override
    public void run() {
        System.out.println("Ejecutando en: " + Thread.currentThread().getName());
    }
}
