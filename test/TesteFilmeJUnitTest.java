
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author Michelle de Jesus Rogério
 */
public class TesteFilmeJUnitTest {

    @Test
    public void TesteDefinirTitulo() {
        Filme cidadeDosSonhos = new Filme();
        cidadeDosSonhos.setTitulo("Cidade dos Sonhos");
        assertEquals("Cidade dos Sonhos", cidadeDosSonhos.getTitulo());
    }

    @Test
    public void TesteDefinirTituloOriginal() {
        Filme tropaDeElite = new Filme();
        tropaDeElite.setTituloOriginal("Tropa de Elite");
        assertEquals("Tropa de Elite", tropaDeElite.getTituloOriginal());
    }

    @Test
    public void TesteDefinirGenero() {
        Filme pulpFiction = new Filme();
        pulpFiction.setGenero("Drama");
        assertEquals("Drama", pulpFiction.getGenero());
    }

    @Test
    public void TesteDefinirDiretor() {
        Filme tropaDeEliteDois = new Filme();
        tropaDeEliteDois.setDiretor("José Padilha");
        assertEquals("José Padilha", tropaDeEliteDois.getDiretor());
    }

    @Test
    public void TesteClassificacao() {
        Filme casaDasCoelhinhas = new Filme();
        casaDasCoelhinhas.setClassificacao("18 anos");
        assertEquals("18 anos", casaDasCoelhinhas.getClassificacao());
    }

    @Test
    public void TestIdioma() {
        Filme oFabulosoDestinoDeAmeliePoulain = new Filme();
        oFabulosoDestinoDeAmeliePoulain.setIdioma("Francês");
        assertEquals("Francês", oFabulosoDestinoDeAmeliePoulain.getIdioma());
    }

    @Test
    public void TestAnoLancamento() {
        Filme oExorcista = new Filme();
        oExorcista.setAnoLancamento((short) 1973);
        assertEquals((short) 1973, oExorcista.getAnoLancamento());
    }

    @Test
    public void TestValorFaturamento() {
        Filme oIluminado = new Filme();
        oIluminado.setValorFaturamento((double) 2000000000);
        assertEquals((double) 2000000000, oIluminado.getValorFaturamento(), 0);
    }

    @Test
    public void TestValorOrcamento() {
        Filme oPoderosoChefao = new Filme();
        oPoderosoChefao.setValorOrcamento((double) 1500000000);
        assertEquals((double) 1500000000, oPoderosoChefao.getValorOrcamento(), 0);
    }

    @Test
    public void TestMediaPreco() {
        Filme titanic = new Filme();
        titanic.setMediaPreco((double) 500000000);
        assertEquals((double) 500000000, titanic.getMediaPreco(), 0);
    }

    @Test
    public void TestExpectadores() {
        Filme fightClub = new Filme();
        fightClub.setExpectadores((long) 2000000000);
        assertEquals((long) 2000000000, fightClub.getExpectadores());
    }

    /*@Test
     public void TestDataLancamentoBrasil(){
     Filme cidadeDosSonhos = new Filme();
     cidadeDosSonhos.setDataLancamentoBrasil(LocalDate)2005);
     assertEquals((LocalDate)2005, cidadeDosSonhos.getDataLancamentoBrasil());
     }
     */
}
