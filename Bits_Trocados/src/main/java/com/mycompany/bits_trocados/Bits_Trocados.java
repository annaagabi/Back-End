/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bits_trocados;
import java.util.Scanner;

/*As Ilhas Weblands formam um reino independente nos mares do Pacífico. Como é 
um reino recente, a sociedade é muito influenciada pela informática. A moeda 
oficial é o Bit; existem notas de B$ 50,00, B$10,00, B$5,00 e B$1,00. Você foi 
contratado(a) para ajudar na programação dos caixas automáticos 
de um grande banco das Ilhas Weblands.

**Tarefa**

Os caixas eletrônicos das Ilhas Weblands operam com todos os tipos de notas 
disponíveis, mantendo um estoque de cédulas para cada valor (B$ 50,00, B$10,00,
B$5,00 e B$1,00). Os clientes do banco utilizam os caixas eletrônicos para 
efetuar retiradas de um certo número inteiro de Bits. Sua tarefa é escrever um 
programa que, dado o valor de Bits desejado pelo cliente, determine o número de
cada uma das notas necessário para totalizar esse valor, de modo a minimizar a 
quantidade de cédulas entregues. Por exemplo, se o cliente deseja retirar 
B$50,00, basta entregar uma única nota de B$50,00 Bits. Se o cliente deseja 
retirar B$72,00, é necessário entregar uma nota de B$50,00, duas de B$10,00 e 
duas de B$1,00. 
A entrada é composta de vários conjuntos de teste. Cada conjunto
de teste é composto por uma única linha, que contém um número inteiro positivo 
V, que indica o valor solicitado pelo cliente. O final da entrada é indicado 
por V = 0.
 */

public class Bits_Trocados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean a = true;
        int notas []= {50, 10, 5, 1};
        int ntotal []= {0, 0, 0, 0};
        int cont = 0;
        
        while(a){
            System.out.println("\nDigite 0 para encerrar o programa!");
            System.out.println("Digite o valor que deseja sacar:");
            int valor = entrada.nextInt();

            if(valor == 0){
                System.out.println("Valor inválido\n");
                break;
            }
            cont++;
        
            for(int i=0;i<4;i++){
                ntotal[i] = valor/(notas[i]);
                valor = valor%notas[i];
                }
            System.out.println("Programa: " +  cont);
            System.out.println("Notas de B$50,00: " + ntotal[0]);
            System.out.println("Notas de B$10,00: " + ntotal[1]);
            System.out.println("Notas de B$05,00: " + ntotal[2]);
            System.out.println("Notas de B$01,00: " + ntotal[3]);
            //System.out.println(ntotal[0+"\n" + ntotal[1] +"\n"+ ntotal[2] +"\n"+ ntotal[3]+"\n");    
        }
    }
}
