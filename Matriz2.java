/*
Matriz 4x4 já preenchida 
*/
public class Matriz2
{
    public static void main(String[] args) {
    //criando matriz 3x3 vazia     
    int [][] matriz = new int [4][4];
    
    //Atribuindo valores manualmente 
    matriz[0][0] = 5;
    matriz[0][1] = 3;
    matriz[0][2] = 2;
    matriz[0][3] = 6;
    
    matriz[1][0] = 4;
    matriz[1][1] = 3;
    matriz[1][2] = 6;
    matriz[1][3] = 8;
    
    matriz[2][0] = 7;
    matriz[2][1] = 8;
    matriz[2][2] = 1;
    matriz[2][3] = 3;
    
    matriz[3][0] = 7;
    matriz[3][1] = 8;
    matriz[3][2] = 1;
    matriz[3][3] = 4;
    
    // Imprimindo a matriz 
    System.out.println("Matriz 4x4:");
    //tamanho da matriz principal (linha) matriz.length 
    for (int i = 0; i < matriz.length; i++) { 
        //tamanho da matriz (coluna) matriz[i].length 
         for (int j = 0; j < matriz[i].length; j++) { 
             //saida da matriz (matriz [i][j])
             System.out.print (matriz [i][j] + " "); 
             
         }    
         //quebra de linha apos cada linha da matriz 
        System.out.println(); 
    
    }
}
}