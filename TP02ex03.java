import java.util.Scanner;
import java.lang.Math;
class TP02ex03 
{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627
    
    /*3. Entrar via teclado com �N� valores quaisquer. O valor �N� (que representa a quantidade de
n�meros) ser� digitado, dever� ser positivo, por�m menor que vinte. Caso a quantidade n�o
satisfa�a a restri��o, enviar mensagem de erro e solicitar o valor novamente. Ap�s a
digita��o dos �N� valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A m�dia aritm�tica dos valores;
e. A porcentagem de valores que s�o positivos;
f. A porcentagem de valores negativos;
Ap�s exibir os dados, perguntar ao usu�rio de deseja ou n�o uma nova execu��o do
programa. Consistir a resposta no sentido de aceitar somente �S� ou �N� e encerrar o
programa em fun��o dessa resposta.*/
   
    public static void main(String[] args) 
    {
        double contador, numero, soma = 0.0;
        double maior = 0.0, menor = 0.0;
        String resposta = "";
        double media, pNeg = 0.0, pPos = 0.0;
        Scanner ler = new Scanner(System.in); 
        do {

            System.out.println("Digite quantos valores ser�o digitados (1 a 20): ");
            contador = Double.parseDouble(ler.nextLine());
            
        while(contador <= 0 || contador > 20)
        {
                System.out.println("Valor inv�lido. Tente novamente.");
                contador = Double.parseDouble(ler.nextLine());
        }

            for (int c = 1; c <= contador; c++)
            {
                System.out.println("Digite o " + c + "� n�mero.");
                numero = Double.parseDouble(ler.nextLine());
                if (numero > maior)
                {
                    maior = numero;
                }
                if (numero < menor)
                {
                    menor = numero;
                }
                if (numero < 0) 
                {
                    pNeg++;
                } 
                else
                {
                    pPos++;
                }
                soma += numero;
                System.out.println(pNeg);
            }
            media = soma / contador;
            System.out.println("O maior valor �:" + maior);
            System.out.println("\nO menor valor �: " + menor);
            System.out.println("\nA soma dos valores �: " + soma);
            System.out.println("\nA m�dia aritm�tica dos valores �: " + media);
            System.out.printf("\nA porcentagem de valores que s�o positivos: %f", (pPos / contador) * 100);
            System.out.printf("\nA porcentagem de valores que s�o negativos: %f", (pNeg / contador) * 100);
            
            System.out.println("\nDeseja continuar? [S/N]");
            resposta = (ler.next());
                while(resposta == "N" && resposta == "S")
                {
                    System.out.println("Apenas S ou N. Tente de novo.");
                    resposta = (ler.next());
                } 
        } while (resposta != "S");     
    }
}
