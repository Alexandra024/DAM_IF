package Ex_TM3_Prg_JAVA.src.ExamEnCodigo.EjPequeños1Pnt.Ej8Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializacionCompuestaSimplificado {

    private static final String NOMBRE_ARCHIVO = "persona_con_direccion.ser";

    public static void main(String[] args) {

        // 1. Crear un objeto Persona con su Direccion
        Direccion dir1 = new Direccion("Calle Falsa 123", "Springfield", "12345");
        Persona personaOriginal = new Persona("Homer Simpson", 45, dir1);

        // 2. Serializar (guardar) el objeto
        try (
            FileOutputStream fileOut = new FileOutputStream(NOMBRE_ARCHIVO);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ) {
            out.writeObject(personaOriginal);
        } catch (IOException i) {
            i.printStackTrace();
        }

        // 3. Deserializar (cargar) el objeto
        Persona personaCargada = null;
        try (
            FileInputStream fileIn = new FileInputStream(NOMBRE_ARCHIVO);
            ObjectInputStream in = new ObjectInputStream(fileIn)
        ) {
            personaCargada = (Persona) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        // 4. Verificar el objeto cargado
        if (personaCargada != null) {
            System.out.println("Objeto original: " + personaOriginal);
            System.out.println("Objeto cargado:   " + personaCargada);

            // Confirma que los datos, incluida la dirección, se cargaron correctamente
            System.out.println("Nombre cargado: " + personaCargada.getNombre());
            System.out.println("Edad cargada:   " + personaCargada.getEdad());
            System.out.println("Dirección cargada: " + personaCargada.getDireccion().getCalle());
        } else {
            System.out.println("No se pudo cargar el objeto.");
        }
    }
}