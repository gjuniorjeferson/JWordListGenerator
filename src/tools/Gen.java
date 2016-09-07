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
    
    public void geraDicionario(String caminho, String option, String esquerda, String direita) {
        
        if (caminho.equals("")) {
            JOptionPane.showMessageDialog(null, "Path vazio, selecione o caminho correto para o dicionario .txt");
        }else{  
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));  
            switch (Integer.parseInt(option)) {
                case 2 :
                    for (int i = 0; i < 100;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "0" +i + direita);
                            buffWrite.newLine();
                        }
 
                        if (i > 9) {
                            buffWrite.write(esquerda + i + direita);
                            buffWrite.newLine();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");
                    break;
                case 3 :
                    for (int i = 0; i < 1000;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "00" + i + direita);
                            buffWrite.newLine();
                        }
                    
                        if (i < 100 && i > 9) {
                            buffWrite.write(esquerda + "0" + i + direita);
                            buffWrite.newLine();
                        }
                        
                        if (i > 99) {
                            buffWrite.write(esquerda + "" + i + direita);
                            buffWrite.newLine();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");
                    break;
                case 4 :
                    for (int i = 0; i < 10000;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "000" + i + direita);
                            buffWrite.newLine();
                        }
                    
                        if (i < 100 && i > 9) {
                            buffWrite.write(esquerda + "00" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 1000 && i > 99) {
                            buffWrite.write(esquerda + "0" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i > 999) {
                            buffWrite.write(esquerda + "" + i + direita);
                            buffWrite.newLine();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");
                    break;
                case 5 :
                    for (int i = 0; i < 100000;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "0000" + i + direita);
                            buffWrite.newLine();
                        }
                    
                        if (i < 100 && i > 9) {
                            buffWrite.write(esquerda + "000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 1000 && i > 99) {
                            buffWrite.write(esquerda + "00" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 10000 && i > 999) {
                            buffWrite.write(esquerda + "0" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i > 9999) {
                            buffWrite.write(esquerda + i + direita);
                            buffWrite.newLine();                            
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");
                    break;
                case 6 :
                    for (int i = 0; i < 1000000;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "00000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 100 && i > 9) {
                            buffWrite.write(esquerda + "0000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 1000 && i > 99) {
                            buffWrite.write(esquerda + "000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 10000 && i > 999) {
                            buffWrite.write(esquerda + "00" + i);
                            buffWrite.newLine();
                        }
                        if (i < 100000 && i > 9999) {
                            buffWrite.write(esquerda + "0" + i + direita);
                            buffWrite.newLine();                            
                        }
                        if (i > 99999) {
                            buffWrite.write(esquerda + i + direita);
                            buffWrite.newLine();        
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");
                    break;
                case 7 :
                    for (int i = 0; i < 10000000;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "000000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 100 && i > 9) {
                            buffWrite.write(esquerda + "00000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 1000 && i > 99) {
                            buffWrite.write(esquerda + "0000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 10000 && i > 999) {
                            buffWrite.write(esquerda + "000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 100000 && i > 9999) {
                            buffWrite.write(esquerda + "00" + i + direita);
                            buffWrite.newLine();                            
                        }
                        if (i < 1000000 && i > 99999) {
                            buffWrite.write(esquerda = "0" + i + direita);
                            buffWrite.newLine();        
                        }
                        if (i > 999999) {
                            buffWrite.write(esquerda + "" + i + direita);
                            buffWrite.newLine();                                   
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");
                    break;
                case 8 :
                    for (int i = 0; i < 100000000;i++){
                        if (i < 10) {
                            buffWrite.write(esquerda + "0000000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 100 && i > 9) {
                            buffWrite.write(esquerda + "000000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 1000 && i > 99) {
                            buffWrite.write(esquerda + "00000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 10000 && i > 999) {
                            buffWrite.write(esquerda + "0000" + i + direita);
                            buffWrite.newLine();
                        }
                        if (i < 100000 && i > 9999) {
                            buffWrite.write(esquerda + "000" + i + direita);
                            buffWrite.newLine();                            
                        }
                        if (i < 1000000 && i > 99999) {
                            buffWrite.write(esquerda + "00" + i + direita);
                            buffWrite.newLine();        
                        }
                        if (i < 10000000 && i > 999999) {
                            buffWrite.write(esquerda + "0" + i + direita);
                            buffWrite.newLine();                                   
                        }
                        if (i > 9999999) {
                            buffWrite.write(esquerda + i + direita);
                            buffWrite.newLine(); 
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Gerado com sucesso");                    
                    break;
                    default:
                        
            }
            buffWrite.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
  
            }    
        }
        
    }
    
}
