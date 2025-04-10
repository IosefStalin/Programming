package Prin;

public class Main {
    private static final int N = 5;

    public static void main(String[] args) {
        int[][] tablero = new int[N][N];
        resolverReinas(tablero, 0);
    }

    private static boolean resolverReinas(int[][] tablero, int fila) {
        if (fila == N) {
            imprimirTablero(tablero);
            return true;
        }

        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1; 
                resolverReinas(tablero, fila + 1);
                tablero[fila][col] = 0; 
            }
        }
        return false;
    }

    private static boolean esSeguro(int[][] tablero, int fila, int col) {
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) return false;
        }

        for (int i = fila, j = col; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) return false;
        }

        for (int i = fila, j = col; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) return false;
        }

        return true;
    }

    private static void imprimirTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int celda : fila) {
                System.out.print(celda == 1 ? "Q " : "- ");
            }
            System.out.println();
        }
        System.out.println();
    }
}