package figurasGeometricas;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: David Restrepo
 * Date: 8/08/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
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
