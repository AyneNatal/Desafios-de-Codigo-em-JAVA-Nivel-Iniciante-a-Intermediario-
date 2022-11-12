package desafios.diversos;

/*
DESAFIO 3)
Criar uma classe chamada PRODUTO que tenha os atributos NOME, VALOR e DESCONTO, a partir dessa classe faça:
    => Calcule o preço final de um produto levando em consideração:

    1. O desconto aplicado;
    2. Incluir o Imposto Municipal: Se o valor do produto for acima de 2000, taxar com 5.5%. Se o valor for inferior, isentar;
    3. Calcular o Frete: valor acima de 1000, frete gratis. Valor abaixo de 1000, frete 35 reais;
    4. Formatar a saída (console) para o padrão R$1234,56.
    //ATENÇÃO: Resolva o desafio utilizando Interfaces Funcionais na ordem pedida acima//

    => Use para testar:
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse Logitech", 320.00, 0.10); //resultado: $323.00
        Produto p2 = new Produto("MacBook Air", 8000, 0.10);      //resultado: $7,596.00
    }
*/

import java.text.NumberFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio3 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse Logitech", 320.00, 0.10);
        Produto p2 = new Produto("MacBook Air", 8000, 0.10);

        //1. Calcular o Desconto:
        BinaryOperator<Double> valorComDesconto = (valor, desconto) -> valor * (1 - desconto);

        //2. Calcular o Imposto:
        UnaryOperator<Double> valorComImpostos = valor -> valor > 2000 ? valor * (1 + 0.055) : valor;

        //3. Calcular o Frete:
        UnaryOperator<Double> valorComFrete = valor -> valor > 1000 ? valor : valor + 35;

        //4. Valor Formatado:
        Function<Double, String> valorFormatado = valor -> {
            NumberFormat formatarValor = NumberFormat.getCurrencyInstance();
            return formatarValor.format(valor);
        };

        //Gerando o preço final:
        System.out.println("Produto " + p1.getNome());
        System.out.println(
                "Preço Final do Produto:\n" + valorComDesconto
                        .andThen(valorComImpostos)
                        .andThen(valorComFrete)
                        .andThen(valorFormatado)
                        .apply(p1.getValor(), p1.getDesconto())
        );

        System.out.println("------------------------------------");

        System.out.println("Produto " + p2.getNome());
        System.out.println(
                "Preço Final do Produto:\n" + valorComDesconto
                        .andThen(valorComImpostos)
                        .andThen(valorComFrete)
                        .andThen(valorFormatado)
                        .apply(p2.getValor(), p2.getDesconto())
        );
    }
}

class Produto {
    private String nome;
    private double valor;
    private double desconto;

    public Produto(String nome, double valor, double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return desconto;
    }
}
