import java.util.Scanner;

public class TP02ex08 {
//Gabriel Kenji Utiyama CB3012069
// Gustavo Barbosa da Silva CB3010627

//EXERCICIO - 8
// Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
// digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
// valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
// correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
// colunas.
    
    public static void main(String[] args) {
        
        int i,j;
        Double[][] num =  new Double[3][4];
        Double[][] numres =  new Double[3][4];
        Double mult;
        Scanner ler = new Scanner(System.in);
        for(i=0; i <=2;i++)
        {
            for(j=0; j<=3;j++)
            {
                System.out.print("Digite um Numero para armazenar na posicao ["+ (i) + "]["+(j)+"]:  "   );
                num[i][j] = Double.parseDouble(ler.nextLine());
            }
        }
        System.out.print("Digite um numero para multiplicar cada valor da Matriz: "   );
        mult = Double.parseDouble(ler.nextLine());
        for(i=0; i <=2;i++)
        {
            for(j=0; j<=3;j++)
            {
                
                numres[i][j] =  num[i][j] * mult;
            }
        }
        

        for(i=0; i <=2;i++)
        {
            System.out.print("| ");
            for(j=0; j<=3;j++)
            {
                 System.out.print(numres[i][j]+"  ");
                
            }
            System.out.print(" |\n");
        }
        
    }
    
}
