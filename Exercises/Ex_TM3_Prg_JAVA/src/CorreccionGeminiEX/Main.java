package Ex_TM3_Prg_JAVA.src.CorreccionGeminiEX;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// 1. Clases y Herencia

// Clase Direccion
class Direccion implements Serializable {
    private static final long serialVersionUID = 1L;
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + " " + codigoPostal;
    }
}

// Clase Base: Empleado (Abstracta)
abstract class Empleado implements Serializable, Calculable {
    private static final long serialVersionUID = 1L;
    protected String nombre;
    protected int id;
    protected Direccion direccion;
    protected double salarioBase;
    protected int horasExtras;

    public Empleado(String nombre, int id, Direccion direccion, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public Direccion getDireccion() { return direccion; }
    public double getSalarioBase() { return salarioBase; }
    public int getHorasExtras() { return horasExtras; }

    // Método abstracto que deberá ser implementado por las clases hijas.
    public abstract void mostrarInformacion();

    // 3. Métodos y Funcionalidad
    // Implementa el método calcularSalarioTotal() de la interfaz Calculable
    @Override
    public double calcularSalarioTotal() {
        // La cantidad de horas base mensuales es 160.
        // Cada hora extra se paga al 50% más del valor de la hora base.
        double valorHoraBase = salarioBase / 160.0;
        double valorHoraExtra = valorHoraBase * 1.5;
        return salarioBase + (horasExtras * valorHoraExtra);
    }
}

// EmpleadoProyectos
class EmpleadoProyectos extends Empleado {
    private static final long serialVersionUID = 1L;
    private static final double PLUS_PROYECTOS = 750.0;

    public EmpleadoProyectos(String nombre, int id, Direccion direccion, double salarioBase, int horasExtras) {
        super(nombre, id, direccion, salarioBase, horasExtras);
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + PLUS_PROYECTOS;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("o  Empleado: " + nombre);
        System.out.println("o  ID: " + id);
        System.out.println("o  Salario Base: " + String.format("%.2f", salarioBase));
        System.out.println("o  Horas Extras: " + horasExtras);
        System.out.println("o  Salario Total: " + String.format("%.2f", calcularSalarioTotal()));
        System.out.println("o  Tipo: Empleado de Proyectos");
    }
}

// EmpleadoRRHH
class EmpleadoRRHH extends Empleado {
    private static final long serialVersionUID = 1L;
    private static final double PLUS_RRHH = 580.0;

    public EmpleadoRRHH(String nombre, int id, Direccion direccion, double salarioBase, int horasExtras) {
        super(nombre, id, direccion, salarioBase, horasExtras);
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + PLUS_RRHH;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("o  Empleado: " + nombre);
        System.out.println("o  ID: " + id);
        System.out.println("o  Salario Base: " + String.format("%.2f", salarioBase));
        System.out.println("o  Horas Extras: " + horasExtras);
        System.out.println("o  Salario Total: " + String.format("%.2f", calcularSalarioTotal()));
        System.out.println("o  Tipo: Empleado de RRHH");
    }
}

// 2. Interfaz
interface Calculable {
    double calcularSalarioTotal();
}

// 4. Comparador
class ComparadorSalario implements Comparator<Empleado> {
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        // Compara empleados según su salario total de mayor a menor.
        return Double.compare(emp2.calcularSalarioTotal(), emp1.calcularSalarioTotal());
    }
}

