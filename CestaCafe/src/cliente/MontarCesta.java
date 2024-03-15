package cliente;

import composicao.*;

/**
 *
 * @author talita.bsouza7
 */
public class MontarCesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando a cesta
        Composicao cesta = new Composicao("Cesta de café da manhã");

        //Criar os produtos
        Componente p1 = new Folha("pão de queijo", 4.21);
        Componente p2 = new Folha("café solúvel", 5.12);
        Componente p3 = new Folha("leite", 6.99);
        //Adicionando produtos a cesta
        cesta.adicionar(p1);
        cesta.adicionar(p2);
        cesta.adicionar(p3);
        //Criando bombom
        Componente p4 = new Folha("Maracujá", 2.45);
        Componente p5 = new Folha("Cereja", 4.71);
        Componente p6 = new Folha("Morango", 1.71);
        //Criando caixa de bombom
        Componente caixa = new Composicao("Caixa de bombons");
        //Adicionando os bombons na caixa
        caixa.adicionar(p4);
        caixa.adicionar(p5);
        caixa.adicionar(p6);
        //Adicionando a caixa na cesta
        cesta.adicionar(caixa);
        System.out.println("Produtos " + cesta);
        System.out.println("Total: " + cesta.getPreco());
    }
}
