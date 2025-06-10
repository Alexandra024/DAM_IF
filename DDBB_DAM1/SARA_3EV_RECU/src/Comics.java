
import  java.util.*;

public class Comics extends Libreria {
    public enum tematica {
       MANGA, MARVEL, HUMOR
    }

    public Comics (String titulo, String autores, String editorial, int annoEd,float IVA, enum tematica){
        super(titulo, autores, editorial, annoEd, IVA);
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Comics [titulo=" + titulo + ", tematica=" + tematica + ", autores=" + autores + ", editorial=" + editorial
                + ", annoEd=" + annoEd + ", IVA=" + IVA + "]";
    }



}
