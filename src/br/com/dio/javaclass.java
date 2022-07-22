package br.com.dio;
import br.com.dio.model.operacoes;
import br.com.dio.model.banco;
import br.com.dio.model.exerhorario;
public class javaclass {
    public static void main(String[] args) {
        System.out.println("Exercicio Calculadora");
        operacoes.soma(4,6);
        operacoes.subtraçao(4,6);
        operacoes.multiplicação(4,6);
        operacoes.divisao(4,6);

        System.out.println("Exercicio Horário");
        exerhorario.horas(19);

        System.out.println("Exercicio Banco");
        banco.emprestimo(12,500);
    }

}



