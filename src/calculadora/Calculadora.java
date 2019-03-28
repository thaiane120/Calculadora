package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
public static void main(String[] args) {
    Operacoes soma = new Operacoes();
    int x, y, z;
    x = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O PRIMEIRO NUMERO: "));
    y = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O SEGUNDO NUMERO: "));
    z = Integer.parseInt(JOptionPane.showInputDialog("****DIGITE****\n\n1- SOMAR\n2- SUBTRAIR\n3- MULTIPLICAR\n 4- DIVIDIR\n\n"));
        if(z==1){
            System.out.println("O resultado é " + soma.Soma(x,y));
        }else{
             System.out.println("***OPERAÇÃO INVÁLIDA***");
        }
                
}
}




   
    

