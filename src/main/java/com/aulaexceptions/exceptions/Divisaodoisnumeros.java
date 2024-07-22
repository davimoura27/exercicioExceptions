package com.aulaexceptions.exceptions;

import java.util.Scanner;

public class Divisaodoisnumeros {

    public static void divisaodoisnumeros() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("digite um numero:");
            int numero = sc.nextInt();
            System.out.print("Digite o divisor:");
            int divisor = sc.nextInt();
            int resultado = numero / divisor;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possivel dividir por zero");
          divisaodoisnumeros();
        } catch (Exception e) {
            System.out.println("ocorreu um erro: Não é possivel operar uma letra" );
            divisaodoisnumeros();
        }

    }

}
