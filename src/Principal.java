
import javax.swing.JOptionPane;

/**
 * @author Michelle de Jesus Rogério
 */
public class Principal {

    public static void main(String[] args) {

        Pessoa lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.456.789-12";
        lucas.sobrenome = "Rodrigo";

        Pessoa carlos = new Pessoa();
        carlos.nome = "Carlos";
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.altura = 1.78f;
        carlos.sexo = 'm';
        carlos.cpf = "978.654.321-98";
        carlos.sobrenome = "Augusto";

        JOptionPane.showMessageDialog(null,
                "Nome: " + lucas.nome
                + "\nIdade: " + lucas.idade
                + "\nPeso: " + lucas.peso
                + "\nAltura: " + lucas.altura
                + "\nSexo: " + lucas.sexo
                + "\nCPF: " + lucas.cpf
                + "\nSobrenome: " + lucas.sobrenome
        );

        JOptionPane.showMessageDialog(null,
                "Nome: " + carlos.nome
                + "\nIdade: " + carlos.idade
                + "\nPeso: " + carlos.peso
                + "\nAltura: " + carlos.altura
                + "\nSexo: " + carlos.sexo
                + "\nCPF: " + carlos.cpf
                + "\nSobrenome: " + carlos.sobrenome
        );
        /*
         nome
         nome cientifico
         cor pelo
         apelido
         altura
         peso
         reino
         filo
         classe
         ordem
         familia
         genero
         especie
         */

        Macaco prego = new Macaco();
        prego.nome = "Louie Straus";
        prego.nomeCientifico = "Macacus Pregus Chatus";
        prego.corPelo = "tigrado";
        prego.apelido = "Louie";
        prego.altura = 0.48f;
        prego.peso = 4.8f;
        prego.reino = "Animalia";
        prego.filo = "Chordata";
        prego.classe = "Mammalia";
        prego.ordem = "Primates";
        prego.familia = "Cebidae";
        prego.genero = "Sapajus";
        prego.especie = "Simia apella";
        prego.sexo = 'm';
        prego.idade = 7;

        Macaco gorila = new Macaco();
        gorila.nome = "Jorge Eduardo";
        gorila.nomeCientifico = "Gorillas Brutus Alpianis";
        gorila.corPelo = "preto";
        gorila.apelido = "Edu";
        gorila.altura = 4.8f;
        gorila.peso = 230;
        gorila.reino = "Animalia";
        gorila.filo = "Chordata";
        gorila.classe = "Mammalia";
        gorila.ordem = "Primates";
        gorila.familia = "Hominidae";
        gorila.genero = "Gorilla";
        gorila.especie = "Gorilla gorilla";
        gorila.sexo = 'm';
        gorila.idade = 19;

        Macaco orangotango = new Macaco();
        orangotango.nome = "Ruth Marilyn Watson";
        orangotango.nomeCientifico = "Orangotanguis Mammalis";
        orangotango.corPelo = "marrom";
        orangotango.apelido = "Marilyn";
        orangotango.altura = 1.30f;
        orangotango.peso = 40;
        orangotango.reino = "Animalia";
        orangotango.filo = "Chordata";
        orangotango.classe = "Mammalia";
        orangotango.ordem = "Primates";
        orangotango.familia = "Hominidae";
        orangotango.genero = "Pongo";
        orangotango.especie = "Pongo borneo";
        orangotango.sexo = 'f';
        orangotango.idade = 19;

        Macaco numeroQuatro = new Macaco();
        numeroQuatro.nome = JOptionPane.showInputDialog("Insira o nome do macaco");
        numeroQuatro.nomeCientifico = JOptionPane.showInputDialog("Insira o nome científico do macaco");
        numeroQuatro.corPelo = JOptionPane.showInputDialog("Insira a cor do pelo");
        numeroQuatro.apelido = JOptionPane.showInputDialog("Insira o apelido");
        numeroQuatro.altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura"));
        numeroQuatro.peso = Float.parseFloat(JOptionPane.showInputDialog("Insira o peso"));
        numeroQuatro.reino = JOptionPane.showInputDialog("Insira o reino");
        numeroQuatro.filo = JOptionPane.showInputDialog("Insira o filo");
        numeroQuatro.classe = JOptionPane.showInputDialog("Insira a classe");
        numeroQuatro.ordem = JOptionPane.showInputDialog("Insira a ordem");
        numeroQuatro.familia = JOptionPane.showInputDialog("Insira a familia");
        numeroQuatro.genero = JOptionPane.showInputDialog("Insira o genero");
        numeroQuatro.especie = JOptionPane.showInputDialog("Insira a especie");
        numeroQuatro.sexo = JOptionPane.showInputDialog("Insira o sexo").charAt(0);
        numeroQuatro.idade = Byte.parseByte(JOptionPane.showInputDialog("Insira a idade"));

        Macaco numeroCinco = new Macaco();
        numeroCinco.nome = JOptionPane.showInputDialog("Insira o nome do macaco");
        numeroCinco.nomeCientifico = JOptionPane.showInputDialog("Insira o nome científico do macaco");
        numeroCinco.corPelo = JOptionPane.showInputDialog("Insira a cor do pelo");
        numeroCinco.apelido = JOptionPane.showInputDialog("Insira o apelido");
        numeroCinco.altura = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura"));
        numeroCinco.peso = Float.parseFloat(JOptionPane.showInputDialog("Insira o peso"));
        numeroCinco.reino = JOptionPane.showInputDialog("Insira o reino");
        numeroCinco.filo = JOptionPane.showInputDialog("Insira o filo");
        numeroCinco.classe = JOptionPane.showInputDialog("Insira a classe");
        numeroCinco.ordem = JOptionPane.showInputDialog("Insira a ordem");
        numeroCinco.familia = JOptionPane.showInputDialog("Insira a familia");
        numeroCinco.genero = JOptionPane.showInputDialog("Insira o genero");
        numeroCinco.especie = JOptionPane.showInputDialog("Insira a especie");
        numeroCinco.sexo = JOptionPane.showInputDialog("Insira o sexo").charAt(0);
        numeroCinco.idade = Byte.parseByte(JOptionPane.showInputDialog("Insira a idade"));

        JOptionPane.showMessageDialog(null,
         "MACACO PREGO"
         +"\nNome: "+prego.nome
         +"\nNome Cientifico: "+prego.nomeCientifico
         +"\nCor Pelo: "+prego.corPelo
         +"\nApelido: "+prego.apelido
         +"\nAltura: "+prego.altura
         +"\nPeso: "+prego.peso
         +"\nReino: "+prego.reino
         +"\nFilo: "+prego.filo
         +"\nClasse: "+prego.classe
         +"\nOrdem: "+prego.ordem
         +"\nFamilia: "+prego.familia
         +"\nGenero: "+prego.genero
         +"\nEspecie: "+prego.especie
         +"\nSexo: "+prego.sexo
         +"\nIdade: "+prego.idade);
        
        JOptionPane.showMessageDialog(null,
         "GORILA"
         +"\nNome: "+gorila.nome
         +"\nNome Cientifico: "+gorila.nomeCientifico
         +"\nCor Pelo: "+gorila.corPelo
         +"\nApelido: "+gorila.apelido
         +"\nAltura: "+gorila.altura
         +"\nPeso: "+gorila.peso
         +"\nReino: "+gorila.reino
         +"\nFilo: "+gorila.filo
         +"\nClasse: "+gorila.classe
         +"\nOrdem: "+gorila.ordem
         +"\nFamilia: "+gorila.familia
         +"\nGenero: "+gorila.genero
         +"\nEspecie: "+gorila.especie
         +"\nSexo: "+gorila.sexo
         +"\nIdade: "+gorila.idade);
        
        JOptionPane.showMessageDialog(null,
         "ORANGOTANGO"
         +"\nNome: "+orangotango.nome
         +"\nNome Cientifico: "+orangotango.nomeCientifico
         +"\nCor Pelo: "+orangotango.corPelo
         +"\nApelido: "+orangotango.apelido
         +"\nAltura: "+orangotango.altura
         +"\nPeso: "+orangotango.peso
         +"\nReino: "+orangotango.reino
         +"\nFilo: "+orangotango.filo
         +"\nClasse: "+orangotango.classe
         +"\nOrdem: "+orangotango.ordem
         +"\nFamilia: "+orangotango.familia
         +"\nGenero: "+orangotango.genero
         +"\nEspecie: "+orangotango.especie
         +"\nSexo: "+orangotango.sexo
         +"\nIdade: "+orangotango.idade);
        
        JOptionPane.showMessageDialog(null,
         "MACACO QUATRO"
         +"\nNome: "+numeroQuatro.nome
         +"\nNome Cientifico: "+numeroQuatro.nomeCientifico
         +"\nCor Pelo: "+numeroQuatro.corPelo
         +"\nApelido: "+numeroQuatro.apelido
         +"\nAltura: "+numeroQuatro.altura
         +"\nPeso: "+numeroQuatro.peso
         +"\nReino: "+numeroQuatro.reino
         +"\nFilo: "+numeroQuatro.filo
         +"\nClasse: "+numeroQuatro.classe
         +"\nOrdem: "+numeroQuatro.ordem
         +"\nFamilia: "+numeroQuatro.familia
         +"\nGenero: "+numeroQuatro.genero
         +"\nEspecie: "+numeroQuatro.especie
         +"\nSexo: "+numeroQuatro.sexo
         +"\nIdade: "+numeroQuatro.idade);
        
        JOptionPane.showMessageDialog(null,
         "MACACO CINCO"
         +"\nNome: "+numeroCinco.nome
         +"\nNome Cientifico: "+numeroCinco.nomeCientifico
         +"\nCor Pelo: "+numeroCinco.corPelo
         +"\nApelido: "+numeroCinco.apelido
         +"\nAltura: "+numeroCinco.altura
         +"\nPeso: "+numeroCinco.peso
         +"\nReino: "+numeroCinco.reino
         +"\nFilo: "+numeroCinco.filo
         +"\nClasse: "+numeroCinco.classe
         +"\nOrdem: "+numeroCinco.ordem
         +"\nFamilia: "+numeroCinco.familia
         +"\nGenero: "+numeroCinco.genero
         +"\nEspecie: "+numeroCinco.especie
         +"\nSexo: "+numeroCinco.sexo
         +"\nIdade: "+numeroCinco.idade);
    }
}
