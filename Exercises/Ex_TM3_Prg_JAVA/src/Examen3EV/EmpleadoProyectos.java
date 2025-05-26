package Ex_TM3_Prg_JAVA.src.Examen3EV;

// Extiende la clase Empleado (suponiendo que existe en el mismo paquete)
public class EmpleadoProyectos extends Empleado {
    public double salarioBase;
    public int horasExtras;
    public static final double PLUS = 750.0;

    // CONSTRUCTOR
    public EmpleadoProyectos(String nombre,Direccion direccion, double salarioBase, int horasExtras) {
        super(nombre, direccion);
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalarioTotal(){
        double cobroHoraMens = salarioBase / 160 ;
        double porcentajeHExtr = cobroHoraMens * 1.5;
        double cobroHoraExtr = porcentajeHExtr * horasExtras;
        double res= salarioBase + PLUS + cobroHoraExtr;
        return res;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Plus: " + PLUS);
    }
}

