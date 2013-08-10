package figurasGeometricas;

import junit.framework.Assert;
import org.junit.Test;


public class trianguloTest {
    @Test
    public void testPerimetro() throws Exception {
     triangulo t = new triangulo();
        t.lado3 = 4.0;
        t.lado2 = 5.0;
        t.lado1 = 6.0;

        Assert.assertEquals(15.0, t.perimetro());

    }

    @Test
    public void testArea() throws Exception {

        triangulo t = new triangulo();
        t.lado1 = 4.0;
        t.lado2 = 5.0;
        t.lado3 = 6.0;

        Assert.assertEquals(9.921567416492215, t.area());

    }
}
