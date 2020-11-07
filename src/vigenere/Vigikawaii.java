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
public class Vigikawaii {
    
    private String textoCifrado = " ";
    private String textoClaro = " ";
    
    cifrado cifradovigi = new cifrado ();
    DecifrarVigenere descivigi = new DecifrarVigenere ();
    
    
     public String encriptarTextoClaro(String textoClaro, String clave){
        String clavecompleta = " ";
        int indice = 0;
        for(int i = indice; i<textoClaro.length(); i++){
            for(int j = 0; j<clave.length(); j++){
                if(clavecompleta.length() < textoClaro.length()){
                    clavecompleta += clave.charAt(j) + "";
                    
                    indice++;
                }
            }
        }
        
        for(int i = 0; i<textoClaro.length(); i++){
            char charTextoClaro = textoClaro.charAt(i);
            char charClaveCompleta = clavecompleta.charAt(i);
            
            if(charTextoClaro != ' '){
                textoCifrado += cifradovigi.getTextoCifrado(charTextoClaro, charClaveCompleta)+"";
            }else{
                textoCifrado += " ";
            }
        }
        
        return textoCifrado;
    }
    
    
    public String desencriptarTextoClaro(String textoCifrado, String clave){
        String clavecompleta = "";
        int indice = 0;
        for(int i = indice; i<textoCifrado.length(); i++){
            for(int j = 0; j<clave.length(); j++){
                if(clavecompleta.length() < textoCifrado.length()){
                  
                        clavecompleta += clave.charAt(j) + "";
                    
                    indice++;
                
            }
        }
    }    
        for(int i = 0; i<textoCifrado.length(); i++){
            char charTextoCifrado = textoCifrado.charAt(i);
            char charClaveCompleta = clavecompleta.charAt(i);
            
            if(charTextoCifrado != ' '){
                textoClaro += descivigi.getTextoDescifrado(charTextoCifrado, charClaveCompleta);
            }else{
                textoClaro += " ";
            }
        }
        
        return textoClaro;
    
    
    
    
    }
}
