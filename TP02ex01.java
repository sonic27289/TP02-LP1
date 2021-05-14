import java.util.Scanner;
class TP02ex01 
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    //1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
   
    public static void main(String[] args) 
    {
        double n1, n2;
    
        Scanner ler = new Scanner(System.in);  
 
        System.out.println("Informe o valor 1: \n");
        n1 = Double.parseDouble(ler.nextLine());
        System.out.println("Informe o valor 2: \n");
        n2 = Double.parseDouble(ler.nextLine());
        while (n2 <= n1)
        {
            System.out.println("O valor 2 tem que ser maior que o valor 1 ! \n");
            System.out.println("Informe o valor 2 novamente: \n");
            n2 = Double.parseDouble(ler.nextLine());
        }   
        System.out.println("Valores Aceitos ! ");
    }
}

