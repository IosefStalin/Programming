package Prin;

import java.util.Scanner;

public class Catalogo {
    private Libro[] libros;
    private int contador;
    private final int MAX_LIBROS = 100;

    public Catalogo() {
        libros = new Libro[MAX_LIBROS];
        contador = 0;
    }

    public boolean agregarLibro(Libro libro) {
        if (contador >= MAX_LIBROS || buscarIndicePorISBN(libro.getISBN()) != -1) {
            return false;
        }
        libros[contador++] = libro;
        return true;
    }

    public Libro buscarPorISBN(String ISBN) {
        int indice = buscarIndicePorISBN(ISBN);
        return (indice != -1) ? libros[indice] : null;
    }

    private int buscarIndicePorISBN(String ISBN) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getISBN().equals(ISBN)) {
                return i;
            }
        }
        return -1;
    }

    public boolean modificarTitulo(String ISBN, String nuevoTitulo) {
        Libro libro = buscarPorISBN(ISBN);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            return true;
        }
        return false;
    }

    public boolean eliminarLibro(String ISBN) {
        int indice = buscarIndicePorISBN(ISBN);
        if (indice == -1) return false;

        libros[indice] = libros[contador - 1];
        libros[--contador] = null;
        return true;
    }

    public void listarLibrosEscasos() {
        Libro[] filtrados = new Libro[contador];
        int filtradoContador = 0;
        for (int i = 0; i < contador; i++) {
            if (libros[i].getEjemplares() <= 2) {
                filtrados[filtradoContador++] = libros[i];
            }
        }

        for (int i = 0; i < filtradoContador - 1; i++) {
            for (int j = 0; j < filtradoContador - i - 1; j++) {
                if (filtrados[j].getTitulo().compareToIgnoreCase(filtrados[j + 1].getTitulo()) > 0) {
                    Libro temp = filtrados[j];
                    filtrados[j] = filtrados[j + 1];
                    filtrados[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < filtradoContador; i++) {
            System.out.println(filtrados[i].getTitulo() + " - Ejemplares: " + filtrados[i].getEjemplares());
        }
    }
}
