package Principal;

//Clase Seno
public class Seno {
	private double angulo;
	private int numero;
	
	// Getters y Setters
	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Constructor sin argumentos
	public Seno() {
		this.angulo = 0.0;
		this.numero = 0;
	}

	// Método para calcular el factorial de un número
	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

	// Método para calcular el seno del ángulo usando la serie de Taylor
	public double calcularSeno(double angulo, int numeroTerminos) {
		double seno = 0.0;
		for (int i = 0; i < numeroTerminos; i++) {
			// Alternar el signo de los términos
			double termino = Math.pow(-1, i) * Math.pow(angulo, 2 * i + 1) / factorial(2 * i + 1);
			seno += termino;
		}
		return seno;
	}
}