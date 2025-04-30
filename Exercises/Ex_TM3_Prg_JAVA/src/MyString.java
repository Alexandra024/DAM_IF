package Ex_TM3_Prg_JAVA.src;

//Crear una Clase que funcione imite a la clase String
//que tendrá como atributo un array de char

import java.util.*; // Importa las librerias publicas 

public class MyString {
    private char[] cadena;
    
    //Crear un MyString a partir de un String de Java
    public MyString(String s) {
        this.cadena = new char[s.length()];
        for (int i = 0; i < s.length(); i++ ){
            this.cadena[i] = s.charAt(i);
        }
    }
    
    // Crear un MyString a partir de un array de caracteres
    public MyString(char[] cadena) {

    }
    
    public MyString(ArrayList<Character> cadena){

    }
    
    public char[] getCadena(){

    }
    
    public char myCharAt(int i) throws Exception{

    }

    public int myCompareTo(MyString cadena2){

    }
    
    public int myCompareToIgnoreCase(MyString cadena2){

    }
    
    public void myConcat(MyString cadena2){

    }
    
    public int myIndexOf(int caracter){

    }
    
    public int myLastIndexOf(int caracter){

    }
    
    public int myLength(){

    }
    
    public MyString myReplace(char antiguo, char nuevo){

    }
    
    /*
     * public MyString[] mySplit(char expresion)
    {
    }
    */
    
    public MyString[] mySplit(char expresion){

    }
        
    
    
    public MyString mySubstring(int inicio, int fin) throws Exception{

    }
    public MyString myToLowerCase(){

    }
    
    public MyString myToLowerCase(char[] cadena){

    }
    
    public MyString myToUpperCase(){

    }
    
    public MyString myTrim(){

    }
    
    public void imprimir(){

    }
    
    public String myToString(){

    }
}