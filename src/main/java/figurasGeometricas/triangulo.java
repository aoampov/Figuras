package figurasGeometricas;


public class triangulo extends Figura {

    public double lado1,lado2,lado3;


    @Override
    public double perimetro() {

        double p=lado1+lado2+lado3;
        return p;
    }

    @Override
    public double area() {
        double s = (lado1 + lado2 + lado3)/2;
        double a = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return a;
    }
}
