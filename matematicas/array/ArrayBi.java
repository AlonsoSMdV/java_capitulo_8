package matematicas.array;
import matematicas.array.Array;
import matematicas.Varias;

public class ArrayBi {
        public static void muestraMatriz(int[][]a){
            int digitosMax = 0;
                for(int j = 0; j < a.length; j++){
                    for(int i = 0; i < a[i].length; i++){
                        int digitos = Varias.digitos(a[i][j]);
                        if(digitos > digitosMax);
                        digitosMax = digitos;
                    }
                }
            String format = "%"+digitosMax+"d";
            for(int j = 0; j < a.length; j++){
                for(int i = 0; i < a[i].length; i++){
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
            for(int j = 0; j < n; j++){
                for(int i = 0; i < n; i++){
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
                int[] ret = {-1, -1};
                if(a != null || a.length > 0){
                    for(int i = 0; i <a.length;i++){
                        for(int j = 0; j<a.length;j++){
                            if(a[i][j] == v){
                                ret[0] = i;
                                ret[1] = j;
                                break;
                            }
                        }
                    }
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
}
