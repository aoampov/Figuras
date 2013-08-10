package figurasGeometricas;

/**
 * Created with IntelliJ IDEA.
 * User: David Restrepo
 * Date: 8/08/13
 * Time: 09:43 AM
 * To change this template use File | Settings | File Templates.
 */
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
