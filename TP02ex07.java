import java.util.Scanner;
class TP02ex07
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    /*7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/
   
    public static void main(String[] args) 
    {
   
        int i,j;
        Double[][] matriz1 =  new Double[3][4];
        Double[][] matriz2 =  new Double[3][4];
        Double multi;
        Scanner ler = new Scanner(System.in);
        for(i=0; i <=2;i++)
        {
            for(j=0; j<=3;j++)
            {
                System.out.print("Digite um valor para armazenar na posicao ["+ (i) + "]["+(j)+"]:  "   );
                matriz1[i][j] = Double.parseDouble(ler.nextLine());
            }
        }
        System.out.print("Digite um valor para multiplicar cada valor da Matriz: " );
        multi = Double.parseDouble(ler.nextLine());
        for(i=0; i <=2;i++)
        {
            for(j=0; j<=3;j++)
            {
               matriz2[i][j] =  matriz1[i][j] * multi;
            }
        }
        for(i=0; i <=2;i++)
        {
            System.out.print("| ");
            for(j=0; j<=3;j++)
            {
                 System.out.print(matriz2[i][j]+"  ");
                
            }
            System.out.print(" |\n");
        }
        
    }
}
