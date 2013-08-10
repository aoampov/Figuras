package figurasGeometricas;

import junit.framework.Assert;
import org.junit.Test;


public class cuadradoTest {
    @Test
    public void testPerimetro() throws Exception {


        cuadrado c= new cuadrado();

        c.lado = 2.0;

        Assert.assertEquals(8.0, c.perimetro());

    }

    @Test
    public void testArea() throws Exception {

        cuadrado c= new cuadrado();
        c.lado= 2.0;

        Assert.assertEquals(4.0, c.area());

    }
}
