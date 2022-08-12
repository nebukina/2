package ru.nebukina.ls4;

public class Triangle {
    private double a;
    private double b;
    private double c;

public Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }


    public double areaTriangle(){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public void noTriangle() throws TriangleException{
    if (((a+b)<=c)||((a+c)<=b)||((b+c)<=a)){
        throw new TriangleException();
        }

    }



}
