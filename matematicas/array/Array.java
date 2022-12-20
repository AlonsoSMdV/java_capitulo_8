package matematicas.array;

public class Array {
    public static void muestraArrayInt(int a[]) {
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        }
        System.out.println();
        }
        
    /*          1. generaArrayInt           */
        /**
* Crea un array y lo rellena con valores aleatorios dentro de un rango.
* <p>
* Por ejemplo, <code>generaArrayInt(100, 10, 30)</code> devolvería un array
* de 100 números generados al azar comprendidos entre 10 y 30.
*
* @param n número de elementos que contendrá el array
* @param minimo límite inferior del intervalo de números aleatorios
* @param maximo límite superior del intervalo de números aleatorios
* @return array relleno con valores aleatorios dentro del rango
* definido por <code>minimo</code> y <code>maximo</code>
*/
public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
    x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
    }
    return x;
    }
    
    /*          2. minimoArrayInt           */
/**
* Devuelve el mínimo (el número más pequeño) del array que se pasa como
* parámetro.
*
* @param a array unidimiensional de números enteros
* @return el número más pequeño encontrado en el array que se pasa como
* parametro
*/
public static int minimoArrayInt(int[] a) {
    int minimo = Integer.MAX_VALUE;
    for (int n : a) {
    if (n < minimo) {
    minimo = n;
    }
    }
    return minimo;
    }
    
    /*          3. maximoArrayInt           */
    /**
* Devuelve el máximo (el número más grande) del array que se pasa como
* parámetro.
*
* @param a array unidimiensional de números enteros
* @return el número más grande encontrado en el array que se pasa como
* parametro
*/
    public static int maximoArrayInt(int[] a) {
        int maximo = Integer.MIN_VALUE;
        for (int n : a) {
        if (n > maximo) {
        maximo = n;
        }
        }
        return maximo;
        }
    /*          4. mediaArrayInt            */
/**
* Devuelve la media aritmética de los números contenidos en el array que se
* pasa como parámetro.
*
* @param a array unidimiensional de números enteros
* @return media aritmética de los números contenidos en el array que se pasa
* como parámetro
*/
public static double mediaArrayInt(int[] a) {
    int suma = 0;
    for (int n : a) {
    suma += n;
    }
    return (double)suma / a.length;
    }
    /*          5. estaEnArrayInt           */
/**
* Nos dice si un determindado valor está o no dentro de un array de números
* enteros.
*
* @param a array unidimiensional de números enteros
* @param n números entero que se buscará dentro del array
* @return verdadero si <code>n</code> se encuentra en el array
* <code>x</code> en caso contrario.
*/
public static boolean estaEnArrayInt(int[] a, int n) {
    for (int numero : a) {
    if (numero == n) {
    return true;
    }
    }
    return false;
    }
    
    /*          6. posicionEnArray          */
/**
* Devuelve la posición (el índice) de la primera ocurrencia de un número
* dentro de un array.
*
* @param a array unidimiensional de números enteros
* @param n números entero que se buscará dentro del array
* @return posición (índice) de la primera ocurrencia del número
* <code>n</code> dentro del array <code>x</code> o -1 en caso de
* no encontrarse el número
*/
public static int posicionEnArrayInt(int[] a, int n) {
    for(int i = 0; i < a.length; i++) {
        if (a[i] == n) {
            return i;
        }
    }
    return -1;
    }
    
    /*          7. volteaArrayInt           */
/**
* Le da la vuelta a un array. Los primeros números estarán al final y
* viceversa.
*
* @param x array unidimiensional de números enteros
* @return array volteada con los primeros números al final y viceversa
*/
public static int[] volteaArrayInt(int[] a) {
    int[] x = new int[a.length];
    for(int i = 0; i < a.length; i++) {
    x[a.length - i - 1] = a[i];
    }
    return x;
    }
    
    /*          8. rotaDerechaArrayInt      */
/**
* Devuelve un array rotada posiciones a la derecha tomando
* como referencia el array que se pasa como parámetro. Los números que van
* saliendo por la derecha vuelven a entrar por la izquierda.
*
* @param x array unidimiensional de números enteros
* @param n número de movimientos (rotaciones hacia la derecha) a realizar
* @return array rotada posiciones a la derecha
*/
public static int[] rotaDerechaArrayInt(int[] a, int n) {
    int[] x = a.clone(); // clona en a el contenido de x
    int i;
    int aux;
    while (n-- > 0) {
    aux = x[x.length - 1];
    for(i = x.length - 1; i > 0; i--) {
    x[i] = x[i - 1];
    }
    x[0] = aux;
    }
    return x;
    }
    
    /*          9. rotaIzquierdaArrayInt    */
    /**
* Devuelve un array rotada <code>n</code> posiciones a la izquierda tomando
* como referencia el array que se pasa como parámetro. Los números que van
* saliendo por la izquierda vuelven a entrar por la derecha.
*
* @param x array unidimiensional de números enteros
* @param n número de movimientos (rotaciones hacia la izquierda) a realizar
* @return array rotada <code>n</code> posiciones a la izquierda
*/
public static int[] rotaIzquierdaArrayInt(int[] a, int n) {
    int[] x = a.clone(); // clona en a el contenido de x
    int i;
    int aux;
    while (n-- > 0) {
    aux = x[0];
    for(i = 0; i < x.length - 1; i++) {
    x[i] = x[i + 1];
    }
    x[a.length - 1] = aux;
    }
    return x;
    }
}
