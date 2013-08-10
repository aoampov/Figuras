package figurasGeometricas;


public class Circulo extends Figura {

    public  double radio;



    @Override
    public double perimetro() {


        return (3.14)*2*radio;
    }

    @Override
    public double area() {
        return (radio*radio)*3.14  ;
    }
}
