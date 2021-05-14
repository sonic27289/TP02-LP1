import java.util.Scanner;
import java.lang.Math;
public class TP02ex11{
    //Gabriel Kenji Utiyama CB3012069
    //Gustavo Barbosa da Silva CB3010627

    /*11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.*/

    private static int DET;
    public static void main(String[] args){
        int i, ordem, ordem2, l, j,h ,g, d ;
        
        Double deter, a;
        Scanner sc = new Scanner(System.in); // Preparando o console para leitura
        ordem = 0;
        for(i=0; i <1;)
        {
            System.out.print("Digite a ordem que deseja da matriz quadratica (Maximo:10):  "   );
            ordem = Integer.parseInt(sc.nextLine()); 
            if(ordem<=0 || ordem>10)
            {
                System.out.print("Ordem invalida digite um valor valido!!\n"   );
            }
            else
            {
                i++;
            }
            
        }
        ordem2 = ordem - 1;
        double mat[][] = new double[ordem][ordem];
        double inv[][] = new double[ordem][ordem];
        double cofa[][] = new double[ordem2][ordem2];
        double cof[][] = new double[ordem][ordem];
        double coftrans[][] = new double[ordem][ordem];
        for ( i = 0; i < mat.length; i++) {
            for (int c = 0; c < mat[i].length; c++) {
                System.out.printf("Informe %do valor da %da linha : ", c + 1, i + 1);
                mat[i][c] = sc.nextDouble();

            }
        }
        for(i = 0; i < ordem; i++) {
                for (j = 0; j < ordem; j++) {
                    System.out.printf("%.2f",mat[i][j]);
                    if(j < ordem - 1)
                    {
                        System.out.print("\t"); 
                    }
                    else 
                    {
                        System.out.print("\n");
                    } 
                } 
            }

        sc.close();
        if(laplace(mat) == 0.0){
            System.out.println("" );
        }
        else
        {
            deter = laplace(mat);
            System.out.println("Determinante: " + deter + " " + ordem2 );
            double ij = 0.0;
            for(i=0; i < ordem; i++)
            {
                
                for(int c = 0; c< ordem; c++)
                {
                    a = mat[i][c];
                    h = 1;
                    
                    int co = 1;
                    for(j=0; j < ordem; j++)
                    {
                        
                        
                        if(j!=i)
                        {
                            g = 1;
                            for(l=0; l< ordem; l++)
                            {
                                if(l!=c)
                                {
                                    
                                    
                                        ij = c + i + 2;
                                    
                                    cofa[h-1][g-1] = mat[j][l];

                                    
                                    
                                    double ul = -1;
                                    double pot = Math.pow(ul, ij);
                                    
                                
                                    cof[i][c] = pot*laplace(cofa);
                                    
                                        
                                    
                                    
                                    co = co + 1;
                                    g = g+1;
                                }
                                
                                        
                            }
                            
                        h = h+1;	
                        }
                        
                    }
                    
                }
            }
            for(int linha=0;linha<cof.length;linha++){  
                for(int coluna=0;coluna<cof[linha].length;coluna++){    
                        coftrans[linha][coluna]=cof[coluna][linha];  
                }  
            } 
            for(i = 0; i < ordem; i++) {
                for (j = 0; j < ordem; j++) {
                    double u = -1;
                    inv[i][j] = coftrans[i][j]/deter;
                } 
            }
            for(i = 0; i < ordem; i++) {
                for (j = 0; j < ordem; j++) {
                    System.out.printf("");
                    if(j < ordem - 1)
                    {
                        System.out.print(""); 
                    }
                    else 
                    {
                        System.out.print("");
                    } 
                } 
            }
        }
                
        
    }


    public static double laplace(double[][] matriz) {
            double determinante = 0;
            if (matriz.length == 1) {
            
                determinante = matriz[0][0];
            } else if (matriz.length == 2) {
                determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
            } else if (matriz.length == 3) {
                
                determinante = matriz[0][0] * matriz[1][1] * matriz[2][2]
                        + matriz[0][1] * matriz[1][2] * matriz[2][0]
                        + matriz[0][2] * matriz[1][0] * matriz[2][1]
                        - matriz[0][2] * matriz[1][1] * matriz[2][0]
                        - matriz[0][0] * matriz[1][2] * matriz[2][1]
                        - matriz[0][1] * matriz[1][0] * matriz[2][2];
            } else {
                
                double[][] aux;
                int i_aux, j_aux, linha, coluna, p;

            
                for (p = 0; p < matriz.length; p++) {
                    
                    if (matriz[0][p] != 0) {
                        aux = new double[matriz.length - 1][matriz.length - 1];
                        i_aux = 0;
                        j_aux = 0;
                        
                        for (linha = 1; linha < matriz.length; linha++) {
                            for (coluna = 0; coluna < matriz.length; coluna++) {
                            
                                if (coluna != p) {
                                    aux[i_aux][j_aux] = matriz[linha][coluna];
                                    j_aux++;
                                }
                            }
                        
                            i_aux++;
                            j_aux = 0;
                        }
                        
                        determinante += Math.pow(-1, p) * matriz[0][p] * laplace(aux);
                    }

                }
            }
            return determinante;
        }

}
