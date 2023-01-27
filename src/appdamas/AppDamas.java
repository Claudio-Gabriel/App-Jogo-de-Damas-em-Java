/**
 * jogo de damas
 */
package appdamas;

import java.util.Scanner;

/**
 * classe responsável pela interface com usúario e fluxo de dados do app
 * @author Claudio RA: 215713, Felipe RA: 217339, Gabriel RA: 219857, Isabella RA: 227128, Paulo  RA: 221777, Vinicius RA: 198303
 */ 

public class AppDamas {
    
/** 
 * @param args método principal
 */
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
   
    Tabuleiro tabuleiro = new Tabuleiro();
    
    int jogo, peca;
    int linha3 = 0;
    int coluna3 = 0;
    
    // Impressão do Tabuleiro para visualização inicial
    tabuleiro.imprimirTabuleiro();
    
    System.out.println("Se deseja iniciar ou continuar o jogo digite '1' caso não '0': ");
    jogo = scan.nextInt();
    
    /**
     *  entrada de atributos 
     * @return void moverPeca
     */
    
    while(jogo == 1){
        
    System.out.println("Se deseja iniciar ou continuar o jogo digite '1' caso não '0': ");
    jogo = scan.nextInt();
    
    System.out.println("Informe a Peça pertencente a você informe 1 para B ou 2 para P: ");
    peca = scan.nextInt();
    
    System.out.println("Informe a posicao da peça que deseja movimentar: ");
    System.out.println("Informe a linha: ");
    int linha1 = scan.nextInt();
    System.out.println("Informe a coluna: ");
    int coluna1 = scan.nextInt();
    
    System.out.println("Agora informe a posicao que deseja colocalar a peça: ");
    System.out.println("Informe a linha: ");
    int linha2 = scan.nextInt();
    System.out.println("Informe a coluna: ");
    int coluna2 = scan.nextInt();
    
    System.out.println("Se é necessario eliminar uma peça digite 1, do contrario 0: ");
    int eliminar = scan.nextInt();
    
    if(eliminar == 1){
    System.out.println("Informe a posicao da peça que deseja eliminar: ");
    System.out.println("Informe a linha: ");
    linha3 = scan.nextInt();
    System.out.println("Informe a coluna: ");
    coluna3 = scan.nextInt();
    }
    
     /**
     * resposta a opção selecionada 
     */
    tabuleiro.moverPeca(linha1, coluna1, linha2, coluna2, peca, linha3, coluna3);
    
     }
    
    
    }
        
    }
    

