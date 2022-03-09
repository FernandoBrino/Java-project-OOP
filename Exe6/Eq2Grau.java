package Exe6;

public class Eq2Grau {
    double a, b, c, delta;

    public Eq2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void delta() {
        delta = (Math.pow(2, b)) - (4 * a * c);
        System.out.println("Delta é igual a = " + delta);
    }

    public void raiz1() {
        double x1 = ((b * (-1)) + Math.sqrt(delta)) / 2 * a;
        System.out.println("A primeira raiz de delta é igual a = " + x1);
    }

    public void raiz2() {
        double x2 = ((b * (-1)) - Math.sqrt(delta)) / 2 * a;
        System.out.println("A segunda raiz de delta é igual a = " + x2);
    }
}
