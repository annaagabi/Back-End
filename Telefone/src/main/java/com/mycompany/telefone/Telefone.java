/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telefone;
import java.util.Scanner;

/*As primeiras redes públicas de telefonia foram construídas pela AT&T no começo 
do século XX. Elas permitiam que seus assinantes conversassem com a ajuda de uma
telefonista, que conectava as linhas dos assinantes com um cabo especial.Essas 
redes evoluíram muito desde então, com a ajuda de vários avanços tecnológicos. 
Hoje em dia, essas redes atendem centenas de milhões de assinantes; ao invés de
falar diretamente com uma telefonista, você pode simplesmente discar o número da
pessoa desejada no telefone.
Cada assinante recebe um número de telefone — por exemplo, 55–98–234–5678. 
Qualquer pessoa que discar esse número consegue então falar com a pessoa do 
outro lado da linha. Os hifens no número de telefone são só para facilitar a 
leitura, e não são discados no telefone.Para que fique mais fácil de se lembrar 
de um número de telefone, muitas companhias divulgam números que contém letras 
no lugar de dígitos. Para convertê-los de volta para dígitos, a maioria dos 
telefones tem letras nas suas teclas.

Ao invés de discar uma letra, disca-se a tecla que contém aquela letra. Por 
exemplo, se você quiser discar o número 0800–FALE–SBC, você na realidade 
discaria 0800–3253–722. A sua avó tem reclamado de problemas de vista — em 
particular, ela não consegue mais enxergar as letrinhas nas teclas do telefone, 
e por isso queria que você fizesse um programa que convertesse as letras em um 
número de telefone para dígitos.

Entrada
A entrada contém um único conjunto de testes, que deve ser lido do dispositivo 
de entrada padrão (normalmente o teclado). A entrada é composta de apenas uma 
linha, contendo o número de telefone que deve ser traduzido.
O número de telefone contém entre 1 e 15 caracteres, que podem ser letras de ‘A’
a ‘Y’.

Saída
Seu programa deve imprimir, na saída padrão, uma única linha, contendo o número 
de telefone com as letras convertidas para dígitos.

 */
public class Telefone {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String p = entrada.next().toUpperCase();
        
        if (p.length() <16){
            for(int i=0; i<p.length(); i++){
                
                //2
                p = p.replace("A","2");
                p = p.replace("B","2");
                p = p.replace("C","2");
                
                //3
                p = p.replace("D","3");
                p = p.replace("E","3");
                p = p.replace("F","3");
                
                //4
                p = p.replace("G","4");
                p = p.replace("H","4");
                p = p.replace("I","4");
                
                //5
                p = p.replace("J","5");
                p = p.replace("K","5");
                p = p.replace("L","5");
                
                //6
                p = p.replace("M","6");
                p = p.replace("N","6");
                p = p.replace("O","6");
                
                //7
                p = p.replace("P","7");
                p = p.replace("Q","7");
                p = p.replace("R","7");
                p = p.replace("S","7");
                
                //8
                p = p.replace("T","8");
                p = p.replace("U","8");
                p = p.replace("V","8");
                
                //9
                p = p.replace("W","9");
                p = p.replace("X","9");
                p = p.replace("Y","9");
                p = p.replace("Z","9");
                
            }
            System.out.println("Saída: " + p);
        }
        else{
            System.out.println("Palavra inválida");
        }
    }
}
