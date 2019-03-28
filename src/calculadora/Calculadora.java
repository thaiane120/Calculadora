package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
public static void main(String[] args) {
    Operacoes operacoes = new Operacoes();
    int x, y, z;
    x = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO: "));
    y = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO: "));
    z = Integer.parseInt(JOptionPane.showInputDialog("*****DIGITE*****\n\n1- SOMAR\n2- SUBTRAIR\n3- MULTIPLICAR\n 4- DIVIDIR\n\n"));
        if(z==1){
            System.out.println("O resultado é " + operacoes.Soma(x,y));
        }else{
            if(z==2){
                System.out.println("O resultado é "+operacoes.Subtrai(x, y));
            }else{
                if (z == 3){
                    System.out.println("O resultado é " + operacoes.Multiplica(x, y));
                }else{
             System.out.println("***OPERAÇÃO INVÁLIDA***");
                }
            }
        } 
            
    }
}




   
    

