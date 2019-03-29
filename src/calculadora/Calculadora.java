package calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
public static void main(String[] args) throws IOException {
    Operacoes operacoes = new Operacoes();
    float x,y,z = 0;
        String escolha;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println(" Calculadora Básica: ");
            System.out.println(":");
            x = input.nextFloat();
            escolha = input.next();
            y = input.nextFloat();
            
            if("+".equals(escolha)){
            System.out.println("O resultado é " + operacoes.Soma(x,y));
            }else{
                if("-".equals(escolha)){
                    System.out.println("O resultado é "+operacoes.Subtrai(x, y));
                }else{
                    if("*".equals(escolha)){
                        System.out.println("O resultado é " + operacoes.Multiplica(x, y));
                    }else{
                        if("/".equals(escolha)){
                            System.out.println("O resultado é " + operacoes.Divide(x, y));
                        }else{
                           System.out.println("***OPERAÇÃO INVÁLIDA***");
                        }
                    }

                }
            } 
         System.out.println("Precione Enter para continuar...");
         System.in.read();
         System.out.println("\n\n\n\n\n");   
        }while(z!=2);
        
    }
}




   
    

