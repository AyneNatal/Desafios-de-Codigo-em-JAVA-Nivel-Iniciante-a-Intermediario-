package desafios.diversos;

/*
DESAFIO 16) ArrayList e ordenação

    1. Crie uma classe chamada Cachorro que receba nome, cor e idade em meses.
    2. Crie uma classe Principal (Main) para testar e executar as seguintes tarefas:
        * Um ArrayList com pelo menos 5 cachorros da classe Cachorro;
        * Mostre no console a lista de cachorros (os elementos e não a referência);
        * Ordene os cachorros pelo nome e mostre no console;
        * Deixe a Lista embaralhada a lista.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {

        // * Um ArrayList com pelo menos 5 cachorros da classe Cachorro;
        List<Cachorro> cachorros = new ArrayList<>(){
            {
                add(new Cachorro("Totóia", "preto", 13));
                add(new Cachorro("Caramelo", "amarelo", 28));
                add(new Cachorro("Kyra", "malhada (preto e branco)", 32));
                add(new Cachorro("Istrupiçu", "malhado(marrom e branco)", 5));
                add(new Cachorro("Branquinha", "branco", 24));
            }
        };

        // * Mostre no console a lista de cachorros (os elementos e não a referência);
        System.out.println("Lista Criada: " + cachorros); //sobrescrevi o toString na classe Cachorro

        // * Ordene os animais pelo nome e mostre no console.
        Collections.sort(cachorros); //implementei Comparable na classe Cachorro e sobrescrevi o met comprateTo()
        System.out.println("\nLista Ordenada por Nome: " + cachorros);

        // * Deixe a Lista embaralhada a lista.
        Collections.shuffle(cachorros);
        System.out.println("\nLista Embaralhada: " + cachorros);
    }
}


//VOU COLOCAR A CLASSE CACHORRO NO MSM ARQUIVO PARA FACILITAR A VISUALIZAÇÃO:
class Cachorro implements Comparable<Cachorro> {
    String nome;
    String cor;
    int idadeEmMeses;

    public Cachorro(String nome, String cor, int idadeEmMeses) {
        this.nome = nome;
        this.cor = cor;
        this.idadeEmMeses = idadeEmMeses;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdadeEmMeses() {
        return idadeEmMeses;
    }

    public void setIdadeEmMeses(int idadeEmMeses) {
        this.idadeEmMeses = idadeEmMeses;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idadeEmMeses=" + idadeEmMeses +
                '}';
    }

    @Override
    public int compareTo(Cachorro doguinho) {
        return this.getNome().compareToIgnoreCase(doguinho.getNome());
    }
}
