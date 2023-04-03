package Lista3;

import java.util.Scanner;
import java.util.Random;

/*Faça um programa onde você consiga jogar joquempô com o computador seguindo as seguintes regras:

· Crie um menu para que o jogador escolha uma dessas duas opções: 0 – Pedra | 1 – Papel | 2 – Tesoura

· O jogador deve escolher uma opção e o jogador também, após a escolha dos dois mostre a mensagem de quem ganhou

· O jogo deve acontecer 3 vezes e após o término das três partidas o programa deve mostrar o placar a avisar quem ganhou. */
public class ex5 {

    private static Scanner sc;

    public static void main(String[] args) {
        
        sc = new Scanner (System.in);
        int game, i, maqui = 0, contP = 0, contM = 0;
        Random novo = new Random();

        System.out.println("\n----- VAMOS JOGAR JOKENPO! ------\n");

        for (i = 0; i < 3; i++) 
        {
            System.out.println("*RODADA " + (i+1) +"*");
            System.out.println("Escolha uma das opcoes: 0 - Pedra, 1 - Papel, 2 - Tesoura");
            
             game = sc.nextInt();
           
           switch (game) {
            
           case 0:
               System.out.println("\n(VOCE) 0 - Pedra");
           break;
           case 1:
               System.out.println("\n(VOCE) 1 - Papel");
               break;
           case 2:
               System.out.println("\n(VOCE) 2 - Tesoura");
               break;
           
           default:
               System.out.println("\n(VOCE) Opçao invalida! Perdeu a rodada!");
            }
            
           
           
           maqui = novo.nextInt(3);
           switch (maqui) 
           {
           case 0:
               System.out.println("(BOT)  0 - Pedra");
           break;
           case 1:
               System.out.println("(BOT)  1 - Papel");
               break;
           case 2:
               System.out.println("(BOT)  2 - Tesoura");
               break;

           }   
            if (maqui == game) 
            {
                System.out.println("\nRodada " + (i+1) + " empatou!\n");
                System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");

            }
               else if (maqui == 0 && game == 1)
               {
                   System.out.println("\nJogador venceu a rodada " + (i+1) + "!\n");
                   contP++;
                   System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");

               }
               else if (maqui == 1 && game == 2)
               {
                   System.out.println("\nJogador venceu a rodada " + (i+1) + "!\n");
                   contP++;
                   System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");

                }
               else if (maqui == 2 && game == 0)
               {
                   System.out.println("\nJogador venceu a rodada " + (i+1) + "!\n");
                   contP++;
                   System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");

               }
               else
               {
                   System.out.println("\nComputador venceu a rodada " + (i+1) + "!\n");
                   contM++;
                   System.out.println("\n--------------------------------------------------------------------------------------------------------------------\n");

               }
       }
        if(contP > contM)
        {
            System.out.println("\nJOGADOR GANHOU A PARTIDA! >:(");
        }
        else if (contP < contM)
        {
            System.out.println("\nCOMPUTADOR GANHOU A PARTIDA! :D");
        }
        else {
            System.out.println("\nPARTIDA EMPATADA!");
        }
        System.out.println("\n\nPLACAR FINAL: \nJogador: " + contP + "\nComputador: " + contM );
        
       sc.close();
              
   }
   
}

