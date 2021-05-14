import java.util.Scanner;

public class TP02ex06 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

//EXERCICIO - 6
//Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
    
    public static void main(String[] args) {
        
        int i,j;
        String[][] num =  new String[2][3];
        Scanner ler = new Scanner(System.in);
        for(i=0; i <=1;i++)
        {
            for(j=0; j<=2;j++)
            {
                System.out.print("Digite um Nome para armazenar na posicao ["+ (i) + "]["+(j)+"]:  "   );
                num[i][j] = ler.nextLine();
            }
        }  
        System.out.print("\nMATRIZ [2][3] \n|" + num[0][0]  +"  " + num[0][1] +"  "+ num[0][2] + "|\n|" + num[1][0]  +"  " + num[1][1] +"  "+ num[1][2] +"|");
        
    }
    
}
