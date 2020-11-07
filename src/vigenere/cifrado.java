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
public class cifrado {
    //una tabla de el abecedario
    
    char tablaCesar[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','\u00d1','O','P','Q','R','S','T','U','V','W','X','Y','Z' };
    
    public char getTextoCifrado(char TextoClaro, char TextoClave){
        
        //indices para encontrar los elementos
        int indiceX = 0;
        int indiceY = 0;
        boolean aver=false;
        for(int i = 0; i < tablaCesar.length; i++){
            if(TextoClaro == tablaCesar[i]){
                indiceX = i;
                aver=true;
                break;
            }
        }
        
        for(int j = 0; j<tablaCesar.length; j++){
            if(TextoClave == tablaCesar[j]){
                indiceY = j;
                break;
            }
        }
        if (aver) {
            return tablaCesar[(indiceX + indiceY)%27];
        }else{
            return TextoClaro;
        }
    
    
    }
    
}
