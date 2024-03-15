package composicao;

/**
 *
 * @author talita.bsouza7
 */
public class Folha implements Componente {

    private String nome;
    private double preco;

    public Folha(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Folha{" + "nome=" + nome + ", preco=" + preco + '}';
    }

    @Override
    public void adicionar(Componente p4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
