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
        this.cadena = Arrays.copyOf(cadena, cadena.length);
    }
    
    public MyString(ArrayList<Character> cadena) {
        this.cadena = new char[cadena.size()];
        for (int i = 0; i < cadena.size(); i++) {
            this.cadena[i] = cadena.get(i);
        }
    }
    
    public char[] getCadena() {
        return Arrays.copyOf(this.cadena, this.cadena.length);
    }
    
    public char myCharAt(int i) throws Exception {
        if (i < 0 || i >= this.cadena.length) {
            throw new Exception("Index out of bounds");
        }
        return this.cadena[i];
    }

    public int myCompareTo(MyString cadena2) {
        int minLength = Math.min(this.cadena.length, cadena2.cadena.length);
        for (int i = 0; i < minLength; i++) {
            if (this.cadena[i] != cadena2.cadena[i]) {
                return this.cadena[i] - cadena2.cadena[i];
            }
        }
        return this.cadena.length - cadena2.cadena.length;
    }
    
    public int myCompareToIgnoreCase(MyString cadena2) {
        int minLength = Math.min(this.cadena.length, cadena2.cadena.length);
        for (int i = 0; i < minLength; i++) {
            char c1 = Character.toLowerCase(this.cadena[i]);
            char c2 = Character.toLowerCase(cadena2.cadena[i]);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return this.cadena.length - cadena2.cadena.length;
    }
    
    public void myConcat(MyString cadena2) {
        char[] newCadena = new char[this.cadena.length + cadena2.cadena.length];
        System.arraycopy(this.cadena, 0, newCadena, 0, this.cadena.length);
        System.arraycopy(cadena2.cadena, 0, newCadena, this.cadena.length, cadena2.cadena.length);
        this.cadena = newCadena;
    }
    
    public int myIndexOf(int caracter) {
        for (int i = 0; i < this.cadena.length; i++) {
            if (this.cadena[i] == caracter) {
                return i;
            }
        }
        return -1;
    }
    
    public int myLastIndexOf(int caracter) {
        for (int i = this.cadena.length - 1; i >= 0; i--) {
            if (this.cadena[i] == caracter) {
                return i;
            }
        }
        return -1;
    }
    
    public int myLength() {
        return this.cadena.length;
    }
    
    public MyString myReplace(char antiguo, char nuevo) {
        char[] newCadena = Arrays.copyOf(this.cadena, this.cadena.length);
        for (int i = 0; i < newCadena.length; i++) {
            if (newCadena[i] == antiguo) {
                newCadena[i] = nuevo;
            }
        }
        return new MyString(newCadena);
    }
    
    public MyString[] mySplit(char expresion) {
        ArrayList<MyString> parts = new ArrayList<>();
        ArrayList<Character> currentPart = new ArrayList<>();
        for (char c : this.cadena) {
            if (c == expresion) {
                if (!currentPart.isEmpty()) {
                    parts.add(new MyString(currentPart));
                    currentPart.clear();
                }
            } else {
                currentPart.add(c);
            }
        }
        if (!currentPart.isEmpty()) {
            parts.add(new MyString(currentPart));
        }
        return parts.toArray(new MyString[0]);
    }
        
    public MyString mySubstring(int inicio, int fin) throws Exception {
        if (inicio < 0 || fin > this.cadena.length || inicio > fin) {
            throw new Exception("Invalid range");
        }
        return new MyString(Arrays.copyOfRange(this.cadena, inicio, fin));
    }
    
    public MyString myToLowerCase() {
        char[] newCadena = new char[this.cadena.length];
        for (int i = 0; i < this.cadena.length; i++) {
            newCadena[i] = Character.toLowerCase(this.cadena[i]);
        }
        return new MyString(newCadena);
    }
    
    public MyString myToLowerCase(char[] cadena) {
        char[] newCadena = new char[cadena.length];
        for (int i = 0; i < cadena.length; i++) {
            newCadena[i] = Character.toLowerCase(cadena[i]);
        }
        return new MyString(newCadena);
    }
    
    public MyString myToUpperCase() {
        char[] newCadena = new char[this.cadena.length];
        for (int i = 0; i < this.cadena.length; i++) {
            newCadena[i] = Character.toUpperCase(this.cadena[i]);
        }
        return new MyString(newCadena);
    }
    
    public MyString myTrim() {
        int start = 0, end = this.cadena.length - 1;
        while (start <= end && Character.isWhitespace(this.cadena[start])) {
            start++;
        }
        while (end >= start && Character.isWhitespace(this.cadena[end])) {
            end--;
        }
        return new MyString(Arrays.copyOfRange(this.cadena, start, end + 1));
    }
    
    public void imprimir() {
        System.out.println(this.myToString());
    }
    
    public String myToString() {
        return new String(this.cadena);
    }
}