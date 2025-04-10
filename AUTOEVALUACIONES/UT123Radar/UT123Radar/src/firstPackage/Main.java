package firstPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sc Scanner; scanner = new Scanner(System.in);

        System.out.println("Distancia");
        int distancia = scanner.nextInt();
        System.out.println("Velocidad Maxima");
        int velocidadMaxima = scanner.nextInt();
        System.out.println("Tiempo");
        int tiempo = scanner.nextInt();


        Radar = (distancia, velocidadMaxima, tiempo);
        System.out.println(radar);
    }
}