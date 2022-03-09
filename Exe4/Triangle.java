package Exe4;

public class Triangle {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    void calcArea() {
        double area = side * Math.sqrt(3) / 2;
        System.out.println("Área do triângulo = " + area);
    }

    void calcPerimeter() {
        double perimeter = side * 3;
        System.out.println("Perimetro do triângulo = " + perimeter);
    }
}
