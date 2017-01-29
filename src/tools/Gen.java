/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Jeferson
 */
public class Gen {
    
    public void geraDicionario(String caminho, int tamanho, String esquerda, String direita) {
        
        if (caminho.equals("")) {
            JOptionPane.showMessageDialog(null, "Path vazio, selecione o caminho correto para o dicionario .txt");
        }else{  
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));
            
            for (int i = 0; i < tamanho;i++){
                String senha = "" + i, stringTamanho = ""+tamanho;
                
                while (senha.length() < stringTamanho.length()-1){
                    senha = "0" + senha;
                }
                if (esquerda.equals("")) {
                    buffWrite.write(senha + direita);                   
                }
                if (direita.equals("")) {
                    buffWrite.write(esquerda + senha);
                }               
                buffWrite.newLine();
            }  
            buffWrite.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex); 
            }    
        }       
    }  
}
