package Ex_TM3_Prg_JAVA.src.Examen3EV;

// crea una clase llamada ComparadorSalario que implemente la interfaz 
//  para comparar empleados según su salario total de mayor a menor.
public class ComparadorSalario implements Comparator<Empleado>{

    @Override 
    public int compare(Empleado e1, Empleado e2) {
        return Double.compare(e2.getSalarioTotal(), e1.getSalarioTotal());
    }
    
}
