/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere;

/**
 *
 * @author Eda
 */
public class DecifrarVigenere {
    char tablaCesar[]={'A', 'B', 'C', 'D', 'E', 'F',
                        'G', 'H', 'I', 'J', 'K', 'L', 
                        'M', 'N', '\u00d1', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
   public char getTextoDescifrado(char TextoCifrado, char TextoClave){
        
        //indices para encontrar los elementos
        //int indiceX = 0;
        //int indiceY = 0;
        
        int indiceCharTextoCifrado = 0;
        int indiceCharTextoClave = 0;
        boolean aver = false;
        
        for(int i = 0; i < tablaCesar.length; i++){
            if(TextoCifrado == tablaCesar[i]){
                indiceCharTextoCifrado = i;
                aver=true;
                break;
            }
        }
        
        for(int j = 0; j<tablaCesar.length; j++){
            if(TextoClave == tablaCesar[j]){
                indiceCharTextoClave = j;
                break;
            }
        }
        
        int avr;
        if (aver) {
           if(indiceCharTextoCifrado >= indiceCharTextoClave){
            avr= (indiceCharTextoCifrado - indiceCharTextoClave)%27;
            return tablaCesar[avr];
           }else{
            avr = 27-(indiceCharTextoClave - indiceCharTextoCifrado);
            return tablaCesar[avr];
        }
       }else{
            return TextoCifrado;
        }
       
   }
    
}
