package composicao;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author talita.bsouza7
 */
public class Composicao implements Componente {

    private List<Componente> listaProdutos;
    private String nome;

    public Composicao(String nome) {

        listaProdutos = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        listaProdutos.add(componente);

    }

    public void remover(Componente componente) {
        listaProdutos.remove(componente);

    }

    @Override
    public double getPreco() {
        double total = 0;
//variável que vai percorrer a lista começando do 0 ao final
        for (Componente c : listaProdutos) {
            total += c.getPreco();
        }
        return total;
    }

//implementando toString da classe Object
    @Override
    public String toString() {
        return "Composicao{" + "listaProdutos=" + listaProdutos + ", nome=" + nome + '}';
    }

}
