package figurasGeometricas;

/**
 * Created with IntelliJ IDEA.
 * User: David Restrepo
 * Date: 6/08/13
 * Time: 09:55 AM
 * To change this template use File | Settings | File Templates.
 */
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
