package desafios.diversos;

/*
DESAFIO 1)
Faça um programa que simule um lançamento de dados (números aleatórios de 1 a 5).
Lance o dado 100 vezes e armazene em uma lista.
Mostre no console quantas vezes cada valor foi inserido.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Desafio1 {
    public static void main(String[] args) {
        Random rdn = new Random(); //para gerar os nums aleatórios
        int lancamentos = 100; //quantidade de lançamentos
        List<Integer> listaDeDados = new ArrayList<>(); //lista para armazenar os dados

        for (int i = 0; i < lancamentos; i++) {
            listaDeDados.add(rdn.nextInt(5) + 1); //adicionando os dados gerados na lista
        }
        System.out.println(listaDeDados);

        Map<Integer, Integer> contagemDosDados = new HashMap<>(); //Map para armazenar chave|valor

        for (Integer dado : listaDeDados) { //iterando a lista de dados
            if (!contagemDosDados.containsKey(dado)) {
                contagemDosDados.put(dado, 1);
            } else {
                contagemDosDados.put(dado, contagemDosDados.get(dado) + 1);
            }
        }

        /* Lógica do IF acima:
            Se o Map (contagemDeDados) NÃO contiver a chave dado, acrescente esse dado como chave e o valor como 1;
            Se o Map contiver a chave dado, mantenha a chave e acrescente +1 ao valor.
        */

        System.out.println(contagemDosDados);
    }
}
