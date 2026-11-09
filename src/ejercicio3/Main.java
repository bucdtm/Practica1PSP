package ejercicio3;

public class Main {
    static void main() {
        Caballo[] caballos = new Caballo[5];
        for (int i = 0; i < caballos.length; i++) {
            caballos[i] = new Caballo(i + 1);
            caballos[i].start();
        }
    }
}
