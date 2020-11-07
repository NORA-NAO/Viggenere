package vigenere;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eda
 */
public class PrinViggenere {
    char [] mensaje;
    char[] clave;
    char [] resultado;
    char matriz[][];
    
    
    // recibir el mensaje  y la clave 
    
    public PrinViggenere (String msj, String clave){
        
        //obtener el mensjae y mandarlos al los arreglos de java 
        this.mensaje = msj.toCharArray();
        char [] claveTemp = clave.toCharArray();
        this.clave = new char[mensaje.length];
        int cont = 0;
        
        
        //rrcorrer el mensaje vamos a tener en la parte superior al mensaje y ala izquierda la clave 
        //y tenemos que recorrer las posiciones del mesjae vs posiciones  de la clave
        //adentro de la matriz 
        for (int i = 0; i < mensaje.length; i++) {
            this.clave[i] = claveTemp[cont];
            cont++;
            if (cont == claveTemp.length) 
                cont=0;
        }
            this.matriz = generarMatrizABC();
            Cifrar();
        }
    
      private char[][] generarMatrizABC() {
        
        int contador;
        char abcTemporal[] = this.generarAbecedario();
        char abc[] = new char[abcTemporal.length*2];
        
        for(int c =0; c<26; c++){
            abc[c] = abcTemporal[c];
            abc[c+26]= abcTemporal[c];
        }
        
        //vamos a generar la matriz de 2x2, para rellenarla con mis abc´s
        char[][] matriz = new char[26][26];
        //vamos a rellenar
        for(int i=0; i<26; i++){
            contador =0;
            for(int j=0; j<26; j++){
                matriz[i][j]=abc[contador+i];
                contador++;
            }
        }
        return matriz;
    }

        
        
        public void Cifrar (){
            char [] cifrado = new char [mensaje.length];
            int i,j;
             for (int cont = 0; cont < mensaje.length; cont++) {
                i = (int)this.mensaje[cont]-97;
                j = (int) this.clave.length-97;
                cifrado[cont] = this.matriz[i][j];
                
            }
            this.resultado = cifrado ;
            for (int k = 0; k < 26; k++) {
                System.out.println("el abc"+this.matriz);
                System.out.println("el mensaje"+this.mensaje);
                System.out.println("La clave"+this.clave);
                System.out.println("El cifrado"+cifrado);
            }
        
        }
        
        public String getMensajeCifrado(){
            String result = "";
            for (int i = 0; i < resultado.length; i++) {
                result = result+this.resultado[i];
            }
            return result;
        }
        
        
        //generar el abc conforme el codigo ascci 
        
        
        
        private char[] generarAbecedario(){
         
            char[] abc = new char [26];
            for (int i = 97; i < 122; i++) {
                abc[i-97]=(char)i;
            }
          return abc;
        }
     }


