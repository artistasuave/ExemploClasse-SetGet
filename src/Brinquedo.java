
/**
 * @author Alunos
 */
public class Brinquedo {

    private String nome, marca, modelo, descricao;
    private double preco;
    private short codigo;
    private long codigoBarras;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }
}
