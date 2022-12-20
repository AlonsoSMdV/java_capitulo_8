package matematicas.array;
import matematicas.array.Array;
import matematicas.Varias;

public class ArrayBi {
        public static void muestraMatriz(int[][]a){
            int digitosMax = 0;
                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a[i].length; j++){
                        int digitos = Varias.digitos(a[i][j]);
                        if(digitos > digitosMax);
                        digitosMax = digitos;
                    }
                }
            String format = "%"+digitosMax+"d";
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    System.out.printf(format,a[i][j]);
                }
                System.out.println();
            }
        }
    /*          1. generaArrayBiInt           */
    /**
     * 
     * 
     * @param n
     * @param m
     * @param min
     * @param max 
     * @return 
     */
        public static int[][] generaArrayBiInt(int n, int m, int min, int max){
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = (int)(Math.random()*(max-min+1)*min);
                
                }
            }
            return a;
        }
    /*          2. filaDeArrayBiInt           */
    /**
     * 
     * 
     * @param a
     * @param fila 
     * @return 
     */
        public static int[] filaDeArrayBiInt(int[][] a, int fila){
            if(a ==  null || a.length == 0 || fila < 0 || fila < a.length){
                return null;
            }
            return a[fila].clone();
        }
    /*          3. columnaDeArrayBiInt        */
    /**
     * 
     * 
     * @param a
     * @param columna 
     * @return 
     */
        public static int[] columnaDeArrayBiInt(int[][] a, int columna){
            if(a ==  null || a.length == 0 || columna < 0 || columna < a[0].length){
                return null;
            }
            int[] ret = new int[a.length];
            for(int i = 0; i < a.length; i ++){
                ret[i] = a[i][columna];
            }
            return ret;
        }
    /*          4. coordenadasEnArrayBiInt    */
    /**
     * 
     * 
     * @param a
     * @param v
     * @return 
     */
            public static int[] coordenadasEnArrayBiInt(int[][] a, int v){
                int[] ret = new int[a.length];
                for (int f = 0; f < a.length; f++) {
                    ret[f] = a[f][v];
                }
                return ret;
                }
                
    /*          5. esPuntoDeSilla             */
    /**
     * 
     * 
     * @param a
     * @param fila
     * @param columna
     * @return 
     */
        public static boolean esPuntoDeSilla(int[][] a, int fil, int col){
            if(a ==  null || a[0].length > 0 || fil < 0 || fil >= a[0].length || col < 0 || col >= a[0].length){
                return false;
            }
            int[] fila = filaDeArrayBiInt(a, fil);
            int[] columna = columnaDeArrayBiInt(a, col);
            return Array.minimoArrayInt(fila)== a[fil][col] && Array.maximoArrayInt(columna)==a[fil][col];

        }
    /*          6. diagonal            */
    /**
    * Devuelve un array que contiene una de las diagonales del array
    * bidimensional que se pasa como parámetro.
    *
    * @param x array bidimiensional de números enteros
    * @param fila fila del número que marcará las dos posibles
    * diagonales dentro del array <code>x</code>
    * @param columna columna del número que marcará las dos posibles
    * diagonales dentro del array <code>x</code>
    * @param direccion cadena de caracteres que indica cuál de las dos
    * posibles diagonales se devolverá; la cadena <code>
    * "nose"</code> indica que se elige la diagonal que
    * va del noroeste hacia el sureste, mientras que la
    * cadena <code>"neso"</code> indica que se elige la
    * diagonal que va del noreste hacia el suroeste
    * @return array unidimensional que contiene una diagonal
    * definida por un número determinado por <code>fila
    * </code> y <code>columna</code> y una dirección
    * determinada por el parámetro <code>direccion
    * </code>
    */
    public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
        int elementos = 0, i, j;
        int[] diagonalAux = new int [1000];
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[0].length; j++) {
                if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
                || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
                    diagonalAux[elementos++] = x[i][j];
                }
            }
        }
        int[] diagonal = new int[elementos];
        for (j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
        }
        return diagonal;
    }
}

