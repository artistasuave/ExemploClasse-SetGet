
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Michelle de Jesus Rogerio
 */
public class TestBrinquedo {

    @Test
    public void TestNome() {
        Brinquedo barbieVeterinaria = new Brinquedo();
        barbieVeterinaria.setNome("Alicia, a Barbie Veterinária");
        assertEquals("Alicia, a Barbie Veterinária", barbieVeterinaria.getNome());
    }

    @Test
    public void TestMarca() {
        Brinquedo mattel = new Brinquedo();
        mattel.setMarca("Mattel");
        assertEquals("Mattel", mattel.getMarca());
    }

    @Test
    public void TestModelo() {
        Brinquedo modeloDoLego = new Brinquedo();
        modeloDoLego.setModelo("Lego Architecture 21034 London");
        assertEquals("Lego Architecture 21034 London", modeloDoLego.getModelo());
    }

    @Test
    public void TestDescricao() {
        Brinquedo shopkins = new Brinquedo();
        shopkins.setDescricao("O produto conta com 1 shoppie, "
                + "2 shopkins exclusivos, 1 avental, 1 escova,"
                + "1 cartão VIP e 1 pedestal. Tudo isso pra deixar"
                + " a brincadeira ainda mais divertida. Brinque, se "
                + "divirta e viaje nesse mundo mágico com a Mini Boneca - "
                + "Shopkins Shoppies - Chef Club da DTC!");
        assertEquals("O produto conta com 1 shoppie, "
                + "2 shopkins exclusivos, 1 avental, 1 escova,"
                + "1 cartão VIP e 1 pedestal. Tudo isso pra deixar"
                + " a brincadeira ainda mais divertida. Brinque, se "
                + "divirta e viaje nesse mundo mágico com a Mini Boneca - "
                + "Shopkins Shoppies - Chef Club da DTC!", shopkins.getDescricao());
    }

    @Test
    public void TestPreco() {
        Brinquedo precoShopkins = new Brinquedo();
        precoShopkins.setPreco((double) 99.99);
        assertEquals((double) 99.99, precoShopkins.getPreco(), 0);
    }

    @Test
    public void TestCodigo() {
        Brinquedo codigoFrisbee = new Brinquedo();
        codigoFrisbee.setCodigo((short) 452658);
        assertEquals((short) 452658, codigoFrisbee.getCodigo(), 0);
    }
    @Test
    public void TestCodigoBarras(){
        Brinquedo codigoBarrasTazo = new Brinquedo();
        codigoBarrasTazo.setCodigoBarras(7896654398L);
        assertEquals(7896654398L, codigoBarrasTazo.getCodigoBarras(), 0);
    }
}
