package Ex_TM3_Prg_JAVA.src.Examen3EV;

import java.io.*;

public class Main {
    private static final String ARCH_NOMINAS = "nominas.dat";
    public static void main(String[] args) {
        
        // Create Object from classs Empleado 
        Empleado e1RH = new EmpleadoRRHH("Ana" ,null, 3040, 2);
        Empleado e2RH = new EmpleadoRRHH("Leila", null, 3002, 12);
        Empleado e1PY = new EmpleadoProyectos("Carlo", null, 3040, 4);

        // Serialize Obj (save doc)
        try (
            FileOutputStream fileOut = new FileOutputStream(ARCH_NOMINAS);
            ObjectOutputStream oos = new ObjectOutputStream(fileOut)
        ){
            out.writeObject(e1PY); //write in the flow of the Obj 
            System.out.println("Objeto serializado y guardado en " + ARCH_NOMINAS);
            System.out.println("Objeto orginal " + e1PY);
        }catch (IOException i) {
            // TODO: handle exception
            i.printStackTrace();
        }

    }
}
