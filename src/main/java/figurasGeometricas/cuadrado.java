package figurasGeometricas;


public class cuadrado extends Figura {

    public double lado;

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
