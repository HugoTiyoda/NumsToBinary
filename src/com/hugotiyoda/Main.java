package com.hugotiyoda;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Entrada de Valores
        System.out.println("Defina a quantidade de numeros para serem convertidos:");

        Integer[] numeros = new Integer[entrada.nextInt()];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Defina o valor do" + " " + i + "º" + "elemento:");
            numeros[i] = entrada.nextInt();
        }

        Integer[] conversao = numeros;
        //Exibicao e transformacao
        System.out.println("Valores requeridos: " + Arrays.toString(numeros));
        System.out.println("Representação binaria");
        for (int j = 0; j < conversao.length; j++) {
            System.out.print("[" + Integer.toBinaryString(conversao[j]) + "]");
        }

        entrada.close();
    }

}
