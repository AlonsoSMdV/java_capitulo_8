
import matematicas.array.ArrayBi;
import matematicas.array.Array;
public class Ejercicio29a34 {
    public static void main(String[] args) {
    int[][] a = ArrayBi.generaArrayBiInt(5, 8, 0, 100);
    ArrayBi.muestraMatriz(a);
    System.out.print("\nFila 2: ");
    Array.muestraArrayInt(ArrayBi.filaDeArrayBiInt(a, 2));
    System.out.print("\nColumna 6: ");
    Array.muestraArrayInt(ArrayBi.columnaDeArrayBiInt(a, 6));
    System.out.print("\nCoordenadas del 24 (fila, columna): ");
    Array.muestraArrayInt(ArrayBi.coordenadasEnArrayBiInt(a, 24));
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    ArrayBi.muestraMatriz(b);
    System.out.println("\nBusca los puntos de silla: ");
    for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 3; j++) {
    if (ArrayBi.esPuntoDeSilla(b, i, j)) {
    System.out.println("fila " + i + ", columna " + j + " -> " + b[i][j]);
    }
    } 
    } 
    
    ArrayBi.muestraMatriz(a);
    System.out.print("\nFila: ");
    int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Columna: ");
    int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Dirección (nose/neso): ");
    String direccion = System.console().readLine();
    System.out.print("\nDiagonal: ");
    Array.muestraArrayInt(ArrayBi.diagonal(a, fila, columna, direccion));
    }
}


