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
public class MediaClasse {
        public static void main(String[] args) {
            int cont=0;
            double nota =0,soma =0,media;
            while(nota!=-1){ // o laço parará de executar quando a nota for -'
            nota =Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno"));
            if (nota!=-1){
                soma=nota+soma; // acumulador da soma das notas
                cont= cont+1;// contador da notas
            }
        }
            media=soma/cont; // media da classe
            JOptionPane.showMessageDialog(null,"Média da Classe: "+ Double.toString(media));
    }
    
}
