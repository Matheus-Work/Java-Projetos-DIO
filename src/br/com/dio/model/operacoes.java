package br.com.dio.model;

import java.util.Objects;

public class operacoes {
   public static void soma ( double numero1, double numero2) {
       double resultado = numero1 + numero2;
       System.out.println("soma é: "+resultado);
   }public static void subtraçao ( double numero1, double numero2) {
       double resultado = numero1 - numero2;
       System.out.println("subtração é: "+resultado);
   }public static void multiplicação( double numero1, double numero2) {
       double resultado = numero1 * numero2;
       System.out.println("multiplicação é: "+resultado);
   }public static void divisao ( double numero1, double numero2) {
       double resultado = numero1 / numero2;
       System.out.println("divisão é: "+resultado);
   }
}
