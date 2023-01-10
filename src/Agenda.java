import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {
    private static TreeMap<String, String> contactos = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("Elige una opción: ");
            System.out.println("1. Añadir nuevo contacto");
            System.out.println("2. Buscar teléfono de un contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Ingresa el nombre del contacto:");
                String nombre = sc.nextLine();
                System.out.println("Ingresa el teléfono del contacto:");
                String telefono = sc.nextLine();
                contactos.put(nombre, telefono);
                System.out.println("Contacto añadido correctamente");
            } else if (opcion == 2) {
                System.out.println("Ingresa el nombre del contacto:");
                String nombre = sc.nextLine();
                if (contactos.containsKey(nombre)) {
                    System.out.println("El teléfono de " + nombre + " es " + contactos.get(nombre));
                } else {
                    System.out.println("No se ha encontrado al contacto " + nombre);
                }
            } else if (opcion == 3) {
                for (String nombre : contactos.keySet()) {
                    System.out.println(nombre + ": " + contactos.get(nombre));
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo de la agenda...");
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }

        sc.close();
    }
}