// 6. Interacción con el Usuario
public class Main {
    private static final String NOMBRE_ARCHIVO = "nominas.dat";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- Sistema de Gestión de Nóminas ---");
            System.out.println("1. Ingresar datos de empleados");
            System.out.println("2. Mostrar información de empleados (ordenado por salario)");
            System.out.println("3. Guardar empleados en archivo");
            System.out.println("4. Cargar empleados desde archivo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        ingresarEmpleados(empleados);
                        break;
                    case 2:
                        mostrarEmpleados(empleados);
                        break;
                    case 3:
                        guardarEmpleados(empleados);
                        break;
                    case 4:
                        empleados = cargarEmpleados();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer de entrada
                opcion = 0; // Para que el bucle continúe
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void ingresarEmpleados(List<Empleado> empleados) {
        System.out.print("¿Cuántos empleados desea ingresar? ");
        int numEmpleados;
        try {
            numEmpleados = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        } catch (InputMismatchException e) {
            System.out.println("Número inválido. Volviendo al menú principal.");
            scanner.nextLine(); // Limpiar el buffer
            return;
        }

        if (numEmpleados < 1) {
            System.out.println("Debe ingresar al menos un empleado.");
            return;
        }

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("\n--- Datos del Empleado #" + (i + 1) + " ---");
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();

            int id = -1;
            boolean idValido = false;
            while (!idValido) {
                System.out.print("Identificador único (ID): ");
                try {
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    idValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("ID inválido. Por favor, ingrese un número entero.");
                    scanner.nextLine(); // Limpiar el buffer
                }
            }

            System.out.println("Dirección:");
            System.out.print("  Calle: ");
            String calle = scanner.nextLine();
            System.out.print("  Ciudad: ");
            String ciudad = scanner.nextLine();
            System.out.print("  Código Postal: ");
            String codigoPostal = scanner.nextLine();
            Direccion direccion = new Direccion(calle, ciudad, codigoPostal);

            double salarioBase = -1;
            boolean salarioValido = false;
            while (!salarioValido) {
                System.out.print("Salario Base Mensual: ");
                try {
                    salarioBase = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    if (salarioBase < 0) {
                        System.out.println("El salario base no puede ser negativo.");
                    } else {
                        salarioValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Salario inválido. Por favor, ingrese un número.");
                    scanner.nextLine(); // Limpiar el buffer
                }
            }

            int horasExtras = -1;
            boolean horasValido = false;
            while (!horasValido) {
                System.out.print("Horas Extras Trabajadas en el mes: ");
                try {
                    horasExtras = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    if (horasExtras < 0) {
                        System.out.println("Las horas extras no pueden ser negativas.");
                    } else {
                        horasValido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Horas extras inválidas. Por favor, ingrese un número entero.");
                    scanner.nextLine(); // Limpiar el buffer
                }
            }

            System.out.print("Tipo de empleado (1 para Proyectos, 2 para RRHH): ");
            int tipoEmpleado;
            try {
                tipoEmpleado = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                if (tipoEmpleado == 1) {
                    empleados.add(new EmpleadoProyectos(nombre, id, direccion, salarioBase, horasExtras));
                } else if (tipoEmpleado == 2) {
                    empleados.add(new EmpleadoRRHH(nombre, id, direccion, salarioBase, horasExtras));
                } else {
                    System.out.println("Tipo de empleado no válido. Se omitirá este empleado.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de empleado inválido. Por favor, ingrese un número. Se omitirá este empleado.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }

    private static void mostrarEmpleados(List<Empleado> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar. Ingrese algunos primero.");
            return;
        }

        // Ordenar los empleados usando ComparadorSalario
        Collections.sort(empleados, new ComparadorSalario());

        System.out.println("\n--- Información de Empleados (Ordenado por Salario Total de Mayor a Menor) ---");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println("--------------------");
        }
    }

    // 5. Serialización
    private static void guardarEmpleados(List<Empleado> empleados) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            oos.writeObject(empleados);
            System.out.println("Lista de empleados guardada exitosamente en " + NOMBRE_ARCHIVO);
        } catch (IOException e) {
            System.err.println("Error al guardar la lista de empleados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static List<Empleado> cargarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            empleados = (List<Empleado>) ois.readObject();
            System.out.println("Lista de empleados cargada exitosamente desde " + NOMBRE_ARCHIVO);
            mostrarEmpleados(empleados); // Mostrar la lista recién cargada
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + NOMBRE_ARCHIVO + " no se encontró. Comience con una lista vacía.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la lista de empleados: " + e.getMessage());
        }
        return empleados;
    }
}