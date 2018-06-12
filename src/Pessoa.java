
/**
 *
 * @author Michelle de Jesus Rogerio
 */
public class Pessoa {

// atributos = características
    public String nome, sobrenome, cpf;
    public byte idade;
    public float peso, altura;
    public char sexo;

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nIdade: " + idade
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nSexo: " + sexo
                + "\nCPF: " + cpf
                + "\nSobrenome: " + sobrenome;

    }
}
