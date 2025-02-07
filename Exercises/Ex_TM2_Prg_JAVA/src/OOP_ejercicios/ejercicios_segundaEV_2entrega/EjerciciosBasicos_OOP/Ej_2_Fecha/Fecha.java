package OOP_ejercicios.ejercicios_segundaEV_2entrega.EjerciciosBasicos_OOP.Ej_2_Fecha;

public class Fecha {
    // Atributos de dia, mes, anno
    private int dia;
    private int mes;
    private int anno;

    // Constructor vacío
    public Fecha() {
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    // Getters y setters
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }
    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }
    public int getAnno() { return anno; }
    public void setAnno(int anno) { this.anno = anno; }

    // toString method
    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anno=" + anno +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Si ambos objetos son la misma instancia, son iguales
        if (o == null || getClass() != o.getClass()) return false;  // Si el objeto es nulo 
                                                                    // o de otra clase, no son iguales
        Fecha fecha = (Fecha) o;  // Se castea el objeto a Fecha
        if (dia != fecha.dia) return false; // Compara el día, mes y anno
        if (mes != fecha.mes) return false; 
        return anno == fecha.anno; 
    }


    @Override
    public int hashCode() {
        int result = dia;          // Iniciamos con el día
        result = 31 * result + mes; // Multiplicamos por 31 y sumamos el mes
        result = 31 * result + anno; // Multiplicamos por 31 y sumamos el año
        return result;              // Devolvemos el hash final
    }
    
}
