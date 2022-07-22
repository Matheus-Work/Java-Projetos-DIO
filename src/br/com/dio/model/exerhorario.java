package br.com.dio.model;

public class exerhorario {
    public static void horas(int hora) {
        //meu teste para os horários
        if (hora >= 5 && hora <=11){
            mensagemBomDia();
        }
        if (hora >=12 && hora <=18){
            mensagemBoaTarde();
        }
        if (hora >=19 && hora <=24){
            mensagemBoaNoite();
        }
        if (hora >=1 && hora < 5){
            mensagemBoaNoite();
        }
    }
    public static void mensagemBomDia(){
        System.out.println("Bom dia");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite");
    }
}



