
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Michelle de Jesus Rogério
 */
public class TestJanela {

    @Test
    public void TestMarca() {
        Janela gol = new Janela();
        gol.setMarca("Vidrex");
        assertEquals("Vidrex", gol.getMarca());
    }

    @Test
    public void TestLargura() {
        Janela vectra = new Janela();
        vectra.setLargura((double) 37.2);
        assertEquals((double) 37.2, vectra.getLargura(), 0);
    }

    @Test
    public void testAltura() {
        Janela hyundai = new Janela();
        hyundai.setAltura((double) 72);
        assertEquals((double) 72, hyundai.getAltura(), 0);
    }

    @Test
    public void testPreco() {
        Janela civic = new Janela();
        civic.setPreco((double) 3000.00);
        assertEquals((double) 3000.00, civic.getPreco(), 0);
    }

    @Test
    public void testInsulfilm() {
        Janela civicRodrigo = new Janela();
        civicRodrigo.setInsulfilm(true);
        assertEquals(true, civicRodrigo.getInsulfilm());
    }
}
