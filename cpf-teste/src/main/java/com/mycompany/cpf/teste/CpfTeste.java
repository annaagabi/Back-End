/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cpf.teste;
import java.util.Scanner;

/**
 *
 * @author CT Desenvolvimento
 */
public class CpfTeste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int peso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int peso1[] = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        System.out.println("Digite o seu CPF:");
        String cpf = entrada.next();

        if (cpf.length() == 11) {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma += digito * peso[i];
            }
            
            int verif = soma % 11;
            if (verif < 2) {
                verif = 0;
            } else {
                verif = 11 - verif;
            }
            
            int soma1 = 0;
            for (int x = 0; x < 10; x++) {
                int digito1 = Character.getNumericValue(cpf.charAt(x));
                soma1 += digito1 * peso1[x];
            }
            
            int verif1 = soma1 % 11;
            if (verif1 < 2) {
                verif1 = 0;
            } else {
                verif1 = 11 - verif1;
            }
            
            if (Character.getNumericValue(cpf.charAt(9)) == verif && Character.getNumericValue(cpf.charAt(10)) == verif1) {
                System.out.println("CPF válido");
            } else {
                System.out.println("CPF inválido!");
            }
        } else {
            System.out.println("CPF inválido. Deve ter 11 dígitos.");
        }
    }
}
