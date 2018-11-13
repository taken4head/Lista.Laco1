/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Urna {
    public static void main(String[] args) {
        int cont=0,A=0,B=0,soma=-1,C=0;
        
         while(soma!=0){  //o laço parará de executar quando a nota for -'
            soma = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor correspondente a qual"
                    + " chapa deseja votar \n 1: Chapa A \n 2: Chapa B"));
            if (soma == 1){
                A = soma+A;
                C = soma+C;
            }
            if (soma == 2){
               B = soma=1+B;
               
            }
            if (soma == 0 ){
                C=A+B;
                    JOptionPane.showMessageDialog(null,"Os votos acumulados da Chapa A :"+A+"\n \n Os votos acumulados da chapa B :"+B+"\n\n "
                            + "Quantidade de eleitores consultados :"+C);
                
            }
         }
    }
    
}
