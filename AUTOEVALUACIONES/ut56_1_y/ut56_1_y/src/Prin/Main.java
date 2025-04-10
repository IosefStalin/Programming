package Prin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n[Menú]");
            System.out.println("1. Añadir libro");
            System.out.println("2. Buscar por ISBN");
            System.out.println("3. Modificar título");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Listar libros escasos");
            System.out.println("6. Salir");
            System.out.print("Elección: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Ejemplares: ");
                    int ejemplares = scanner.nextInt();
                    scanner.nextLine();
                    Libro nuevo = new Libro(titulo, "Autor Desconocido", ISBN, ejemplares);
                    System.out.println(catalogo.agregarLibro(nuevo) ? "✓ Añadido" : "✖ Error");
                    break;

                case 5:
                    catalogo.listarLibrosEscasos();
                    break;

            }
        } while (opcion != 6);
        scanner.close();
    }
}
