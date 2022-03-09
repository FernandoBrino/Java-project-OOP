package Exe7;

public class Door {
    boolean isOpen;
    int numOpenings;

    public void open() {
        isOpen = true;
        numOpenings += 1;
        System.out.println("A porta está aberta!");
        System.out.println("Número de vezes que a porta foi aberta = " + numOpenings);
    }

    public void close() {
        isOpen = false;
        System.out.println("A porta foi fechada!");
    }
}
