package com.aulaexceptions.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.util.ExceptionTypeFilter;

public class Menu {

    /**
     * 
     */
    public static void menu() {
        ArrayList<String> nomes = new ArrayList<>(3);

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        nomes.add("Lucas");
        nomes.add("Eloisa");
        nomes.add("Enzo");
        do {
            System.out.println(" 1) ver lista;");
            System.out.println(" 2)");
            System.out.println(" 3)");
            System.out.print("escolha uma opção:");

            opcao = sc.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        try {
                            int i = 0;
                            for (String nom : nomes) {
                                System.out.println((i + 1) + "-" + nom);
                                i++;
                            }
                            System.out.print("escolha um index:");
                            int num = sc.nextInt();
                            System.out.println(nomes.get((num - 1)));
                        } catch (Exception e) {
                            System.out.println("Erro: Index incorreto!");
                            menu();
                        }
                        break;
                    case 2:
                        System.out.println("opção 2");
                        break;
                    case 3:
                        System.out.println("opção 3");
                        break;
                    default:
                        System.out.println("opção invalida!");
                        break;

                }
            } catch (Exception e) {
                System.out.println("Erro: Não é possivel operar uma String, tente novamente;");
                menu();

            }

        } while (opcao < 1 || opcao > 3);

    }

}
