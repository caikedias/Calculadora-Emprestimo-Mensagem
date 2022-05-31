package BootcampJava;

import static BootcampJava.Mensagem.mensagemBomDia;
import static BootcampJava.Mensagem.obterMensagem;

public class Main {

    public static void main(String[] args) {

        //Calculadora

        System.out.println("Exercicio Calculadora");
        Calculadora.soma(5, 5);
        Calculadora.subtracao(8, 4);
        Calculadora.multiplicacao(10, 3);
        Calculadora.divisao(8, 3);

        // Mensagem

        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(2);

       // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);



    }
}
