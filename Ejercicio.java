import matematicas.Varias;
public class Ejercicio {
    public static void main(String[] args) {
        // esCapicua //

        if (matematicas.Varias.esCapicua(976)) {
            System.out.println("El 976 es capicúa");
        }

        // esPrimo //
        if (matematicas.Varias.esPrimo(29)) {
            System.out.println("El 29 es primo");
        }
        if (matematicas.Varias.esPrimo(80)) {
            System.out.println("El 80 es primo");
        }

        // siguientePrimo //
        System.out.println("El siguiente primo mayor a 24 es " + matematicas.Varias.siguientePrimo(24));
        System.out.println("El siguiente primo mayor a 121 es " + matematicas.Varias.siguientePrimo(121));

        // potencia //
        System.out.println("2^10 = " + matematicas.Varias.potencia(2, 10));
        System.out.println("5^(-3) = " + matematicas.Varias.potencia(5, -3));
        System.out.println("10^6 = " + matematicas.Varias.potencia(10, 6));

        // digitos //
        System.out.println("El número 0 tiene " + matematicas.Varias.digitos(0) + " dígito/s.");
        System.out.println("El número 7 tiene " + matematicas.Varias.digitos(7) + " dígito/s.");
        System.out.println("El número 674893123 tiene " + matematicas.Varias.digitos(674893123) + " dígito/s.");

        // voltea //
        System.out.println("El 5 volteado es " + matematicas.Varias.voltea(5));
        System.out.println("El 398004321 volteado es " + matematicas.Varias.voltea(398004321));
        System.out.println("El -75839 volteado es " + matematicas.Varias.voltea(-75839));

        // digitoN //
        System.out.println("En la posición 3 del 1243645 está el " + matematicas.Varias.digitoN(1243645,3));

        // posicionDeDigito //
        System.out.println("En el 452262374, el dígito 6 está en la posición " + matematicas.Varias.posicionDeDigito(452262374, 6));

        // quitaPorDetras //
        System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda como " + matematicas.Varias.quitaPorDetras(1000, 1));

        // quitaPorDelante //
        System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + matematicas.Varias.quitaPorDelante(78604321, 4));

        // pegaPorDetras //
        System.out.println("Si al 567 se le pega por detrás el 1 da el " + matematicas.Varias.pegaPorDetras(567, 1));

        // pegaPorDelante //
        System.out.println("Si al 567 se le pega por delate el 1 da el " + matematicas.Varias.pegaPorDelante(567, 1));

        // trozoDeNumero //
        System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + matematicas.Varias.trozoDeNumero(78604000, 0, 3));

        // juntaNumeros //
        System.out.println("Juntando el 21 y el 40 da el " + matematicas.Varias.juntaNumeros(21, 40));
    }
}

