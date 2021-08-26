package models;

public class Quadrado {
    private double base;
    private double altura;
    private double area;



    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public double calcularArea(){
        this.area= this.altura*this.base;

        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;

        this.calcularArea();
    }
}
