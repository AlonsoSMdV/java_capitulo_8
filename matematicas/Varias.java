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
        if(x<0){

        }else if(x>0){
            int divisor=2;
            while(divisor++<=x/2){
                if(x%divisor==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean esPrimo(int x){
        return esPrimo((long)x);
    }

/*              Ej.3 siguientePrimo         */
    public static boolean siguientePrimo(long x){
        return true;
    }
    public static boolean siguientePrimo(int x){
        return siguientePrimo((long)x);
    
    }

/*              Ej.4 potencia               */
public static long potencia(long x){

    return potencia((long)x);
}
public static int potencia(int x){
    return (int)potencia((long)x);
}

/*              Ej.5 digitos                */
public static long digitos(long x){
    return digitos((long)x);
}
public static int digitos(int x){
    return (int)digitos((long)x);
}

/*              Ej.6 voltea                 */
public static long voltea(long x){
    long volteado = 0;
    for(int i = 0;i < x;i++){
        volteado = (volteado * 10) + (x % 10);
    }
    return voltea((long)x);
}
public static int voltea(int x){
    return (int)voltea((long)x);
}

/*              Ej.7  digitoN               */
public static long digitoN(long x){
    return digitoN((long)x);
}
public static int digitoN(int x){
    return (int)digitoN((long)x);
}

/*              Ej.8 posicionDeDigito       */
public static long posicionDeDigito(long x){
    return posicionDeDigito((long)x);
}
public static int posicionDeDigito(int x){
    return (int)posicionDeDigito((long)x);
}

/*              Ej.9 quitaPorDetras         */
    public static long quitarPorDetras(long x){
        return x/(long)potencia(10,n);
    }
    public static int quitarPorDetras(int x){
        return (int)quitarPorDetras((long)10,n);
    }

/*              Ej.10 quitaPorDelante       */
public static long quitaPorDelante(long x){
    return quitaPorDelante((long)x);
}
public static int quitaPorDelante(int x){
    return (int)quitaPorDelante((long)x);
}

/*              Ej.11 pegaPorDetras         */
public static long pegaPorDetras(long x){
    return pegaPorDetras((long)x);
}
public static int pegaPorDetras(int x){
    return (int)pegaPorDetras((long)x);
}

/*              Ej.12 pegaPorDelante        */
public static long pegaPorDelante(long x){
    return pegaPorDelante((long)x);
}
public static int pegaPorDelante(int x){
    return (int)pegaPorDelante((long)x);
}

/*              Ej.13 trozoDeNumero         */
public static long trozoDeNumero(long x){
return trozoDeNumero(x);
}
public static int trozoDeNumero(int x){
    return (int)trozoDeNumero((long)x);
}
/*              Ej.14  juntaNumeros         */
    public static long juntaNumeros(long x, long y){
        int longitud = (int)digitos(y);
        x =  x * (long) potencia(10, longitud) + y;
        return x;
    }
    public static int juntaNumeros(int x, int y){
        return (int)juntaNumeros((long) x, (long) y)
    }
}

