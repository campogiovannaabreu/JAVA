/*
Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
*/
public class Matriz04
{
	public static void main(String[] args) {
    int linha =3, coluna =3;
        int[][] matriz = {
                {10, 26, 6},
                {17, 16, 42},
                {27, 30, 13}
        };
        
            diss(matriz);
            
            int[][] transposta = new int [coluna][linha];
            for (int i = 0; i < linha; i++){
                 for (int j = 0; j < coluna; j++){
                     transposta[j][i] = matriz [i][j];
                 }
            }
            
            diss(transposta);
        }
        
        public static void diss(int[][] matriz) {
            System.out.println("A matriz é: ");
            for(int[] linha : matriz){
                for (int coluna : linha){
                    System.out.print(coluna + "     ");
                }
                System.out.println();
            }
        }
    }