/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.placa_veicular;
import java.util.Scanner;
/**
 *
 * @author CT Desenvolvimento
 */
public class Placa_Veicular {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a sua placa:");
        String placa = entrada.next().toUpperCase();
        
        if (placa.length() == 7){
            if(placa.substring(0, 3).matches("[A-Z]*")){
                if(placa.substring(3, 7).matches("[0-9]*")){
                    System.out.println("Placa válida");
                }
               else{
                   System.out.println("Placa inválida, verifique os 4 últimos digitos");
                }
            }
            else{
                System.out.println("Placa inválida, verifique os 3 primeiros digitos");
            }
        }
            
        else{
            System.out.println("Placa inválida");
        }
    }
}
