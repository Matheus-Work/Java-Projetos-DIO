package br.com.dio.model;

public class banco {
    public static void emprestimo(int meses, double valor) {
        double conta = valor*0.11;//55 por mes (taxa de juros de 11%)
        double tempo = meses * conta; //12*55 = 660
        double totalPagar = tempo + valor;// total a pagar 660 de juros + 500 valor solicitado
        double prestacoes = totalPagar / 12;
        System.out.println("Você vai ter que pagar " + prestacoes +" reais por mês \nE vai ter que pagar "+ totalPagar +" ao final de "+meses+" meses" );

    }
}
