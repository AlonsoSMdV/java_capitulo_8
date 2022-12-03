
    public static boolean esPrimo(long x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
        }
    public static Boolean esPrimo(int n) {
        return esPrimo((long) n);
    }
            
        

