public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};
    return x;
    }
    