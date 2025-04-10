package Principal;

//Clase principal
public class Main {
public static void main(String[] args) {
   Seno seno = new Seno();
   
   // Establecemos el ángulo y el número de términos
   seno.setAngulo(3.14159); // Ángulo en radianes
   seno.setNumero(25); // Número de términos
   
   // Calculamos el seno
   double resultado = seno.calcularSeno(seno.getAngulo(), seno.getNumero());
   
   // Mostramos el resultado
   System.out.println("El seno de " + seno.getAngulo() + " es aproximadamente: " + resultado);
}
}