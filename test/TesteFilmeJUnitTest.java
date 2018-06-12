
import org.junit.Test;
import exemploclasse.Filme;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class TesteFilmeJUnitTest {

    @Test
    public void TesteDefinirTitulo() {
        Filme cidadeDosSonhos = new Filme();
        cidadeDosSonhos.setTitulo("Cidade dos Sonhos");
        assertEquals("Cidade dos Sonhos", getTitulo());
    }

    @Test
    public void TesteDefinirTituloOriginal() {
        Filme cidadeDosSonhos = new Filme();
        cidadeDosSonhos.setTitulo("Mulholland Drive");
        assertEquals("Mulholland Drive", getTituloOriginal());
    }
    @Test
    public void TesteDefinirGenero() {
        Filme cidadeDosSonhos = new Filme();
        cidadeDosSonhos.setGenero("Drama");
        assertEquals("Drama", getGenero());
    }
    @Test
    public void TesteDefinirDiretor() {
        Filme cidadeDosSonhos = new Filme();
        cidadeDosSonhos.setDiretor("David Lynch");
        assertEquals("David Lynch", getDiretor());
    }
    @Test
    public void TesteClassificacao(){
        Filme cidadeDosSonhos = new Filme();
        cidadeDosSonhos.setClassificacao("16 anos");
        assertEquals("16 anos", getClassificacao());
    }
    @Test
    
}
