package matematicas;
public class Varias {
/*              Ej.1 esCapicua              */
    public static boolean esCapicua(long x){
        return x == voltea(x);
    }

    public static boolean esCapicua(int x){
        return esCapicua((long)x);
    }

/*              Ej.2 esPrimo                */
    public static boolean esPrimo(long x){
        if(x<2){
            return false;
        }else{
            ;
            for(int divisor = 2; divisor<(x);divisor++)
                if(x%divisor==0){
                    return false;
                }
            }
        
        return true;
    }
    public static boolean esPrimo(int x){
        return esPrimo((long)x);
    }

/*              Ej.3 siguientePrimo         */
    public static int siguientePrimo(int x){
        while (!esPrimo(++x)) {};
        return x;
    }

/*              Ej.4 potencia               */
public static  double potencia(int base, int exponente) {
    if (exponente == 0) {
    return 1;
    }
    if (exponente < 0) {
    return 1/potencia(base, -exponente);
    }
    int n = 1;
    for (int i = 0; i < Math.abs(exponente); i++) {
    n = n * base;
    }
    return n;
    }

/*              Ej.5 digitos                */
public static long digitos(long x) {
    if (x < 0) {
    x = -x;
    }
    if (x == 0) {
    return 1;
    } else {
    int n = 0;
    while (x > 0) {
    x = x / 10; // se le quita un dígito a x
    n++;
    }
    return n;
    }
    }
public static int digitos(int x){
    return (int)digitos((long)x);
}

/*              Ej.6 voltea                 */
public static long voltea(long x) {
    if (x < 0) {
    return -voltea(-x);
    }
    long volteado = 0;
    while(x > 0) {
    volteado = (volteado * 10) + (x % 10);
    x = x / 10;
    }
    return volteado;
    }
public static int voltea(int x){
    return (int)voltea((long)x);
}

/*              Ej.7  digitoN               */
public static long digitoN(long x, int n) {
    x = voltea(x);
    while (n-- > 0) {
    x = x / 10;
    }
    return (int)x % 10;
    }
    
public static int digitoN(int x, int n){
    return (int)digitoN((long)x, n);
}

/*              Ej.8 posicionDeDigito       */
public static long posicionDeDigito(long x, int d) {
    int i;
    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
    if (i == digitos(x)) {
    return -1;
    } else {
    return i;
    }
    }
public static int posicionDeDigito(int x, int d) {
    return (int)posicionDeDigito((long)x, d);
    }

/*              Ej.9 quitaPorDetras         */
public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
    }
public static int quitaPorDetras(int x, int n) {
    return (int)quitaPorDetras((long) x, n);
    }
    

/*              Ej.10 quitaPorDelante       */
public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); 
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
    }
public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
    }
    

/*              Ej.11 pegaPorDetras         */
public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
    }
    public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
    }

/*              Ej.12 pegaPorDelante        */
public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
    }
    public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
    }

/*              Ej.13 trozoDeNumero         */
public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = (int)digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
    }
    public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
    }
    
/*              Ej.14  juntaNumeros         */
    public static long juntaNumeros(long x, long y){
        int longitud = (int)digitos(y);
        x =  x * (long) potencia(10, longitud) + y;
        return x;
    }
    public static int juntaNumeros(int x, int y){
        return (int)juntaNumeros((long) x, (long) y);
    }

}

