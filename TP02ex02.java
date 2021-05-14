import java.util.Scanner;

public class TP02ex02 {
//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627

//EXERCICIO - 2
//Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
// erro, se necessário. Após a digitação, exibir:
// a. O maior valor;
// b. A soma dos valores;
// c. A média aritmética dos valores.

    
    public static void main(String[] args) {
        
        int i;
        Double[] num =  new Double[11];
        Double numero = 0.0;
        Double soma, media;
        Scanner ler = new Scanner(System.in);
        for(i=1; i <=10;)
        {
           System.out.print("Digite um numero possitivo:"  );
           
           num[i] = Double.parseDouble(ler.nextLine());
                if(num[i] >= 0)
                {
                    if(i < 10)
                    {
                        
                        System.out.print("faltao " + (10-i) +" numeros \n");
                    }
                    
                    i++;
                }
                else
                {
                    System.out.print("ERRO!!!  Por favor digite um numero positivo \n");
                }
           
           
        }
        soma = 0.0;
        media = 0.0;
        for(i=1; i <=10;i++){
            if(num[i] > numero)
            {
                numero = num[i];
                
            }
            soma = soma +  num[i];
        }
        media = soma / 10;
        System.out.print("\nMAIOR NUMERO: " + numero  + "\nSOMA DOS NUMEROS: " + soma + "\nMEDIA DOS NUMEROS: " + media);
        
    }
    
}
