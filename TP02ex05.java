import java.util.Scanner;
class TP02ex05
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
   
    public static void main(String[] args) 
    {
        int i,j;
        Double[][] num =  new Double[3][2];
        Scanner ler = new Scanner(System.in);
        for(i=0; i<3;i++)
        {
            for(j=0; j<2;j++)
            {
                System.out.print("Digite um valor para armazenar na posicao ["+ (i) + "]["+(j)+"]:  "   );
                num[i][j] = Double.parseDouble(ler.nextLine());
            }
        }  
        System.out.print("\nMATRIZ [3][2] \n|" + num[0][0]  +"  " + num[0][1] +"|\n|"+ num[1][0]+ " " + num[1][1]  +"|\n|" + num[2][0] +"  "+ num[2][1] +"|");
        
    }
}
