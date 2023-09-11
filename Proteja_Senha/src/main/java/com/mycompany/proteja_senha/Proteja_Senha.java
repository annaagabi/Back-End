/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proteja_senha;
import java.util.Scanner;

/*Por questões de segurança, muitos bancos hoje em dia estão alterando a forma 
como seus clientes digitam as senhas nos caixas eletrônicos, pois alguém pode 
postar-se atrás do cliente e ver as teclas à medida em que ele as digita.
Uma alternativa bastante utilizada tem sido associar os dez dígitos a cinco 
letras, de forma que cada letra esteja associada a dois dígitos, conforme o 
exemplo abaixo.

A = [1,7]; B = [3, 9]; C = [0, 8]; D = [5, 6]; E = [2, 4]

As associações entre números e letras são mostradas como botões numa tela 
sensível ao toque, permitindo que o cliente selecione os botões correspondentes
à senha. Considerando a disposição dos botões da figura acima, a senha 384729 
seria digitada como BCEAEB (note que a mesma sequência de letras seria digitada
para outras senhas, como por exemplo 982123).
Cada vez que o cliente usa o caixa eletrônico, as letras utilizadas são as 
mesmas (de ‘A’ a ‘E’), com os botões nas mesmas posições, mas os dígitos são 
trocados de lugar. Assim, caso um intruso veja (mesmo que mais de uma vez) a 
sequência de letras digitada, não é possível notar facilmente qual a senha do 
cliente do banco.

Tarefa
Dada uma sequência de associações entre letras e números, e as letras digitadas 
pelo cliente do banco para cada uma dessas associações, você deve escrever um 
programa para determinar qual é a senha do cliente
 */
public class Proteja_Senha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("Digite a sua senha");
            int senha = entrada.nextInt();
            String s = Integer.toString(senha);
            

            if (s.length() == 6){
                for (int i = 1; i <=6 ; i++){
                        s = s.replace("1","A");
                        s = s.replace("7","A");
                        
                        s = s.replace("3","B");
                        s = s.replace("9","B");
                        
                        s = s.replace("0","C");
                        s = s.replace("8","C");
                        
                        s = s.replace("5","D");
                        s = s.replace("6","D");
                        
                        s = s.replace("2","E");
                        s = s.replace("4","E");
                }
                
                System.out.println("Nova senha: " + s);
            }
            
            else{
               System.out.println("Senha inválida!");       
            }    
    }
}
