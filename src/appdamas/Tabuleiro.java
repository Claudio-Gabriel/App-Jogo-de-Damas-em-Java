package appdamas;

/**
 * classe responsável pela funcionalidade e jogabilidade do app
 * 
 * @author Claudio,Felipe,Gabriel,Isabella,Paulo,Vinicius
 */

public class Tabuleiro {
    
    
    char matriz[][];
    int tamanho;
    int linha1, coluna1, linha2, coluna2, linha3, coluna3;
    int li1, col1, li2, col2, pecaUsada;

    //construtor
    
    public Tabuleiro(){
        tamanho = 8;
        matriz = new char[tamanho][tamanho];
        
    }
   
    
    void imprimirTabuleiro(){
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matriz[i][j] = '-';
            }
        }
        
        colocarPeçasIniciais();
        
        
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
             
    }
    
    
    
    /**
     * indicadores das posições das peças
     * @return  void colocarPeçasIniciais
     */
    
    void colocarPeçasIniciais(){
        //Posição inicial peça Branca
        matriz[0][1] = 'B';
        matriz[0][3] = 'B';
        matriz[0][5] = 'B';
        matriz[0][7] = 'B';
        matriz[1][0] = 'B';
        matriz[1][2] = 'B';
        matriz[1][4] = 'B';
        matriz[1][6] = 'B';
        matriz[2][1] = 'B';
        matriz[2][3] = 'B';
        matriz[2][5] = 'B';
        matriz[2][7] = 'B';
       
        // Peça Preta
        matriz[5][0] = 'P';
        matriz[5][2] = 'P';
        matriz[5][4] = 'P';
        matriz[5][6] = 'P';
        matriz[6][1] = 'P';
        matriz[6][3] = 'P';
        matriz[6][5] = 'P';
        matriz[6][7] = 'P';
        matriz[7][0] = 'P';
        matriz[7][2] = 'P';
        matriz[7][4] = 'P';
        matriz[7][6] = 'P';
        
    }
    
     /**
     * 
     * reliza o movimento das peças através dos indicadores de linha e coluna
     * envolvendo ou não determinada peça
     * 
     * @param a indicador parâmetro da linha dos espaços entre as  peça
     * @param b indicador parâmetro dacoluna espaços entreas peça
     * @param c indicador parâmetro da linha dos movimentos da peça
     * @param d indicador parâmetro da coluna dos movimentos da peça
     * @param e indicador da peça selecionada
     * @param f indicador parâmetro da linha de peça selecionada para eliminar
     * @param g indicador parâmetro da coluna de peça selecionada para eliminar
     */
    
    void moverPeca(int a, int b, int c, int d, int e, int f, int g){
        linha1 = a;
        coluna1 = b;
        linha2 = c;
        coluna2 = d;
        pecaUsada = e;
        linha3 = f;
        coluna3 = g;
        
        for(int i = 0; i < tamanho;i++){
            for(int j = 0; j < tamanho; j++){
                
                //Movimentação basica da peça
                if(i == linha1 && j == coluna1){
                    System.out.print(matriz[i][j] = '-');
                } 
                else if (i == linha2 && j == coluna2){
                    if(pecaUsada == 1){
                        System.out.print(matriz[i][j] = 'B');
                    }else{
                        System.out.print(matriz[i][j] = 'P');
                    }
                }
                else if(i == linha3 && j == coluna3){
                    System.out.print(matriz[i][j] = '-');
                }
                else{
                    System.out.print(matriz[i][j]);
                }
                
            }
            System.out.println("");
        }
        
}
    
}
    
   


